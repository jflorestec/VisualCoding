package visualcoding.estados;
import java.util.ArrayList;
import visualcoding.common.Objeto;
import visualcoding.common.MachotePropiedad;


/*Esta es la clase padre que define las principales caracteristicas de los 
estados que realizan alguna operacion*/
public class EstadoCalculador extends Estado {
	public EstadoCalculador(){
		_ListaObjetos = new ArrayList<Objeto>();
		_PropiedadesTrabajo = new ArrayList<Integer>();
		_MachotePropiedades = new ArrayList<MachotePropiedad>();
	}
	
	//Declaracion de atributos
	protected ArrayList<Objeto> _ListaObjetos;
	protected ArrayList<Integer> _PropiedadesTrabajo;
	protected ArrayList<MachotePropiedad> _MachotePropiedades;
	
	//Define los objetos a tomar en cuenta para calculos de la herramienta
	public void setObjetos(ArrayList<Objeto> listaObjetos){
		_ListaObjetos = listaObjetos;
	}
	
	//Retorna la lista de objetos actual que tiene el estado
	public ArrayList<Objeto> getObjetos(){
		return _ListaObjetos;
	}
	
	//Define la lista de objetos
	public void setMachotePropiedades(ArrayList<MachotePropiedad> machotePropiedades){
		_MachotePropiedades = machotePropiedades;
	}
	
	public ArrayList<MachotePropiedad> getMachotePropiedades(){
		return _MachotePropiedades;
	}
	
	public void setPropiedadesTrabajo(ArrayList<Integer> propiedadesTrabajo){
		_PropiedadesTrabajo = propiedadesTrabajo;
	}
	
	public ArrayList<Integer> getPropiedadesTrabajo(){
		return _PropiedadesTrabajo;
	}
	
}
