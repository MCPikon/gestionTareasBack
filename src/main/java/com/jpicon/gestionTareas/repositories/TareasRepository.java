package com.jpicon.gestionTareas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpicon.gestionTareas.entities.Tarea;
import com.jpicon.gestionTareas.entities.Usuario;

public interface TareasRepository extends JpaRepository<Tarea, Integer>{

}
