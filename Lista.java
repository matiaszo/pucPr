import java.util.ArrayList;

public class Lista{
    private static ArrayList<String> nome;

    private static void imprimeNomes(){
        System.out.print("| ");
        for(String n:nome) System.out.print(n+" | ");
            System.out.println(); // n é um iterador.
    }
    public static void main(String[] args) {
        nome=new ArrayList<String>();
        nome.add("Jose"); nome.add("Maria"); nome.add("Pedro");
        imprimeNomes();
        nome.remove("Maria"); nome.add("Joao");
        imprimeNomes();
    }
}