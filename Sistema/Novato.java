package Sistema;

public class Novato extends Categoria{

	public Post devolverPost(){
		Post pGenerico = new Post();
		return pGenerico;
	}
	
	public int devolverPtos(){
		return 0; 
	}
	
	public boolean verificarPtos(int ptos){
		if (ptos >= 100){
			return true;
		} else {
			return false;
		}
	}
	
	public Categoria devolverCategoria(){
		Intermedio cat = new Intermedio();
		return cat;
	}
	
}
