package ar.edu.ies6.informatica.punto04.model;

import java.time.LocalDate;

import ar.edu.ies6.informatica.punto01.model.Producto;


public class Compra {
	  private String codigo;
	  private LocalDate fechaCompra;
	  private Producto producto;
	  private Integer cantidad;
	  
	public Compra(String codigo, LocalDate fechaCompra, Producto producto, Integer cantidad) {
		super();
		this.codigo = codigo;
		this.fechaCompra = fechaCompra;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public double calcularTotal() {
		return producto.getPrecioUnitario()*cantidad;
	}
	public void imprimirRecibo(){
		System.out.println("Recibo de Compra ");
        System.out.println("Código de Compra: " + codigo);
        System.out.println("Fecha de Compra: " + fechaCompra);
        System.out.println("Producto: " + producto.getDescripcion());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + producto.getPrecioUnitario());
        System.out.println("Total a Pagar: $" + calcularTotal());
        System.out.println("------------------------------");
		}
	
	}
