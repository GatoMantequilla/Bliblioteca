package org.example;

class Empleado {
    private String nombre;
    private int identificacion;
    private String cargo;

    public Empleado(String nombre, int identificacion, String cargo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.cargo = cargo;
    }

    //---------------------------------------------------------------------------

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int getIdentificacion() {
        return identificacion;
    }

    void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    private String getCargo() {
        return cargo;
    }

    void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
