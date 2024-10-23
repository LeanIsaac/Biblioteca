package marecos.leandro;

public class Novela extends Libro{
    private Genero genero;

    public Novela(String titulo, float precio, Autor autor, Genero genero) {
        super(titulo, precio, autor);
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Genero: ").append(this.genero).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean rto = false;
        if(obj instanceof Novela){
            Novela n = (Novela)obj;
            rto = (Libro.sonIguales(this, (Libro)n)) && (this.genero == n.genero);
        }
        return rto;
    }
    
    
}
