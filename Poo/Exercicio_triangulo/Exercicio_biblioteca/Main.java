package Poo.Exercicio_triangulo.Exercicio_biblioteca;

public class Main 
{
    public static void main(String[] args) 
    {
        Biblioteca bib = new Biblioteca("Titulo", "Nome", 1999, 327);
        System.out.println(bib.get_author_name());
        System.out.println(bib.is_a_new_book());
        bib.show_details();

        Biblioteca bib2 = new Biblioteca("Another", "Another name", 2000, 151);
        System.out.println(bib2.get_author_name());
        System.out.println(bib2.is_a_new_book());
        bib2.show_details();
    }
}
