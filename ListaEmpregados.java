import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;


public class ListaEmpregados{
    public ArrayList<Empregado> empregados;
    private boolean is_valid_role = false;
    private Dictionary<String, String> roles_dict = new Hashtable<>();

    
    public ListaEmpregados(){
        this.empregados = new ArrayList<Empregado>();

        this.roles_dict = new Hashtable<>();
        roles_dict.put("a", "Analista");
        roles_dict.put("g", "Gerente");
        roles_dict.put("d", "Desenvolvedor");
        }


    public void adicionarPorCaract(String name, String role, int age){
        Empregado temp = new Empregado(name, role, age);
        this.empregados.add(temp);
    }


    public void adicionarObjeto(Empregado empregado){
        this.empregados.add(empregado);
    }


    public void atualizar(int index, String option, String value) {
        switch (option) {
            case "n":
                String old_name = this.empregados.get(index).getName();
                this.empregados.get(index).setName(value);
                String new_name = this.empregados.get(index).getName();
                System.out.println("Nome atualizado => de "+ old_name + " para " + new_name);
                break;
            case "c":
                String old_cargo = this.empregados.get(index).getCargo();
                this.empregados.get(index).setCargo(value);
                String new_cargo = this.empregados.get(index).getCargo();
                System.out.println("Cargo atualizado => de "+ old_cargo + " para " + new_cargo);
            case "i":
            int old_age = this.empregados.get(index).getAge();
            int value_int = Integer.valueOf(value);
            this.empregados.get(index).setAge(value_int);
            int new_age = this.empregados.get(index).getAge();
            System.out.println("Idade atualizada => de "+ old_age + " para " + new_age);
            default:
                System.out.println("Opcao" + option + " não reconhecida! Digite uma opcao válida");
                break;
        }
    }


    public void remover(int index) {
        this.empregados.remove(index);
    }


    public void mostrarTodosEmpregados(){
        System.out.println("Mostrando todos os empregados: ");
        for(Empregado e:this.empregados){
            System.out.println(e.getName() + "," + e.getAge() + " anos, " + "cargo: "+ roles_dict.get(e.getCargo()));
        }
    }


    public void mostrarEmpregadosFiltrados(String role){
        System.out.println("Filtrando empregados com cargo de " + "'" +role + "'");

        for(Empregado e:this.empregados){
            if (e.getCargo().equals(role.toLowerCase())){
                if (this.is_valid_role == false) {
                    System.out.println("Empregados com cargo de " + roles_dict.get(e.getCargo()) + ":");
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


    public static void menu(){

        ListaEmpregados list = new ListaEmpregados();
        
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Escolha uma opcao: ");
            System.out.println("1 => Adicionar usuario");
            System.out.println("2 => Mostrar todos os usuarios (sem filtro)");
            System.out.println("3 => Mostrar usuarios filtrados pelo cargo");
            System.out.println("4 => Atualizar usuario pelo index");
            System.out.println("5 => Remover usuario da lista");
            System.out.println("6 => Fechar programa");
    
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Digite o nome do usuario a ser adicionado: ");
                    String name = scanner.nextLine();

                    System.out.println("Digite o cargo do usuario a ser adicionado (a, d, g): ");
                    String role = scanner.nextLine();

                    System.out.println("Digite a idade do usuario a ser adicionado: ");
                    int age = scanner.nextInt();

                    list.adicionarPorCaract(name, role, age);
                    System.out.println("Usuario adicionado com sucesso!");
                    System.out.println();
                    break;
            
                case "2":
                    list.mostrarTodosEmpregados();
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Digite o cargo que deseja selecionar: ");
                    role = scanner.nextLine();
                    list.mostrarEmpregadosFiltrados(role);
                    System.out.println();
                    break;
                case "4":
                    System.out.println("Digite o index do usuario que deseja editar: ");
                    int index = scanner.nextInt();
                    System.out.println("Digite o atributo que deseja editar: ");
                    String atrib = scanner.next();
                    System.out.println("Digite o novo valor do atributo: ");
                    String new_value = scanner.next();
                    list.atualizar(index, atrib, new_value);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Digite o index do usuario que deseja remover");
                    index = scanner.nextInt();
                    list.remover(index);
                case "6":
                    System.out.println("Fechando sistema");
                    System.exit(0);
                default:
                    break;
            }

            // scanner.close();
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
}