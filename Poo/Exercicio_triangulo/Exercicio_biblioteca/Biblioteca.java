package Poo.Exercicio_triangulo.exercicio_biblioteca;

public class Biblioteca 
{
    private String title;
    private String author_name;
    private int publication_year;
    private int pages;

    public Biblioteca(String title, String author_name, int publication_year, int pages)
    {
        this.title = title;
        this.author_name = author_name;
        this.publication_year = publication_year;
        this.pages = pages;
    }

    public String get_title() {return this.title;}
    public String get_author_name() {return this.author_name;}
    public int get_publication_year() {return this.publication_year;}
    public int get_pages() {return this.pages;}

    public boolean show_details()
    {
        System.out.println("Titulo: " + get_title());
        System.out.println("Autor: " + get_author_name());
        System.out.println("Ano publicacao: "+ get_publication_year());
        System.out.println("Quantidade de paginas: " + get_pages());
        System.out.println();
        return true;
    }

    public boolean is_a_new_book()
    {
        if ((2024 - this.get_publication_year()) <= 24) 
            return true;
        return false;    
    }
}
