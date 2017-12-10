<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Sending Email with Freemarker HTML Template Example</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            font-size: 48px;
        }
    </style>
</head>
<body style="margin: 0; padding: 0;">

    <table align="center" border="0" cellpadding="0" cellspacing="0" width="600" style="border-collapse: collapse;">
        <tr>
            <td align="center" bgcolor="#1ab394" style="padding: 40px 0 30px 0; 
            color: white; font-family:'Roboto', sans-serif; font-weight: lighter; ">
               <h1>Sally | Tú Asistente de Decisiones</h1>
               <i>Piensa uno, piensa dos, piensa Sally</i>
            </td>
        </tr>
        <tr>
            <td bgcolor="#eaeaea" style="padding: 40px 30px 40px 30px;">
                <p>Hola ${nombre},</p>
                <p style="line-height: 1.5em; color: #2f4050;">Sally te da la bienvenida al mejor asistente de toma de decisiones donde encontrarás expertos que te ayudarán 
                a mejorar casí cualquier decisión que tome, no olvides que puedes escribirnos por cualquier duda que tengas.</p>
                <p>Gracias</p>
            </td>
        </tr>
        <tr>
            <td bgcolor="#2f4050" style="padding: 30px 30px 30px 30px; color:white;">
                <p style="color: white !important;">Correo: ${correo}</p>
                <p>Contraseña: ${contra}</p>
                <p><i>¡Todas tus contraseñas serán cifradas por seguridad!</i></p>
            </td>
        </tr>
    </table>

</body>
</html>