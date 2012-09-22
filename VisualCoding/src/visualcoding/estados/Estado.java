package visualcoding.estados;
import java.util.ArrayList;



//Esta es la clase padre que define las principales caracteristicas de cada estado
public class Estado {
	public Estado(){
		_EstadosSiguientes = new ArrayList<Estado>();
	}
	
	//Declaracion de atributos
	protected ArrayList<Estado> _EstadosSiguientes;
	
	//Define los siguientes estado a ejecutar
	public void setEstadoSiguiente(ArrayList<Estado> estadosSiguientes){
		_EstadosSiguientes = estadosSiguientes;
	}
	
	//Retorna los siguientes estados a ejecutar
	public ArrayList<Estado> getEstadosSiguientes(){
		return _EstadosSiguientes;
	}
	
	public void ejecutar(){
		
	}
		
}
