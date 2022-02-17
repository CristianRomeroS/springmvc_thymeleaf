package com.formacionspring.app.appwebmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.app.appwebmvc.dao.EmpleadoDao;
import com.formacionspring.app.appwebmvc.dao.ProyectoDao;
import com.formacionspring.app.appwebmvc.entity.Empleado;
import com.formacionspring.app.appwebmvc.entity.Proyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService{
	@Autowired
	private ProyectoDao proyectoDao;

	@Override
	public List<Proyecto> listarTodosLosProyectos() {
		// TODO Auto-generated method stub
		return proyectoDao.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return proyectoDao.save(proyecto);
	}

	@Override
	public Proyecto obtenerProyectoPorID(Long id) {
		// TODO Auto-generated method stub
		return proyectoDao.findById(id).orElse(null);
	}

	@Override
	public void eliminarProyecto(Long id) {
		// TODO Auto-generated method stub
		proyectoDao.deleteById(id);
	}


}
