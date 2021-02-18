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
import java.util.*;

public class Abmcliente {

    private ArrayList<cliente> m_clientes;

    public Abmcliente() {
        m_clientes = new ArrayList<cliente>();
    }

    public ArrayList<cliente> getM_clientes() {
        return m_clientes;
    }

    public void agregarCliente(cliente ingreso) {
        m_clientes.add(ingreso);
    }

    public void eliminarCliente(int indice) {
        if (indice >= 0) {
            m_clientes.remove(indice);
        }
    }

    public void modificarcliente(int i) {
        if (i >= 0) {
            System.out.println("Ingrese todos los datos del cliente a modificar");
            m_clientes.remove(i);
            m_clientes.add(i, altacliente());
        }
    }

    public cliente altacliente() {
        String ingreso;
        teclado tecla;
        cliente cli;

        tecla = new teclado();
        cli = new cliente();

        System.out.println("Ingrese El Nombre del Cliente: ");
        ingreso = tecla.pedirteclado();
        cli.setM_nombre(ingreso);

        System.out.println("Ingrese El Apellido del Cliente: ");
        ingreso = tecla.pedirteclado();
        cli.setM_apellido(ingreso);

        System.out.println("Ingrese la Direccion del Cliente: ");
        ingreso = tecla.pedirteclado();
        cli.setM_direccion(ingreso);

        System.out.println("Ingrese la localidad del Cliente: ");
        ingreso = tecla.pedirteclado();
        cli.setM_localidad(ingreso);

        System.out.println("Ingrese El codigo del Cliente: ");
        ingreso = tecla.pedirteclado();
        cli.setM_codigo(ingreso);

        return cli;
    }

    public int bajacliente() {
        int indice = -1;
        int i;
        teclado tecla = new teclado();
        String ingreso;

        System.out.println("Ingrese el codigo del cliente a eliminar");
        ingreso = tecla.pedirteclado();

        for (i = 0; i < m_clientes.size(); i++) {
            if (m_clientes.get(i).getM_codigo().equals(ingreso)) {
                indice = i;
            }
        }
        return indice;
    }

    public int modificarcli() {
        int indice = -1;
        int i;
        teclado tecla = new teclado();
        String ingreso;

        System.out.println("Ingrese el codigo del cliente a modificar");
        ingreso = tecla.pedirteclado();

        for (i = 0; i < m_clientes.size(); i++) {
            if (m_clientes.get(i).getM_codigo().equals(ingreso)) {
                indice = i;
            }
        }
        return indice;
    }

    public void muestraclientes() {
        int i;

        System.out.println("\nLISTADO GENERAL DE CLIENTES");
        for (i = 0; i < m_clientes.size(); i++) {
            System.out.println(m_clientes.get(i));
        }
        System.out.println("---------------------------");
    }
}
