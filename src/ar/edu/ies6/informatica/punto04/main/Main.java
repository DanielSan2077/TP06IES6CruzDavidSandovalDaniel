package ar.edu.ies6.informatica.punto04.main;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto01.model.Producto;
import ar.edu.ies6.informatica.punto01.util.Categoria;
import ar.edu.ies6.informatica.punto01.util.ListadoProductos;
import ar.edu.ies6.informatica.punto01.util.OrigenFabricacion;
import ar.edu.ies6.informatica.punto04.model.Compra;
import ar.edu.ies6.informatica.punto04.util.AlmacenDeCompras;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListadoProductos.almacenProducto.add(new Producto("P001", "Teléfono Celular", 30000.0, OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA));
	    ListadoProductos.almacenProducto.add(new Producto("P002", "Laptop", 150000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
	    ListadoProductos.almacenProducto.add(new Producto("P003", "Aspiradora", 8000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
	    ListadoProductos.almacenProducto.add(new Producto("P004", "Taladro", 12000.0, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
	    ListadoProductos.almacenProducto.add(new Producto("P005", "Tablet", 25000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
	    ListadoProductos.almacenProducto.add(new Producto("P006", "Televisor LED", 60000.0, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR));
	    ListadoProductos.almacenProducto.add(new Producto("P007", "Cámara Fotográfica", 40000.0, OrigenFabricacion.BRASIL, Categoria.TELEFONIA));
	    ListadoProductos.almacenProducto.add(new Producto("P008", "Impresora 3D", 85000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
	    ListadoProductos.almacenProducto.add(new Producto("P009", "Cafetera Eléctrica", 70000.0, OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR));
	    ListadoProductos.almacenProducto.add(new Producto("P010", "Sierra Circular", 15000.0, OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS));
	    
	    AlmacenDeCompras.compras[0]= new Compra("10",LocalDate.now(),ListadoProductos.almacenProducto.get(1),4);
	    AlmacenDeCompras.compras[1]= new Compra("11",LocalDate.now(),ListadoProductos.almacenProducto.get(5),2);
	    AlmacenDeCompras.compras[2]= new Compra("12",LocalDate.now(),ListadoProductos.almacenProducto.get(8),1);
	    
	    for (Compra compra:AlmacenDeCompras.compras) {
			compra.imprimirRecibo(); 
	}
	}
}
