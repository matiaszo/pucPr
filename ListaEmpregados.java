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


    public void adicionarPorCaract(String name, String role, int age){
        Empregado temp = new Empregado(name, role, age);
        this.empregados.add(temp);
    }

    public void adicionarObjeto(Empregado empregado){
        this.empregados.add(empregado);
    }

    public void atualizar(int index, Empregado empregado) {
        this.empregados.set(index, empregado);
    }

    public void remover(int index) {
        this.empregados.remove(index);
    }


    public void mostrarTodosEmpregados(){
        System.out.println("Mostrando todos os empregados: ");
        for(Empregado e:this.empregados){
            System.out.println(e.getName() + "," + e.getAge() + " anos, " + "cargo: "+ dictionary.get(e.getCargo()));
        }
    }


    public void mostrarEmpregadosFiltrados(String role){
        System.out.println("Filtrando empregados com cargo de " + "'" +role + "'");

        for(Empregado e:this.empregados){
            if (e.getCargo().equals(role.toLowerCase())){
                if (this.is_valid_role == false) {
                    System.out.println("Empregados com cargo de " + dictionary.get(e.getCargo()));
                }
                this.is_valid_role = true;
                System.out.println(e.getName() + "," + e.getAge() + " anos");
            }
        }
        if (this.is_valid_role != true){
            System.out.println("O cargo '" + role + "' não existe!!");
        }else{
            this.is_valid_role = false;}
    }
}