package com.jpicon.gestionTareas.repositories;

import java.util.Date;
import java.util.List;

import com.jpicon.gestionTareas.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jpicon.gestionTareas.entities.Tarea;
import org.springframework.stereotype.Repository;

@Repository
public interface TareasRepository extends JpaRepository<Tarea, Integer>{

    List<Tarea> findByUsuario_Id(int id);
    List<Tarea> findByFechaLimiteBetweenAndUsuario_Id(Date fechaLimiteStart, Date fechaLimiteEnd, int id);
    List<Tarea> findByEstadoAndUsuario_Id(String estado, int id);
    boolean existsById(int id);

}
