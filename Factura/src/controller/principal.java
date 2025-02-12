package controller;

import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		
		factura f = new factura ("ordenador", 100);
		factura f2 = new factura ("movil", 300);
		factura f3 = new factura ("impresora",200);
		factura f4 = new factura ("imac", 1500);

		List<factura>Lista = new ArrayList<factura>();
		Lista.add(f);
		Lista.add(f2);
		Lista.add(f3);
		Lista.add(f4);
        
		factura facturaFiltro=
		Lista.stream()
		.filter(elemeto->elemeto.getImportes()==300)
		.findFirst()
		.get();
		System.out.println(facturaFiltro.getImportes());
	    
	
		
		
	}

}
