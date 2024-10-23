package primer.parcial.marecos.leandro;
import marecos.leandro.*;

public class PrimerParcialMarecosLeandro {

    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca(5);
        Autor a = new Autor("Esteban", "Rey");
        Autor b = new Autor("Joe", "Mayo");
        Manual m1 = new Manual("Economia", 25f, "Domingo", "Caballo", Tipo.FINANZAS);
        Novela n1 = new Novela("Miseria", 63.50f, a, Genero.ROMANTICA);
        Manual m2 = new Manual("C#", 299.50f, "Joe", "Mayo", Tipo.TECNICO);
        Novela n2 = new Novela("Miseria", 205f, a, Genero.ACCION);
        Novela n3 = new Novela("Miseria", 98f, a, Genero.CIENCIA_FICCION);
        Novela n4 = new Novela("Miseria", 103.50f, b, Genero.ACCION);
        miBiblioteca.agregar(m1);
        //YA INGRESADO
        miBiblioteca.agregar(m1);
        miBiblioteca.agregar(n1);
        miBiblioteca.agregar(m2);
        miBiblioteca.agregar(n2);
        miBiblioteca.agregar(n3);
        //SIN LUGAR
        miBiblioteca.agregar(n4);
        System.out.println("");
        //TRUE
        System.out.println(m1.equals(m1));
        //FALSE
        System.out.println(m1.equals("Joe Mayo"));
        //FALSE
        System.out.println(m1.equals(m2));
        //TRUE
        System.out.println(n1.equals(n1));
        //FALSE
        System.out.println(n1.equals(n2));
        //FALSE
        System.out.println(n1.equals(n4));
        System.out.println("");
        System.out.println(Biblioteca.mostrar(miBiblioteca));
    }
    
}
