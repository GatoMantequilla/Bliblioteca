package org.example;

import java.util.Date;

public class Multa {
    private int monto;
    private Date dateGeneracion;
    private State estadoMulta;
    private Prestamo prestamo;

    public Multa(int monto, Date dateGeneracion, State estadoMulta, Prestamo prestamo) {
        this.monto = monto;
        this.dateGeneracion = dateGeneracion;
        this.estadoMulta = estadoMulta;
        this.prestamo = prestamo;
    }

    //---------------------------------------------------------------------------

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getDateGeneracion() {
        return dateGeneracion;
    }

    public void setDateGeneracion(Date dateGeneracion) {
        this.dateGeneracion = dateGeneracion;
    }

    public State getEstadoMulta() {
        return estadoMulta;
    }

    public void setEstadoMulta(State estadoMulta) {
        this.estadoMulta = estadoMulta;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    //---------------------------------------------------------------------------

    public void pagarMulta() {
        this.estadoMulta = State.PAGADA;
        System.out.println("Multa pagada.");
    }

    public void eliminarMulta() {
        System.out.println("Multa eliminada.");
    }
}

