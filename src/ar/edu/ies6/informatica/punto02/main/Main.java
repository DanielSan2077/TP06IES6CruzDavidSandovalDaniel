package ar.edu.ies6.informatica.punto02.main;

import java.util.ArrayList;

import ar.edu.ies6.informatica.punto02.model.Efemeride;
import ar.edu.ies6.informatica.punto02.util.AlmacenEfemeride;
import ar.edu.ies6.informatica.punto02.util.Mes;

public class Main {
    public static void main(String[] args) {

        // Añadir 5 objetos 
        AlmacenEfemeride.efemerides.add(new Efemeride(1, "Día de la Independencia", Mes.JULIO, 9, "Celebración de la independencia"));
        AlmacenEfemeride.efemerides.add(new Efemeride(2, "Día del Trabajador", Mes.MAYO, 1, "Día internacional del trabajo"));
        AlmacenEfemeride.efemerides.add(new Efemeride(3, "Navidad", Mes.DICIEMBRE, 25, "Celebración navideña"));
        AlmacenEfemeride.efemerides.add(new Efemeride(4, "Año Nuevo", Mes.ENERO, 1, "Comienzo de un nuevo año"));
        AlmacenEfemeride.efemerides.add(new Efemeride(5, "Día de la Bandera", Mes.JUNIO, 20, "Conmemoración de la bandera nacional"));

        // Mostrar las 5 
        System.out.println("Lista de efemerides:");
        for (Efemeride e : AlmacenEfemeride.efemerides) {
            System.out.println(e);
        }

        // Eliminar la tercera
        AlmacenEfemeride.efemerides.remove(2);

        // Modificar la segunda
        Efemeride segundaEfemeride = AlmacenEfemeride.efemerides.get(1);
        segundaEfemeride.setNombre("San Valentin");
        segundaEfemeride.setDetalle("Dia del amor y la amistad");

        // Mostrar restantes
        System.out.println("\nLista de efemerides después de las modificaciones:");
        for (Efemeride e : AlmacenEfemeride.efemerides) {
            System.out.println(e.getNombre()+" "+ e.getDia()+" de "+ e.getMes());
        }
    }
}