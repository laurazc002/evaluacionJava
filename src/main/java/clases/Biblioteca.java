package clases;

public class Biblioteca {

    private String nombreLibro;
    private String codigo;
    private int numeroPaginas;
    private int numeroEjemplares;
    private  String autor;


    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, String codigo, int numeroPaginas, int numeroEjemplares, String autor) {
        this.nombreLibro = nombreLibro;
        this.codigo = codigo;
        this.numeroPaginas = numeroPaginas;
        this.numeroEjemplares = numeroEjemplares;
        this.autor = autor;
    }


}

