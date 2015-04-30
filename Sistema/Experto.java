package Sistema;

public class Experto extends Categoria{
	
	@Override
	public PostPremiun devolverPost(){
		PostPremiun pGenerico = new PostPremiun();
		return pGenerico;
	}
	
	@Override
	public boolean verificarPtos(int ptos){
		return false; //Por que ya esta promovido
	}
	
	public int devolverPtos(){
		return 0;
	}
	
    public Categoria devolverCategoria(){
    	Experto pGenerico = new Experto();
    	return pGenerico;
    	
    }
	
	

}
