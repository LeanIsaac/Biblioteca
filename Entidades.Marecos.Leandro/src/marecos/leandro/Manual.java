package marecos.leandro;

public class Manual extends Libro{

    protected Tipo tipo;

    public Manual(String titulo, float precio, String nombre, String apellido, Tipo tipo) {
        super(titulo, precio, nombre, apellido);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo: ").append(this.tipo).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        
        boolean rto = false;
        if(obj instanceof Manual){
            Manual m = (Manual)obj;
            rto = Libro.sonIguales(this, (Libro)m) && this.tipo == m.tipo;
        }
        return rto;
    }
   
    
}
