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
import java.sql.Date;

public class Alquiler {

    private Integer m_codigo;
    private Date m_fentrega;
    private Date m_fdevolucion;
    private String m_formato;

    public void setCodigo(Integer codigo) {
        m_codigo = codigo;
    }

    public Integer getCodigo() {
        return m_codigo;
    }

    public void setfentrega(Date entrega) {
        m_fentrega = entrega;
    }

    public Date getfentrega() {
        return m_fentrega;
    }

    public void setfdevolucion(Date devolucion) {
        m_fdevolucion = devolucion;
    }

    public Date getfdevolucion() {
        return m_fdevolucion;
    }

    public void setformato(String formato) {
        m_formato = formato;
    }

    public String getFormato() {
        return m_formato;
    }

}
