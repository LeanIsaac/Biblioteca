package marecos.leandro;

import java.util.Random;

public abstract class Libro {
    protected Autor autor;
    protected int cantidadDePaginas;
    protected String titulo;
    protected float precio;
    protected static Random generadorDePaginas;
    
    static {
        Libro.generadorDePaginas = new Random();
    }

    public Libro(String titulo, float precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }
    
    public Libro(String titulo, float precio, String nombre, String apellido){
        this(titulo, precio, new Autor(nombre, apellido));
    }
    
    public int getCantidadDePaginas(){
        int rto = this.cantidadDePaginas;
        if(this.cantidadDePaginas == 0){
            rto = Libro.generadorDePaginas.nextInt(31, 913);
        }
        return rto;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    private static String mostrar(Libro libro){
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: ").append(libro.autor.getNombreApellido());
        sb.append("Cantidad de paginas: ").append(libro.getCantidadDePaginas()).append("\n");
        sb.append("Titulo: ").append(libro.titulo).append("\n");
        sb.append("Precio: ").append(libro.getPrecio()).append("\n");
        return sb.toString();
    }
    
    public static boolean sonIguales(Libro libro1, Libro libro2){
        return libro1.titulo.equals(libro2.titulo) && Autor.sonIguales(libro1.autor, libro2.autor);
    }
    
    @Override
    public boolean equals(Object obj){
        boolean rto = false;
        if(obj instanceof Libro){
            rto = Libro.sonIguales(this, (Libro)obj);   
        }
        return rto;
    }

    @Override
    public String toString() {
        return Libro.mostrar(this);
    }
    
    
}
