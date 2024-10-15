package org.example;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> libros;
    private ArrayList<Empleado> empleados;
    private ArrayList<Categoria> categorias;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    //---------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }


    ////////////////////----------------------////////////////////----------------------////////////////////----------------------

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Su libro se agrego, este fue: " + libro.getLibro());
    }

    public void modificarLibro(Libro libro, String nuevoNombre, String nuevoAutor, int nuevoISBN, int nuevoAnio) {
        libro.setLibro(nuevoNombre);
        libro.setAutor(nuevoAutor);
        libro.setISBN(nuevoISBN);
        libro.setYearPublicacion(nuevoAnio);
        System.out.println("El libro de modifico, nuevo libro: " + libro.getLibro());
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
        System.out.println("El libro se uso para el fuego, adios: " + libro.getLibro());
    }

    public Libro obtenerLibroDisponible(String nombreLibro) {
        for (Libro libro : libros) {
            if (libro.getLibro().equals(nombreLibro)) {
                return libro;
            }
        }
        return null;
    }

    ////////////////////----------------------////////////////////----------------------////////////////////----------------------


    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
        System.out.println("La Categoria" + categoria.getNombre() + "fue agregada " );
    }

    ////////////////////----------------------////////////////////----------------------////////////////////----------------------

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("El empleado" + empleado.getNombre() + " fue agregado " );
    }

    public void modificarEmpleado(Empleado empleado, String nuevoNombre, int nuevaIdentificacion, String nuevoCargo) {
        empleado.setNombre(nuevoNombre);
        empleado.setIdentificacion(nuevaIdentificacion);
        empleado.setCargo(nuevoCargo);
        System.out.println("El empleado" + empleado.getNombre() + " fue modificado :3 " );

    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
        System.out.println("El empleado" + empleado.getNombre() + " se fue por voluntad propia. " );
    }

    ////////////////////----------------------////////////////////----------------------////////////////////----------------------

}
