import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
        ListaEmpregados listaEmpregados = new ListaEmpregados();

        Empregado empregado1 = new Empregado("Joao", "D", 27);
        Empregado empregado2 = new Empregado("Maria", "G", 37);
        Empregado empregado3 = new Empregado("Roberto", "A", 19);

        listaEmpregados.empregados.add(empregado1);        
        listaEmpregados.empregados.add(empregado2);        
        listaEmpregados.empregados.add(empregado3);   
        
        System.out.println(listaEmpregados.empregados.size());
        System.out.println(listaEmpregados.dictionary.size());

        
    }
}