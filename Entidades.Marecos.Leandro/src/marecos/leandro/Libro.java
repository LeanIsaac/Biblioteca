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
        //Autor autor = new Autor(nombre, apellido);
        //this(titulo,precio,autor);
        //????????????????????????????????????????????????????????????????????????????????????????????????
        this(titulo, precio,null);
        
    }
    
    public int getCantidadDePaginas(){
        int rto = cantidadDePaginas;
        if(cantidadDePaginas == 0){
            rto = generadorDePaginas.nextInt(31, 912);
        }
        return rto;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    private static String mostrar(Libro libro){
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: ").append(libro.autor.getNombreApellido());
        sb.append("Cantidad de paginas: ").append(libro.getCantidadDePaginas());
        sb.append("Titulo: ").append(libro.titulo);
        sb.append("Precio: ").append(libro.getPrecio());
        return sb.toString();
    }
    
    public static boolean sonIguales(Libro libro1, Libro libro2){
        return libro1.titulo.equals(libro2.titulo) && libro1.autor.equals(libro2.autor);
    }
    
    @Override // is this okay?
    public boolean equals(Object obj){
        return Libro.sonIguales(this, (Libro)obj);
    }

    @Override
    public String toString() {
        return Libro.mostrar(this);
    }
    
    
}
