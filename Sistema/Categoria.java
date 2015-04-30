package Sistema;

public abstract class Categoria {

	public abstract Post devolverPost();
	public  abstract int devolverPtos();
	public abstract boolean verificarPtos(int ptos);
	public abstract Categoria devolverCategoria();
	
}
