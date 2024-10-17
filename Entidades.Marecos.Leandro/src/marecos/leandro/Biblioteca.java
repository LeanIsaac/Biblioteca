package marecos.leandro;

import java.util.ArrayList;

public class Biblioteca{
    private int capacidadMaxLibros;
    private ArrayList<Libro> libros;

    public Biblioteca(){
        this.capacidadMaxLibros = 3;
        this.libros = new ArrayList<>();
    }
    
    public Biblioteca(int capacidad){
        this();
        this.capacidadMaxLibros = capacidad;
    }
    
    public boolean sonIguales(Libro libro){
        
        return true;
    }
    
    public boolean agregar(Libro libro){
        return true;
    }
    
    public double getPrecio(PrecioLibro plibro){
        return 0;
    }
    
    public double getPrecioDeManuales(){
        return 0;
    }
    
    public double getPrecioDeNovelas(){
        return 0;
    }
    
    public double getPrecioTotal(){
        return 0;
    } 
    
    public static String mostrar(Biblioteca biblioteca){
        return "";
    }
}