package com.formacionspring.app.appwebmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.app.appwebmvc.dao.DepartamentoDao;
import com.formacionspring.app.appwebmvc.entity.Departamento;


@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	@Autowired
	private DepartamentoDao departamentoDao;

	@Override
	public List<Departamento> listarTodosLosDepartamentos() {
		// TODO Auto-generated method stub
		return departamentoDao.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDao.save(departamento);
	}

	@Override
	public Departamento obtenerDepartamentoPorID(Long id) {
		// TODO Auto-generated method stub
		return departamentoDao.findById(id).orElse(null);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		// TODO Auto-generated method stub
		departamentoDao.deleteById(id);
	}

}
