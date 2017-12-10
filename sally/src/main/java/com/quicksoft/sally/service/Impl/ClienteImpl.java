package com.quicksoft.sally.service.Impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.mail.internet.MimeMessage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.quicksoft.sally.constants.InterfaceMessages;
import com.quicksoft.sally.entity.Cliente;
import com.quicksoft.sally.entity.Rol;
import com.quicksoft.sally.repository.ClienteRepository;
import com.quicksoft.sally.service.ClienteService;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;



@Service("clienteService")
public class ClienteImpl implements ClienteService, UserDetailsService{
	@Autowired
	@Qualifier("clienteRepository")
	private ClienteRepository clienteRepository;
	
	private JavaMailSender javaMailSender;
	private static final Log logger = LogFactory.getLog(ClienteImpl.class);
	
	@Autowired
	public ClienteImpl(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	@Override
	public Cliente registrarCliente(Cliente cliente) {
		logger.info("Registrando un cliente: "+System.currentTimeMillis());
		cliente.setEnabled(true);
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente modificarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarCliente(String correo) {
		return clienteRepository.findByCorreo(correo);
	}

	@Override
	public Cliente login(String correo, String contraseña) {
		logger.info("Login: "+correo+" pass: "+contraseña);
		return clienteRepository.findByCorreoAndContraseña(correo, contraseña);
	}

	@Override
	public int eliminarCliente(Integer idCliente) {
		return 0;
	}

	@Override
	public int modificarPassword(Integer idCliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int notificarRegistro(Cliente cliente) {
		//Thread safe
		 MimeMessagePreparator preparator = getMessagePreparator(cliente);
        
		 SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo(cliente.getCorreo());
	        msg.setFrom("soportesally2017@gmail.com");
	        msg.setSubject("Registro Sally");
	        msg.setText(
	            "Hola: " + cliente.getNombre()+ InterfaceMessages.MSG_Registro);
	        try{
	            javaMailSender.send(preparator);
	        }
	        catch (MailException ex) {
	            // simply log it and go on...
	            System.err.println(ex.getMessage());
	        }
		return 0;
	}
	
	 private MimeMessagePreparator getMessagePreparator(final Cliente cliente){
         
	        MimeMessagePreparator preparator = new MimeMessagePreparator() {
	 
	            public void prepare(MimeMessage mimeMessage) throws Exception {
	                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
	  
	                helper.setSubject("Sally Registro");
	                helper.setFrom("soportesally2017@gmail.com");
	                helper.setTo(cliente.getCorreo());
	                //helper.addAttachment("logo.png", new ClassPathResource("/static/img/email_1.jpg"));
	      
	                Map<String, Object> model = new HashMap<String, Object>();
	                model.put("nombre", cliente.getNombre());
	                model.put("contra", cliente.getContraseña());
	                model.put("correo", cliente.getCorreo());
	                 
	                String text = getFreeMarkerTemplateContent(model);//Use Freemarker or Velocity
	 
	                // use the true flag to indicate you need a multipart message
	                helper.setText(text, true);

	            }
	        };
	        return preparator;
	    }
	 
	 public String getFreeMarkerTemplateContent(Map<String, Object> model) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException{
	        StringBuffer content = new StringBuffer();
	        @SuppressWarnings("deprecation")
			Configuration configuration= new Configuration();
	        configuration.setClassForTemplateLoading(this.getClass(), "/email/");
	        Template template = configuration.getTemplate("registro.ftl");
	        try{
	         content.append(FreeMarkerTemplateUtils.processTemplateIntoString(template, model));
	         return content.toString();
	        }catch(Exception e){
	            System.out.println("Exception occured while processing fmtemplate:"+e.getMessage());
	        }
	        return "";
	    }

	 //Autenticacion
	@Override
	public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
		Cliente cliente = buscarCliente(correo);
		List<GrantedAuthority> authorities = buildAuthorities(cliente.getRoles());
		return buildUser(cliente, authorities);
	}
	
	private User buildUser(Cliente cliente, List<GrantedAuthority> authorities) {
		return new User(cliente.getCorreo(), cliente.getContraseña(), cliente.isEnabled(), 
				true, true, true, authorities);
	}
	private List<GrantedAuthority> buildAuthorities(List<Rol> roles){
		List<GrantedAuthority> permisos = new ArrayList<GrantedAuthority>();
		for(Rol rol:roles) {
			permisos.add(new SimpleGrantedAuthority(rol.getTipo()));
		}
		return permisos;
	}
}
