package com.quicksoft.sally.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quicksoft.sally.entity.Plantilla;

@Repository("plantillaRepository")
public interface PlantillaRepository extends JpaRepository<Plantilla, Serializable>{

}
