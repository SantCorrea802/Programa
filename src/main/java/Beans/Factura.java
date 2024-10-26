/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;


/**
 *
 * @author HP
 */
public class Factura {
    private String numFactura;
    private String fechaFactura;
    private String idCasaFactura;
    private String valorPagar;
    private String valorPagado;

    public Factura(String numFactura, String fechaFactura, String idCasaFactura, String valorPagar, String valorPagado) {
        this.numFactura = numFactura;
        this.fechaFactura = fechaFactura;
        this.idCasaFactura = idCasaFactura;
        this.valorPagar = valorPagar;
        this.valorPagado = valorPagado;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getIdCasaFactura() {
        return idCasaFactura;
    }

    public void setIdCasaFactura(String idCasaFactura) {
        this.idCasaFactura = idCasaFactura;
    }

    public String getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(String valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(String valorPagado) {
        this.valorPagado = valorPagado;
    }


}
