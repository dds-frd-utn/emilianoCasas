package Sistema;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Usuario {

	
	public List<Post> posts = new ArrayList<Post> ();
	public String nombre;
	public Categoria categoria;
	public int puntaje;
	
	public Usuario(String nombre){
		this.nombre = nombre;
		this.categoria = new Novato();
	}
	
	public Post Postear(){
		Post p = (this.categoria).devolverPost();
		p.titulo = JOptionPane.showInputDialog("Ingresar titulo del post");
		p.contenido = JOptionPane.showInputDialog("Ingresar contenido del post");
		this.posts.add(p);
		return p;
    }
	
	public int puntaje(){
		int puntaje = 0;
		for (int i=0; i< posts.size(); i++){
			puntaje = puntaje + (posts.get(i)).valor();
		}
		this.puntaje = puntaje;
		return puntaje;
	}
	
	public boolean sosNuevo(){
		int a = 0;
		for (int i=0; i<posts.size(); i++){
			if ((posts.get(i).comentario).isEmpty()){
				a++;
			}
		}
		if (a == 0){
			return false;
		} else {
			return true;
		}
	 }
	
	public void reconocer(){
		
		for (int i = 0; i<posts.size(); i++){
			if (((posts.get(i)).comentario.size()) > 5) {
				posts.get(i).puntos = posts.get(i).puntos * 2;
			}
		}
		
	}
	
	public Post postMasExitoso(){
		int maxPuntos = 0;
		int posicion = 0;
		for (int i = 0; i<posts.size(); i++){
			if ((posts.get(i).puntos) > maxPuntos){
				posicion = i;
			}
		}
		return posts.get(posicion);
	}
	
	public int cantidadPostInteresantes(){
		int cantidadPostsInteresantes = 0;
		for (int i = 0; i<posts.size(); i++) {
			if ((posts.get(i)).esInteresante()){
				cantidadPostsInteresantes = cantidadPostsInteresantes + 1;
			}
		}
		return cantidadPostsInteresantes; 
		
	}
	
	public boolean verificarPostPromover(){
		int a = 0;
		int ptos = categoria.devolverPtos();
		for (int i = 0; i<posts.size(); i++) {
			if ((posts.get(i)).puntos >= ptos){
				a++;
			}
		}
		
		if (a == 0){
			return false;
		} else {
			return true;
		}

	}
	
	public boolean esPromovible(){
	
		if (this.verificarPostPromover()) {
			if (this.categoria.verificarPtos(this.puntaje)){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
	
	
	
	public void recategorizar(){
		
		if ( this.esPromovible() ) {
			this.categoria = (this.categoria).devolverCategoria();
		}
		
	}
	
	
	
	
	
	
	
}

























