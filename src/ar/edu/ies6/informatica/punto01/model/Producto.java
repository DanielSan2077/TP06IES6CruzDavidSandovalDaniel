package ar.edu.ies6.informatica.punto01.model;

import ar.edu.ies6.informatica.punto01.util.Categoria;
import ar.edu.ies6.informatica.punto01.util.OrigenFabricacion;

public class Producto {
	  private String codigo;
	  private String descripcion;
	  private Double precioUnitario;
	  private OrigenFabricacion origenFabricacion;
	  private Categoria categoria;
	  
	  // Constructor
	  
	  public Producto(String codigo, String descripcion, double precioUnitario, OrigenFabricacion origenFabricacion, Categoria categoria) {
	      this.codigo = codigo;
	      this.descripcion = descripcion;
	      this.precioUnitario = precioUnitario;
	      this.origenFabricacion = origenFabricacion;
	      this.categoria = categoria;
	  }

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public OrigenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", origenFabricacion=" + origenFabricacion + ", categoria=" + categoria + "]";
	}
	  
}

