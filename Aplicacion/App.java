package Aplicacion;

import java.util.ArrayList;
import java.util.List;


import Sistema.Usuario;

public class App {

	public List<Usuario> usuarios = new ArrayList<Usuario> ();
	
	public int cantidadUsuariosPromovibles(){
		int cantidadUsuariosPromovibles = 0;
		for (int i=0; i<usuarios.size(); i++){
			if ( (usuarios.get(i)).esPromovible() ) {
				cantidadUsuariosPromovibles = cantidadUsuariosPromovibles + 1;
		}
		}
		return cantidadUsuariosPromovibles;
	}
	
	public void recategorizar(){
		for (int i=0; i<usuarios.size();i++){
			usuarios.get(i).recategorizar();
		}
	}
	
}
