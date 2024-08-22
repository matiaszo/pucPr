import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class ListaEmpregados{
    private static ArrayList<Empregado> empregados;
    private static boolean is_valid_role = false;
    private static Dictionary dictionary = new Hashtable();
    

    public ListaEmpregados(){
        dictionary.put("a", "Analista");
        dictionary.put("g", "Gerente");
        dictionary.put("d", "Desenvolvedor");
    }


    public static void add(String name, String role, int age){
        Empregado temp = new Empregado(name, role, age);
        empregados.add(temp);
    }

    public static void set(int index, Empregado empregado) {
        empregados.set(index, empregado);
    }

    public static void remove(int index) {
        empregados.remove(index);
    }


    public static void showAllEmpregados(){
        for(Empregado e:empregados){
            System.out.println("Mostrando todos os empregados: ");
            System.out.println(e.getName() + "," + e.getAge() + " anos, " + "cargo: "+ dictionary.get(e.getCargo()));
        }
    }


    public static void showFilteredEmpregados(String role){
        System.out.println("Filtrando empregados com cargo de " + "'" +role + "'");

        for(Empregado e:empregados){
            if (e.getCargo().equals(role)){
                System.out.println(e.getName() + "," + e.getAge() + " anos");
                is_valid_role = true;
            }
        }
        if (is_valid_role == false){
            System.out.println("O cargo '" + role + "' não existe!!");
        }else{
            is_valid_role = false;}
    }
}