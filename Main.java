
import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Joao", "D", 27);
        Empregado empregado2 = new Empregado("Maria", "G", 37);
        Empregado empregado3 = new Empregado("Roberto", "A", 19);

        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
        empregados.add(empregado1);
        empregados.remove(1);
    }
}