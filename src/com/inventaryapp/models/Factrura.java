
package com.inventaryapp.models;

import java.util.Date;
import java.util.List;


public class Factrura {

    private String codeFactura;
    private Integer consecutivoFactura;
    private Date FechaEmision;
    private Date FechaVencimiento;
    private List<Articulo> listaArticulos;
    private String NombreNogocio;
    private String descripcion;
    private long IVA;
    private Long total;

    public long getIVA() {
        return IVA;
    }

    public void setIVA(long IVA) {
        this.IVA = IVA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodeFactura() {
        return codeFactura;
    }

    public void setCodeFactura(String codeFactura) {
        this.codeFactura = codeFactura;
    }

    public Integer getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public void setConsecutivoFactura(Integer consecutivoFactura) {
        this.consecutivoFactura = consecutivoFactura;
    }

    public Date getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(Date FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(List<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getNombreNogocio() {
        return NombreNogocio;
    }

    public void setNombreNogocio(String NombreNogocio) {
        this.NombreNogocio = NombreNogocio;
    }
    
    
     
}
