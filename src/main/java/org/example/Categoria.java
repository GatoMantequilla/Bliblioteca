package org.example;

import java.util.ArrayList;
import java.util.List;

class Categoria {
    private String nombre;
    private String desc;
    private List<Libro> libros;

    public Categoria(String nombre, String desc) {
        this.nombre = nombre;
        this.desc = desc;
        this.libros = new ArrayList<>();
    }

    //---------------------------------------------------------------------------

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getDesc() {
        return desc;
    }

    void setDesc(String desc) {
        this.desc = desc;
    }

    private List<Libro> getLibros() {
        return libros;
    }

    private void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}
