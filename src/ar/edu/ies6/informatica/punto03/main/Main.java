package ar.edu.ies6.informatica.punto03.main;

import ar.edu.ies6.informatica.punto03.model.Provincia;
import ar.edu.ies6.informatica.punto03.util.AlmacenProvincia;
import ar.edu.ies6.informatica.punto03.util.Region;

public class Main {
    public static void main(String[] args) {
        // Agregar 10 provincias
        AlmacenProvincia.provincias.add(new Provincia(1, "Salta", Region.NOA, 1200, 1558, true));
        AlmacenProvincia.provincias.add(new Provincia(2, "Jujuy", Region.NOA, 7700, 5321, true));
        AlmacenProvincia.provincias.add(new Provincia(3, "Mendoza", Region.CUYO, 2000, 1488, true));
        AlmacenProvincia.provincias.add(new Provincia(4, "Santa Fe", Region.CENTRO, 3400, 1330, true));
        AlmacenProvincia.provincias.add(new Provincia(5, "Chubut", Region.PATAGONIA, 6000, 2246, true));
        AlmacenProvincia.provincias.add(new Provincia(6, "La Rioja", Region.NOA, 3800, 8968, false));
        AlmacenProvincia.provincias.add(new Provincia(7, "Corrientes", Region.NEA, 1200, 8819, false));
        AlmacenProvincia.provincias.add(new Provincia(8, "Misiones", Region.NEA, 1120, 2980, false));
        AlmacenProvincia.provincias.add(new Provincia(9, "Chaco", Region.NEA, 1140, 9963, false)); 
        AlmacenProvincia.provincias.add(new Provincia(10, "Neuquén", Region.PATAGONIA, 6400, 9407, false));

        // Mostrar provincias con estado true
        System.out.println("Provincias con estado 'true': ");
        for (Provincia p : AlmacenProvincia.provincias) {
            if (p.getEstado()) {
                System.out.println(p);
            }
        }
    }
}