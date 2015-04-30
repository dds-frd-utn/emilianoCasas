package Sistema;

import java.util.ArrayList;
import java.util.List;

public class Post {

	public List<Comentario> comentario = new ArrayList<Comentario> ();
	public String titulo;
	public String contenido;
	public int puntos;
	
	public Post(){
		this.puntos = 0;
	}
	
	
	public void comentar(String comentario){
		Comentario c = new Comentario ();
		c.cuerpo = comentario;
		this.comentario.add(c);
	}
	
	public void puntuar(int puntos){
		this.puntos = puntos;
	}
	
	public int valor(){
		return (comentario.size() + this.puntos);
	}
	
	public int devolverLongitud(){
		return 100;
	}
	
	public boolean esInteresante(){
		int comentariosLargos = 0;
		int x = this.devolverLongitud();
		for (int i = 0; i<comentario.size(); i++){
			
			if (comentario.get(i).esLargo(x)){
				comentariosLargos = comentariosLargos + 1;
			}
		}
		
			if (comentariosLargos > 20) {
				
				if (this.puntos>50) 
					return true;
				 else 
					return false;
				
			} else {
				return false;
			}
			
			
		}
		
		
	 
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

