package Sistema;

public class Comentario {

	public String cuerpo;
	
	
	public boolean esLargo(int x){
		if (this.cuerpo.length() > x) {
			return true;
		} else {
			return false;
		}
	}
	
}
