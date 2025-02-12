package controller;

public class factura {

	public String nombre;
	public int importes;
	

	public factura(String nombre, int importes) {
		super();
		this.nombre = nombre;
		this.importes = importes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getImportes() {
		return importes;
	}


	public void setImportes(int importes) {
		this.importes = importes;
	}
	
	

}
