package com.example.eventos.response;

import java.util.Date;

/*Clase EventoDTO que se va a mostrar en servicio rest en lugar de Evento
la cual es para rellenar la base de datos*/
public class EventoDTO {

    private int id;
    private String nombre;
    private String descripcionCorta;
    private String descripcionExtendida;
    private String fechaEvento;
    private String horaEvento;
    private double precios;
    private String normas;
    private String salaNombre;
    private String salaCiudad;
    private String salaDireccion;
    private String salaTipoRecinto;
    private int salaAforo;
    private String genre;
    
    public EventoDTO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public EventoDTO(int id, String Nombre, String DescripcionCorta, String DescripcionExtendida, String FechaEvento,
            String HoraEvento, double Precios, String Normas, String SalaNombre, String SalaCiudad, String SalaDireccion,
            String SalaTipoRecinto, int SalaAforo) {
        super();
        this.id = id;
        nombre = Nombre;
        descripcionCorta = DescripcionCorta;
        descripcionExtendida = DescripcionExtendida;
        fechaEvento = FechaEvento;
        horaEvento = HoraEvento;
        precios = Precios;
        normas = Normas;
        salaNombre = SalaNombre;
        salaCiudad = SalaCiudad;
        salaDireccion = SalaDireccion;
        salaTipoRecinto = SalaTipoRecinto;
        salaAforo = SalaAforo;
    }
    @Override
    public String toString() {
        return "EventoDTO [id=" + id + ", Nombre=" + nombre + ", DescripcionCorta=" + descripcionCorta
                + ", DescripcionExtendida=" + descripcionExtendida + ", FechaEvento=" + fechaEvento + ", HoraEvento="
                + horaEvento + ", Precios=" + precios + ", Normas=" + normas + ", SalaNombre=" + salaNombre
                + ", SalaCiudad=" + salaCiudad + ", SalaDireccion=" + salaDireccion + ", SalaTipoRecinto="
                + salaTipoRecinto + ", SalaAforo=" + salaAforo + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        nombre = Nombre;
    }
    public String getDescripcionCorta() {
        return descripcionCorta;
    }
    public void setDescripcionCorta(String DescripcionCorta) {
        descripcionCorta = DescripcionCorta;
    }
    public String getDescripcionExtendida() {
        return descripcionExtendida;
    }
    public void setDescripcionExtendida(String DescripcionExtendida) {
        descripcionExtendida = DescripcionExtendida;
    }
    public String getFechaEvento() {
        return fechaEvento;
    }
    public void setFechaEvento(String FechaEvento) {
        fechaEvento = FechaEvento;
    }
    public String getHoraEvento() {
        return horaEvento;
    }
    public void setHoraEvento(String HoraEvento) {
        horaEvento = HoraEvento;
    }
    public double getPrecios() {
        return precios;
    }
    public void setPrecios(double Precios) {
        precios = Precios;
    }
    public String getNormas() {
        return normas;
    }
    public void setNormas(String Normas) {
        normas = Normas;
    }
    public String getSalaNombre() {
        return salaNombre;
    }
    public void setSalaNombre(String SalaNombre) {
        salaNombre = SalaNombre;
    }
    public String getSalaCiudad() {
        return salaCiudad;
    }
    public void setSalaCiudad(String SalaCiudad) {
        salaCiudad = SalaCiudad;
    }
    public String getSalaDireccion() {
        return salaDireccion;
    }
    public void setSalaDireccion(String SalaDireccion) {
        salaDireccion = SalaDireccion;
    }
    public String getSalaTipoRecinto() {
        return salaTipoRecinto;
    }
    public void setSalaTipoRecinto(String SalaTipoRecinto) {
        salaTipoRecinto = SalaTipoRecinto;
    }
    public int getSalaAforo() {
        return salaAforo;
    }
    public void setSalaAforo(int SalaAforo) {
        salaAforo = SalaAforo;
    }
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
    
}