package clases;

public class Biblioteca {
    private String nombre;
    private String codigo;
    private String paginas;
    private int ejemplares;
    private String autor;


    public Biblioteca() {
    }

    public Biblioteca(String nombre, String codigo, String paginas, int ejemplares, String autor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.paginas = paginas;
        this.ejemplares = ejemplares;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}


