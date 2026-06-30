//criar uma classe chamada aluno
public class Aluno{
    //Declara atributos
    String nome;
    double nota;

    //criar o consumidor da classe
    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    //criar um metodo chamado mostrarDados
    public void mostrarDados(){

        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("Nome:" + nome);
        System.err.println("Nome:" + nota);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
    }
}