package com.formacionspring.app.appwebmvc.service;

import java.util.List;

import com.formacionspring.app.appwebmvc.entity.Empleado;

public interface EmpleadoService {
public List<Empleado> listarTodosLosEmpleados();
public Empleado guardarEmpleado(Empleado empleado);
public Empleado obtenerEmpleadoPorID(Long id);
public void eliminarEmpleado(Long id);
}
