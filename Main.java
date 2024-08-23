public class Main{
    public static void main(String[] args) {
        ListaEmpregados listaEmpregados = new ListaEmpregados();

        Empregado empregado1 = new Empregado("Joao", "D", 27);
        Empregado empregado2 = new Empregado("Maria", "G", 37);
        Empregado empregado3 = new Empregado("Roberto", "A", 19);
        Empregado empregado3att = new Empregado("Roberto", "D", 25);

        listaEmpregados.adicionarPorCaract("cristian", "d", 17);
        listaEmpregados.adicionarObjeto(empregado1);
        listaEmpregados.adicionarObjeto(empregado2);
        listaEmpregados.adicionarObjeto(empregado3);

        listaEmpregados.mostrarTodosEmpregados();

        listaEmpregados.remover(0);
        listaEmpregados.remover(1);

        listaEmpregados.mostrarTodosEmpregados();
        listaEmpregados.remover(0);
        listaEmpregados.remover(0);
        listaEmpregados.adicionarObjeto(empregado1);
        listaEmpregados.adicionarObjeto(empregado2);
        listaEmpregados.adicionarObjeto(empregado3);
        listaEmpregados.mostrarTodosEmpregados();
        listaEmpregados.atualizar(2, empregado3att);
        listaEmpregados.mostrarTodosEmpregados();
    }
}