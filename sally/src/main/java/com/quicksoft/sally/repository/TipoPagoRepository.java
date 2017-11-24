package com.quicksoft.sally.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quicksoft.sally.entity.TipoPago;

@Repository("tipoPagoRepository")
public interface TipoPagoRepository extends JpaRepository<TipoPago, Serializable>{

}
