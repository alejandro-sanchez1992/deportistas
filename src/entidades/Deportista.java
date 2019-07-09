/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author User_1
 */
public class Deportista {
    private int intId;
    private String strNombre;
    private double dblSalario;
    private String strMedalla;
    private int intCantidad;
    private String strTipoDeporte;
    
    public Deportista(
        int intId,
        String strNombre,
        double dblSalario,
        String strMedalla,
        int intCantidad,
        String strTipoDeporte
    ) {
        this.intId = intId;
        this.strNombre = strNombre;
        this.dblSalario = dblSalario;
        this.strMedalla = strMedalla;
        this.intCantidad = intCantidad;
        this.strTipoDeporte = strTipoDeporte;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public double getDblSalario() {
        return dblSalario;
    }

    public void setDblSalario(double dblSalario) {
        this.dblSalario = dblSalario;
    }

    public String getStrMedalla() {
        return strMedalla;
    }

    public void setStrMedalla(String strMedalla) {
        this.strMedalla = strMedalla;
    }

    public int getIntCantidad() {
        return intCantidad;
    }

    public void setIntCantidad(int intCantidad) {
        this.intCantidad = intCantidad;
    }

    public String getStrTipoDeporte() {
        return strTipoDeporte;
    }

    public void setStrTipoDeporte(String strTipoDeporte) {
        this.strTipoDeporte = strTipoDeporte;
    }
    
}
