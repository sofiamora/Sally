package com.quicksoft.sally.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quicksoft.sally.entity.Direccion;

@Repository("direccionRepository")
public interface DireccionRepository extends JpaRepository<Direccion, Serializable>{

}
