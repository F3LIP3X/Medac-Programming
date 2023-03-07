package Ejer2Arrays;

import java.util.ArrayList;

public class discoDuro {
	
	private ArrayList<archivo> dD;
	private int capacidad;
	private int ocupado;
	
	public discoDuro(int capacidad) {
		dD = new ArrayList<archivo>();
		this.capacidad = capacidad;
		this.ocupado = 0;
	}
	
	public String GuardarArchivo(archivo archivito) {
		if((capacidad - ocupado)>=archivito.getTamaño()) {
			dD.add (archivito);
			ocupado+=archivito.getTamaño();
			return "El archivo se ha guardado correctamente";
		}
		return "El dispositivo de almacenamiento esta lleno";
	}
	
	public String eliminarArchivo (archivo archivito) {
		if (dD.contains (archivito)) {
			ocupado-=archivito.getTamaño();
			dD.remove (dD.indexOf (archivito));
		}
		else {
			return archivito.getNombre() + " no se encuentra en el disco duro";
		}
		return "Se han eliminado correctamente: " + archivito.getTamaño() + " mb";
	}
	
	public void formatearDisco() {
		dD.clear();
		ocupado=0;
	}
	
	public String listarContenido() {
		String resultado = "archivos en el disco duro: \n";
		
		for (archivo a : dD)
			resultado += a.toString() + "\n";
		return resultado;
	}
	
	//get capacidad 
	
	//public int getCapacidad() {
		//return this.capacidad;
	//}
}
