package com.quicksoft.sally.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quicksoft.sally.entity.Compra;

@Repository("compraRepository")
public interface CompraRepository extends JpaRepository<Compra, Serializable>{

}
