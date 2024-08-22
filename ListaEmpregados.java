import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class ListaEmpregados{
    public ArrayList<Empregado> empregados;
    private boolean is_valid_role = false;
    public Dictionary<String, String> dictionary = new Hashtable<>();
    

    public ListaEmpregados(){
        this.empregados = new ArrayList<Empregado>();
        this.dictionary = new Hashtable<>();
        dictionary.put("a", "Analista");
        dictionary.put("g", "Gerente");
        dictionary.put("d", "Desenvolvedor");
        
    }


    public void add(String name, String role, int age){
        Empregado temp = new Empregado(name, role, age);
        this.empregados.add(temp);
    }

    public void set(int index, Empregado empregado) {
        this.empregados.set(index, empregado);
    }

    public void remove(int index) {
        this.empregados.remove(index);
    }


    public  void showAllEmpregados(){
        System.out.println("Mostrando todos os empregados: ");
        for(Empregado e:this.empregados){
            System.out.println(e.getName() + "," + e.getAge() + " anos, " + "cargo: "+ dictionary.get(e.getCargo()));
        }
    }


    public void showFilteredEmpregados(String role){
        System.out.println("Filtrando empregados com cargo de " + "'" +role + "'");

        for(Empregado e:this.empregados){
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
    // public static void main(String[] args) {
    //     ListaEmpregados listaEmpregados = new ListaEmpregados();

    //     Empregado empregado1 = new Empregado("Joao", "D", 27);
    //     Empregado empregado2 = new Empregado("Maria", "G", 37);
    //     Empregado empregado3 = new Empregado("Roberto", "A", 19);

    //     empregados = new ArrayList<Empregado>();
    //     empregados.add(empregado1);
    //     empregados.add(empregado2);
    //     empregados.add(empregado3);
    //     showAllEmpregados();
    //     // dictionary.put("a", "b");
    //     System.out.println(dictionary.size());
    // }
}