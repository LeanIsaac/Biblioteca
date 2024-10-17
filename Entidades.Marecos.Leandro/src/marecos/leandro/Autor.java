package marecos.leandro;

public class Autor {
    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public static boolean sonIguales(Autor a1, Autor a2){
        return a1.nombre.equals(a2.nombre) && a1.apellido.equals(a2.apellido);
    }
    
    public String getNombreApellido(){
        return this.nombre + " - " + this.apellido;
    }
    
    public void setNombreApellido(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
