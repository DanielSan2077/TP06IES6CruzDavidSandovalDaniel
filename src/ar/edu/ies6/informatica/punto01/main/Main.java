package ar.edu.ies6.informatica.punto01.main;

import ar.edu.ies6.informatica.punto01.model.Producto;
import ar.edu.ies6.informatica.punto01.util.Categoria;
import ar.edu.ies6.informatica.punto01.util.ListadoProductos;
import ar.edu.ies6.informatica.punto01.util.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListadoProductos.almacenProducto.add(new Producto("P001", "Teléfono Celular", 30000.0, OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA));
ListadoProductos.almacenProducto.add(new Producto("P002", "Laptop", 150000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
ListadoProductos.almacenProducto.add(new Producto("P003", "Aspiradora", 8000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
ListadoProductos.almacenProducto.add(new Producto("P004", "Taladro", 12000.0, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
ListadoProductos.almacenProducto.add(new Producto("P005", "Tablet", 25000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));

//Mostrar por indice
int tamaño= ListadoProductos.almacenProducto.size();
System.out.println("El almacen tiene: "+tamaño+" productos");

for (int i=0; i<tamaño;i++) {
    System.out.println(ListadoProductos.almacenProducto.get(i).toString());
	}
 }
}

