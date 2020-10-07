package com.example.ejerciciolistviewpersonalizado2;

public class Agenda {

    private String nombre,telefono,direccion;
    private int foto;

    public Agenda(String nombre, String telefono, String direccion, int foto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
