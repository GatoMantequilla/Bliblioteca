package org.example;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nombre;
    private String direccion;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    //---------------------------------------------------------------------------

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private List<Prestamo> getPrestamos() {
        return prestamos;
    }

    private void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
}
