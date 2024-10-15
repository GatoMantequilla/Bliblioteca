package org.example;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Creamos biblio
        Biblioteca biblioteca = new Biblioteca("Biblioteca Estela", "Mi kasa 0027");

        //Crear Categoria
        Categoria Fantasia = new Categoria("Fantasia", "Aqui va la coleccion de happy pother o como se llame, no se nunca la vi");
        biblioteca.agregarCategoria(Fantasia);

        //Poner un libro
        Libro libro1 = new Libro("Harri Potha y la piedra", "J.KKK. Rowling", 192846125, 1997, Fantasia);
        biblioteca.agregarLibro(libro1);

        //Modificar libro
        biblioteca.modificarLibro(libro1, "Harry Potter y la piedra filosofal", "J.K. Rowling", 192846125, 1997);
        biblioteca.eliminarLibro(libro1);

        //Creamos a victima de abuso laboral (Trabaja en la ufro y titne que ir a direccion de informatica a preguntar por el wifi)
        Empleado empleado1 = new Empleado("Jota", 869, "Seguridad");
        biblioteca.agregarEmpleado(empleado1);
        biblioteca.modificarEmpleado(empleado1, "JORGE EDUARDO DIAZ VILLEGAS", 101, "Jefe de seguridad");
        //...
        biblioteca.eliminarEmpleado(empleado1);


        //Creamos un prestamo
        Prestamo prestamo1 = new Prestamo(new Date(), new Date(), libro1);
        biblioteca.obtenerLibroDisponible(libro1.getLibro());

        //MUltamos (Ojala lo hiciera la blibioteca, devuelvan el Stewart)
        Multa multa1 = new Multa(5000, new Date(), State.NO_PAGADA, prestamo1);
        //La pagan por mensos
        multa1.pagarMulta();
        //Borran la multa y un director se va a comer un pan con palta
        multa1.eliminarMulta();
    }
}
