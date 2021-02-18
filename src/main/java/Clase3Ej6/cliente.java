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
import java.util.Date;

public class cliente {

    private String m_nombre;
    private String m_apellido;
    private String m_direccion;
    private String m_localidad;
    private Date m_falta;
    private String m_codigo;

    public String getM_apellido() {
        return m_apellido;
    }

    public void setM_apellido(String m_apellido) {
        this.m_apellido = m_apellido;
    }

    public String getM_codigo() {
        return m_codigo;
    }

    public void setM_codigo(String m_codigo) {
        this.m_codigo = m_codigo;
    }

    public String getM_direccion() {
        return m_direccion;
    }

    public void setM_direccion(String m_direccion) {
        this.m_direccion = m_direccion;
    }

    public Date getM_falta() {
        return m_falta;
    }

    public void setM_falta(Date m_falta) {
        this.m_falta = m_falta;
    }

    public String getM_localidad() {
        return m_localidad;
    }

    public void setM_localidad(String m_localidad) {
        this.m_localidad = m_localidad;
    }

    public String getM_nombre() {
        return m_nombre;
    }

    public void setM_nombre(String m_nombre) {
        this.m_nombre = m_nombre;
    }

    @Override
    public String toString() {
        return this.m_codigo + " - " + this.m_apellido + ", " + this.m_nombre;
    }

}
