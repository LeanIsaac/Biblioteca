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
        boolean rto = false;
        for(Libro l : this.libros){
            rto = l.equals(libro);
        }
        return rto;
    }
    
    public void agregar(Libro libro){
        
        if(this.sonIguales(libro) == true){
            System.out.println("El libro ya esta en la biblioteca");
        }
        else if(this.libros.size() >= capacidadMaxLibros){
            System.out.println("No hay mas lugar en la biblioteca");
        }
        else{
            this.libros.add(libro);
        }
    }
    
    private double getPrecio(PrecioLibro plibro){
        float precio = 0;
        
        switch (plibro) {
            case PrecioLibro.MANUALES:
                precio = (float)this.getPrecioDeManuales();
                break;
            case PrecioLibro.NOVELAS:
                precio = (float)this.getPrecioDeNovelas();
                break;
            case PrecioLibro.TODOS:
                precio = (float)this.getPrecioTotal();
                break;
        }
        
        return precio;
    }
    
    public double getPrecioDeManuales(){
        double precio= 0.0;
        
        for(Libro libro : this.libros){
            if(libro instanceof Manual){
                precio += ((Manual) libro).precio;
            }
        }
        
        return precio;
    }
    
    public double getPrecioDeNovelas(){
        double precio = 0.0;
        
        for(Libro libro : this.libros){
            if(libro instanceof Novela){
                precio += ((Novela) libro).precio;
            }
        }
        
        return precio;
    }
    
    public double getPrecioTotal(){
        double precioManuales = this.getPrecio(PrecioLibro.MANUALES);
        double precioNovelas = this.getPrecio(PrecioLibro.NOVELAS);
        double precioTotal = precioManuales + precioNovelas;
        
        return precioTotal;
    } 
    
    public static String mostrar(Biblioteca biblioteca){
        StringBuilder sb = new StringBuilder();
        sb.append("Capacidad: ").append(biblioteca.capacidadMaxLibros).append("\n");
        sb.append("Total por manuales: ").append(biblioteca.getPrecioDeManuales()).append("\n");
        sb.append("Total por novelas: ").append(biblioteca.getPrecioDeNovelas()).append("\n");
        sb.append("Precio total: ").append(biblioteca.getPrecioTotal()).append("\n");
        sb.append("---------------------"+"\n");
        sb.append("Listado de Libros"+"\n");
        sb.append("---------------------"+"\n");
        
        for(Libro libro: biblioteca.libros){
            sb.append(libro).append("\n");
        }
        
        
        return sb.toString();
    }
}