package visualcoding.estados;
import visualcoding.common.MachotePropiedad;

//Esta clase se encarga de ejecutar la logica de la herramienta New 
public class CreadorDeObjetos extends EstadoCalculador{
	public void ejecutar(){}
	
	public void insertarMachotePropiedad(MachotePropiedad machotePropiedad){
		_MachotePropiedades.add(machotePropiedad);
	}
	 
}
