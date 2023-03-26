package com.jpicon.gestionTareas.repositories;

import java.util.List;

import com.jpicon.gestionTareas.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jpicon.gestionTareas.entities.Tarea;
import org.springframework.stereotype.Repository;

@Repository
public interface TareasRepository extends JpaRepository<Tarea, Integer>{

    List<Tarea> findByUsuario_Id(int id);

}
