package com.formacionspring.app.appwebmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.app.appwebmvc.dao.EmpleadoDao;
import com.formacionspring.app.appwebmvc.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	@Autowired
	private EmpleadoDao empleadoDao;

	@Override
	public List<Empleado> listarTodosLosEmpleados() {
		return empleadoDao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.save(empleado);
	}

	

	@Override
	public Empleado obtenerEmpleadoPorID(Long id) {
		// TODO Auto-generated method stub
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		empleadoDao.deleteById(id);
		
	}
}
