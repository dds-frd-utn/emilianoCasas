package Sistema;

public class Intermedio extends Categoria{

	@Override
	public boolean verificarPtos(int ptos){
		if (ptos > 1000){
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	public int devolverPtos(){
		return 499;
	}
	
	
	public Categoria devolverCategoria(){
		Experto cat = new Experto();
		return cat;
	}
	
	public Post devolverPost(){
		Post pGenerico = new Post();
		return pGenerico;
	}
	
	
}
