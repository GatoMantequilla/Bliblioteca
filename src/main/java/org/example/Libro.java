package org.example;

class Libro {
    private String libro;
    private String autor;
    private int ISBN;
    private int yearPublicacion;
    private Categoria categoria;

    public Libro(String libro, String autor, int ISBN, int yearPublicacion, Categoria categoria) {
        this.libro = libro;
        this.autor = autor;
        this.ISBN = ISBN;
        this.yearPublicacion = yearPublicacion;
        this.categoria = categoria;
    }

    //---------------------------------------------------------------------------

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    private String getAutor() {
        return autor;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    private int getISBN() {
        return ISBN;
    }

    void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    private int getYearPublicacion() {
        return yearPublicacion;
    }

    void setYearPublicacion(int yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    private Categoria getCategoria() {
        return categoria;
    }

    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
