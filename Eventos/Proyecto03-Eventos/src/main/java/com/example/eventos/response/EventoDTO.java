package com.example.eventos.response;

import java.util.Date;

public class EventoDTO {

    private int id;
    private String Nombre;
    private String DescripcionCorta;
    private String DescripcionExtendida;
    private Date FechaEvento;
    private Date HoraEvento;
    private double Precios;
    private String Normas;
    private String SalaNombre;
    private String SalaCiudad;
    private String SalaDireccion;
    private String SalaTipoRecinto;
    private int SalaAforo;
    public EventoDTO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public EventoDTO(int id, String nombre, String descripcionCorta, String descripcionExtendida, Date fechaEvento,
            Date horaEvento, double precios, String normas, String salaNombre, String salaCiudad, String salaDireccion,
            String salaTipoRecinto, int salaAforo) {
        super();
        this.id = id;
        Nombre = nombre;
        DescripcionCorta = descripcionCorta;
        DescripcionExtendida = descripcionExtendida;
        FechaEvento = fechaEvento;
        HoraEvento = horaEvento;
        Precios = precios;
        Normas = normas;
        SalaNombre = salaNombre;
        SalaCiudad = salaCiudad;
        SalaDireccion = salaDireccion;
        SalaTipoRecinto = salaTipoRecinto;
        SalaAforo = salaAforo;
    }
    @Override
    public String toString() {
        return "EventoDTO [id=" + id + ", Nombre=" + Nombre + ", DescripcionCorta=" + DescripcionCorta
                + ", DescripcionExtendida=" + DescripcionExtendida + ", FechaEvento=" + FechaEvento + ", HoraEvento="
                + HoraEvento + ", Precios=" + Precios + ", Normas=" + Normas + ", SalaNombre=" + SalaNombre
                + ", SalaCiudad=" + SalaCiudad + ", SalaDireccion=" + SalaDireccion + ", SalaTipoRecinto="
                + SalaTipoRecinto + ", SalaAforo=" + SalaAforo + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDescripcionCorta() {
        return DescripcionCorta;
    }
    public void setDescripcionCorta(String descripcionCorta) {
        DescripcionCorta = descripcionCorta;
    }
    public String getDescripcionExtendida() {
        return DescripcionExtendida;
    }
    public void setDescripcionExtendida(String descripcionExtendida) {
        DescripcionExtendida = descripcionExtendida;
    }
    public Date getFechaEvento() {
        return FechaEvento;
    }
    public void setFechaEvento(Date fechaEvento) {
        FechaEvento = fechaEvento;
    }
    public Date getHoraEvento() {
        return HoraEvento;
    }
    public void setHoraEvento(Date horaEvento) {
        HoraEvento = horaEvento;
    }
    public double getPrecios() {
        return Precios;
    }
    public void setPrecios(double precios) {
        Precios = precios;
    }
    public String getNormas() {
        return Normas;
    }
    public void setNormas(String normas) {
        Normas = normas;
    }
    public String getSalaNombre() {
        return SalaNombre;
    }
    public void setSalaNombre(String salaNombre) {
        SalaNombre = salaNombre;
    }
    public String getSalaCiudad() {
        return SalaCiudad;
    }
    public void setSalaCiudad(String salaCiudad) {
        SalaCiudad = salaCiudad;
    }
    public String getSalaDireccion() {
        return SalaDireccion;
    }
    public void setSalaDireccion(String salaDireccion) {
        SalaDireccion = salaDireccion;
    }
    public String getSalaTipoRecinto() {
        return SalaTipoRecinto;
    }
    public void setSalaTipoRecinto(String salaTipoRecinto) {
        SalaTipoRecinto = salaTipoRecinto;
    }
    public int getSalaAforo() {
        return SalaAforo;
    }
    public void setSalaAforo(int salaAforo) {
        SalaAforo = salaAforo;
    }
}