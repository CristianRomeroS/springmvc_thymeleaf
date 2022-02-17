package com.formacionspring.app.appwebmvc.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.app.appwebmvc.entity.Proyecto;

@Repository
public interface ProyectoDao extends JpaRepository <Proyecto,Long>{

}
