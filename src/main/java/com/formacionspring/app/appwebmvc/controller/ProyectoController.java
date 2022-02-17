package com.formacionspring.app.appwebmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.formacionspring.app.appwebmvc.entity.Empleado;
import com.formacionspring.app.appwebmvc.entity.Proyecto;
import com.formacionspring.app.appwebmvc.service.ProyectoService;

@Controller
public class ProyectoController {
	
	@Autowired
	private ProyectoService servicio;
	@GetMapping({"/proyectos","/"})
	public String listarProyectos(Model model) {
		model.addAttribute("proyectos",servicio.listarTodosLosProyectos());
		return "proyecto";
	}
	
	@GetMapping("/proyectos/nuevo")
	public String formularioProyecto(Model modelo) {
		Proyecto newProyecto=new Proyecto();
		modelo.addAttribute("proyectoKey", newProyecto);
		return "nuevo_Proyecto";
	}
	
	@PostMapping("/proyecto")
	public String guardarProyecto(@ModelAttribute("proyectoKey") Proyecto proyecto) {
		servicio.guardarProyecto(proyecto);
		return "redirect:/proyectos";
	}
	
	@GetMapping("proyecto/editar/{id}")
	public String formulalrioEdicionProyecto(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("empleadoKey", servicio.obtenerProyectoPorID(id));
		return "editar_proyecto";
	}
	
	@PostMapping("/proyecto/editar/{id}")
	public String editarEmpleado(@PathVariable Long id, @ModelAttribute("proyectoKey") Proyecto proyecto) {
		Proyecto proyectoEdit=servicio.obtenerProyectoPorID(id);
		proyectoEdit.setNombre(proyecto.getNombre());
		proyectoEdit.setFechaActivo(proyecto.getFechaActivo());
		return "redirect:/proyectos";
	}
	

}
