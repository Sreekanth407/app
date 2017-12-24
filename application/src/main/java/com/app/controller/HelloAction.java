/*
 * HelloWorld! Classe para testar apenas. 
 * 
*/
package com.app.controller;

import java.util.List;

import org.hibernate.Session;

import com.app.model.Usuario;
import com.app.util.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends BaseAction{
	
	public String execute(){
		System.out.println("Teste");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Teste");
		
		HibernateUtil.persist(usuario);
		
		
		return "success";
	}

}
