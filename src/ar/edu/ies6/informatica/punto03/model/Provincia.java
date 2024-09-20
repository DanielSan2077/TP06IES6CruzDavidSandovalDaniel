package ar.edu.ies6.informatica.punto03.model;

import ar.edu.ies6.informatica.punto03.util.Region;

public class Provincia {
    private int identificador;
    private String nombre;
    private Region region;
    private int poblacion;
    private double superficie;
    private boolean estado;

    public Provincia(int identificador, String nombre, Region region, int poblacion, double superficie, boolean estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.region = region;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.estado = estado;
    }

    // Metodo para calcular la densidad
    public double calcularDensidadPoblacional() {
        return poblacion / superficie;
    }

    public boolean getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "ID: " + identificador + 
        	   ", Nombre: " + nombre + 
               ", Región: " + region + 
               ", Población: " + poblacion + 
               ", Superficie: " + superficie + " km²" + 
               ", Densidad: " + calcularDensidadPoblacional() + " hab/km²";
    }

}
