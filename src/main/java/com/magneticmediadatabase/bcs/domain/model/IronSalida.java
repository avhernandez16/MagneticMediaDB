package com.magneticmediadatabase.bcs.domain.model;


import java.time.LocalDate;

public class IronSalida {
    private Long id;
    private LocalDate fecha_salida;
    private LocalDate fecha_devolucion;
    private String usuario;
    private String ubicacion;
    private String tipo_transporte;
    private Long numero_remision;
    private Long codigo;

//    Constructores

    public IronSalida (
            Long id,
            LocalDate fecha_salida,
            LocalDate fecha_devolucion,
            String usuario,
            String ubicacion,
            String tipo_transporte,
            Long numero_remision,
            Long codigo
    ) {
        this.id = id;
        this.fecha_salida = fecha_salida;
        this.fecha_devolucion = fecha_devolucion;
        this.usuario = usuario;
        this.ubicacion = ubicacion;
        this.tipo_transporte = tipo_transporte;
        this.numero_remision = numero_remision;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    public Long getNumero_remision() {
        return numero_remision;
    }

    public void setNumero_remision(Long numero_remision) {
        this.numero_remision = numero_remision;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
}
