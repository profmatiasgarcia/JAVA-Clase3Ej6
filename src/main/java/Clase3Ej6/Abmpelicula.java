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
import java.util.ArrayList;

public class Abmpelicula {

    private ArrayList<Pelicula> m_peliculas;
    
    public Abmpelicula() {
        m_peliculas = new ArrayList<Pelicula>();
    }

    public void agregarPelicula(Pelicula ingreso) {
        m_peliculas.add(ingreso);
    }

    public void eliminarPelicula(int indice) {
        if (indice >= 0) {
            m_peliculas.remove(indice);
        }
    }

    public ArrayList<Pelicula> getPeliculas() {
        return m_peliculas;
    }

    public void modificarpelicula(int i) {
        if (i >= 0) {
            System.out.println("Ingrese todos los datos de la pelicula a modificar");
            m_peliculas.remove(i);
            m_peliculas.add(i, altapelicula());
        }
    }

    public Pelicula altapelicula() {
        String ingreso;
        teclado tecla = new teclado();
        Pelicula peli = new Pelicula();

        System.out.println("Ingrese El Nombre de la Pelicula: ");
        ingreso = tecla.pedirteclado();
        peli.setM_titulo(ingreso);

        System.out.println("Ingrese El Actor principal: ");
        ingreso = tecla.pedirteclado();
        peli.setM_acPrinc(ingreso);

        System.out.println("Ingrese el director de la Pelicula: ");
        ingreso = tecla.pedirteclado();
        peli.setM_director(ingreso);

        System.out.println("Ingrese el año de estreno de la Pelicula: ");
        ingreso = tecla.pedirteclado();
        peli.setM_years(ingreso);

        System.out.println("Ingrese El tipo de la Pelicula: ");
        ingreso = tecla.pedirteclado();
        peli.setM_tipo(ingreso);

        System.out.println("Ingrese el codigo de la Pelicula: ");
        ingreso = tecla.pedirteclado();
        peli.setM_codigo(ingreso);

        System.out.println("Ingrese El genero de la Pelicula: ");
        ingreso = tecla.pedirteclado();
        peli.setM_genero(ingreso);

        System.out.println("Ingrese el Stock de la Pelicula: ");
        ingreso = tecla.pedirteclado();
        peli.setM_stock(ingreso);

        System.out.println("Ingrese si la Pelicula es estreno o no S(si)/ N(no): ");
        ingreso = tecla.pedirteclado();
        peli.setM_esEstreno(ingreso);

        return peli;
    }

    public int bajapelicula() {
        int indice = -1;
        int i;
        teclado tecla = new teclado();
        String ingreso;

        System.out.println("Ingrese el codigo de la pelicula a eliminar");
        ingreso = tecla.pedirteclado();

        for (i = 0; i < m_peliculas.size(); i++) {
            if (m_peliculas.get(i).getM_codigo().equals(ingreso)) {
                indice = i;
            }
        }
        return indice;
    }

    public int modificarpeli() {
        int indice = -1;
        int i;
        teclado tecla = new teclado();
        String ingreso;

        System.out.println("Ingrese el codigo de la pelicula a modificar");
        ingreso = tecla.pedirteclado();

        for (i = 0; i < m_peliculas.size(); i++) {
            if (m_peliculas.get(i).getM_codigo().equals(ingreso)) {
                indice = i;
            }
        }
        return indice;

    }

    public void muestrapeliculas() {
        int i;

        System.out.println("\nLISTADO GENERAL DE PELICULAS");
        for (i = 0; i < m_peliculas.size(); i++) {
            System.out.println(m_peliculas.get(i));
        }
        System.out.println("------------------------------");
    }
}
