/*
 * Classe responsavel por implementar regras de negocios de manejamento de usuarios 
 * usando os insumos (criados na package util)
*/
package com.app.services;

import com.app.exceptions.UsuarioNAutorizado;
import com.app.model.Usuario;
import com.app.util.SQLAutentica;

public class ControleUsuario{
	
	 /* Autenticacao de usuarios
	 */ 
	public static void autenticaUsuario(Usuario usuario) throws UsuarioNAutorizado {
		if (!SQLAutentica.doAutentica(usuario)) throw new UsuarioNAutorizado();
	}
	

}

