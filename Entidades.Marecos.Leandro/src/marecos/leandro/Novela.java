package marecos.leandro;

public class Novela extends Libro{
    protected Genero genero;

    public Novela(String titulo, float precio, Autor autor, Genero genero) {
        super(titulo, precio, autor);
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Genero: ").append(this.genero);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }
    
    
}
