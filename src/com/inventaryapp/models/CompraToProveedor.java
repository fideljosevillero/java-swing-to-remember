

package com.inventaryapp.models;

import java.util.Date;
import java.util.List;



public class CompraToProveedor {
    
    private List<String> listNumerosDeFaturasDeLaCompra; 
    private Date fechaSolicitud;
    private Date fechaIngreso;
    private List<Articulo> listArticulosComprados;
    private Contacto contactoProveedor; // contacto que nos vendio los articulos
    private boolean compraVerificada; // verificar que los articulos estan completos y en bn estado.
    private Long totalCompra;
    private Contacto contactoInterno; // persona que recibe los articulos.
}
