package org.example;

import java.util.Date;

class Prestamo {
    private Date datePrestamo;
    private Date dateDevolucion;
    private Libro libro;

    public Prestamo(Date datePrestamo, Date dateDevolucion, Libro libro) {
        this.datePrestamo = datePrestamo;
        this.dateDevolucion = dateDevolucion;
        this.libro = libro;
    }

    //---------------------------------------------------------------------------

    private Date getDatePrestamo() {
        return datePrestamo;
    }

    private void setDatePrestamo(Date datePrestamo) {
        this.datePrestamo = datePrestamo;
    }

    private Date getDateDevolucion() {
        return dateDevolucion;
    }

    private void setDateDevolucion(Date dateDevolucion) {
        this.dateDevolucion = dateDevolucion;
    }

    private Libro getLibro() {
        return libro;
    }

    private void setLibro(Libro libro) {
        this.libro = libro;
    }
}
