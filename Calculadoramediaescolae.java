//Impostante a classe Scanner para permitir entrada de dados pelo teclado 
import java.util.Scanner;

//Criar a classe principal
public class Calculadoramediaescolae {

    //Metodo principal onde o programa começa a executar
    public static void main(String[] args) {
       
        //Criar um objeto Scanner para ler informaçoes digitadas pelo usuario
        Scanner entrada = new Scanner(System.in);
        
        //Solicitada e recebe o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite a primeira nota");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota");
        double nota3 = entrada.nextDouble();


        //calcula a media 
        double media =(nota1 + nota2 + nota 3)/3;

        //criar um contador iniciando em zero
        int quantidadeNotas = 0;

        //incrementa 3x o contador
        int quantidadedeNotas++;
        int quantidadedeNotas++;
        int quantidadedeNotas++;

        //Exibindo na tela
        System.out.println("\n==== RESULTADO ====");

        System.out.println("Aluno: "+ nome);

        System.out.println("Quantidade de avaliaçoes:"+ quantidadedeNotas);

        System.out.println("Media: "+ media);

        //Variavel booleana
        boolean aprovado = media>= 7;

        if(MEDIA >= 7 && media <= 10){
            System.out.println("Aluno dentro da media de aprovaçao.");
        }
        
        //Verifica se o aluno foi aprovado
        if(Aprovado){ 
            System.out.println("Situaçao: Aprovado");
        }else{
            System.out.println("Situaçao: Reprovado");
        }

        //Estrutura de decisao com varias possibilidades
        if(media >= 9){
            System.out.println("Status: Excelente");
        }else if(media >= 7){
            System.out.println("Status: bom");
        }else if(media >=5){
            System.out.println("Status: Recuperaçao");
        }else{
            System.out.println("Status: Reprovado");
        }
    }

    
}
