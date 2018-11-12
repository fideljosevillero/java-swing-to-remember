
package com.inventaryapp.models;

import java.util.List;


public class Proveedor {
    
    private String nombre;
    private String NIT;
    private String direccion;
    private String email;
    private List<String> telefonos;
    private List<Contacto> contactosProveedor;
    private String Observaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Contacto> getContactosProveedor() {
        return contactosProveedor;
    }

    public void setContactosProveedor(List<Contacto> contactosProveedor) {
        this.contactosProveedor = contactosProveedor;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
    
}
