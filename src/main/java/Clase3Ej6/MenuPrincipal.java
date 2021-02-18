package Clase3Ej6;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class MenuPrincipal {

    private itemmenu sel;
    // private itemmenu sel2;
    Abmcliente per = new Abmcliente();
    teclado tecla = new teclado();
    Abmpelicula peli = new Abmpelicula();
    cliente cli = new cliente();
    Pelicula mipelicula = new Pelicula();

    public void menuprincipal() {
        menu mimenu = new menu();
        mimenu.agregaritem("1", "ABM Clientes");
        mimenu.agregaritem("2", "ABM Peliculas");
        mimenu.agregaritem("3", "Listados");
        mimenu.agregaritem("4", "Salir del Programa");
        System.out.println("Ingrese su Opcion: ");
        mimenu.mostrar();
        sel = mimenu.getitemsel();

        // System.out.println("Sel paso con: "+ sel);// muestra como pasa sel
        int n = Integer.parseInt(sel.getId());
        switch (n) {
            case 1 ->
                menuclientes();
            case 2 ->
                menupeliculas();
            case 3 ->
                menulistados();
            case 4 ->
                System.out.println("Se cerro el programa");
        }
    }

    public void menuclientes() {
        String fin = "s";
        menu mimenu = new menu();
        mimenu.agregaritem("1", "Ingresar Cliente Nuevo");
        mimenu.agregaritem("2", "Eliminar Cliente");
        mimenu.agregaritem("3", "Modificar Datos de Cliente");
        mimenu.agregaritem("4", "Volver al menu Principal");
        System.out.println("Ingrese su Opcion: ");
        mimenu.mostrar();
        sel = mimenu.getitemsel();

        int n = Integer.parseInt(sel.getId());
        switch (n) {
            case 1 -> {
                while ((fin.equals("s")) || (fin.equals("S"))) {
                    per.agregarCliente(per.altacliente());
                    System.out.println("Desea Cargar otro Cliente? (N Para Salir / S Para Cargar otro Cliente)");
                    fin = tecla.pedirteclado();
                }
                System.out.println("");
                menuclientes();
            }
            case 2 -> {
                per.muestraclientes();
                while ((fin.equals("s")) || (fin.equals("S"))) {
                    per.eliminarCliente(per.bajacliente());
                    System.out.println("Desea Eliminar otro Cliente? (N Para Salir / S Para Eliminar otro Cliente)");
                    fin = tecla.pedirteclado();
                }
                System.out.println("");
                menuclientes();
            }
            case 3 -> {
                per.muestraclientes();
                while ((fin.equals("s")) || (fin.equals("S"))) {
                    per.modificarcliente(per.modificarcli());
                    System.out.println("Desea Modificar otro Cliente? (N Para Salir / S Para Modificar otro Cliente)");
                    fin = tecla.pedirteclado();
                }
                System.out.println("");
                menuclientes();
            }
            case 4 -> {
                System.out.println("");
                menuprincipal();
            }
        }
    }

    public void menupeliculas() {
        String fin = "s";

        menu mimenu = new menu();
        mimenu.agregaritem("1", "Ingresar Pelicula Nueva");
        mimenu.agregaritem("2", "Eliminar Pelicula");
        mimenu.agregaritem("3", "Modificar Datos de las Peliculas");
        mimenu.agregaritem("4", "Volver al menu Principal");
        System.out.println("Ingrese su Opcion: ");
        mimenu.mostrar();
        sel = mimenu.getitemsel();

        int n = Integer.parseInt(sel.getId());

        switch (n) {
            case 1 -> {
                while ((fin.equals("s")) || (fin.equals("S"))) {
                    peli.agregarPelicula(peli.altapelicula());
                    System.out.println("Desea Cargar otra Pelicula? (N Para Salir / S Para Cargar otra Pelicula)");
                    fin = tecla.pedirteclado();
                }
                System.out.println("");
                menupeliculas();
            }
            case 2 -> {
                peli.muestrapeliculas();
                while ((fin.equals("s")) || (fin.equals("S"))) {
                    peli.eliminarPelicula(peli.bajapelicula());
                    System.out.println("Desea eliminar otra Pelicula? (N Para Salir / S Para Eliminar otra Pelicula)");
                    fin = tecla.pedirteclado();
                }
                System.out.println("");
                menupeliculas();
            }
            case 3 -> {
                peli.muestrapeliculas();
                while ((fin.equals("s")) || (fin.equals("S"))) {
                    peli.modificarpelicula(peli.modificarpeli());
                    System.out.println("Desea modificar otra Pelicula? (N Para Salir / S Para Modificar otra Pelicula)");
                    fin = tecla.pedirteclado();
                }
                System.out.println("");
                menupeliculas();
            }
            case 4 -> {
                System.out.println("");
                menuprincipal();
            }
        }
    }

    public void menulistados() {

        menu mimenu = new menu();

        mimenu.agregaritem("1", "Listado de Clientes");
        mimenu.agregaritem("2", "Listado de Peliculas");
        mimenu.agregaritem("3", "Copias Disponibles / No implementado");
        mimenu.agregaritem("4", "Copias Alquiladas / No implementado");
        mimenu.agregaritem("5", "Ranking Peliculas mas Alquiladas / No implementado");
        mimenu.agregaritem("6", "Volver al Menu Principal");
        System.out.println("Ingrese su Opcion: ");
        mimenu.mostrar();
        sel = mimenu.getitemsel();

        int n = Integer.parseInt(sel.getId());
        switch (n) {
            case 1 -> {
                per.muestraclientes();
                System.out.println("");
                menulistados();
            }
            case 2 -> {
                peli.muestrapeliculas();
                System.out.println("");
                menulistados();
            }
            case 3 -> {
                System.out.println("");
                menulistados();
            }
            case 4 -> {
                System.out.println("");
                menulistados();
            }
            case 5 -> {
                System.out.println("");
                menulistados();
            }
            case 6 -> {
                System.out.println("");
                menuprincipal();
            }
        }
    }
}
