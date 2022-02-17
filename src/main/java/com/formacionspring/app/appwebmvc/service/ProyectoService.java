package com.formacionspring.app.appwebmvc.service;

import java.util.List;


import com.formacionspring.app.appwebmvc.entity.Proyecto;

public interface ProyectoService {
public List<Proyecto> listarTodosLosProyectos();
public Proyecto guardarProyecto(Proyecto proyecto);
public Proyecto obtenerProyectoPorID(Long id);
public void eliminarProyecto(Long id);
}
