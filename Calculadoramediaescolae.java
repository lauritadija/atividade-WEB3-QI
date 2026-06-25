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
        double media =(nota1 + nota2 + nota3)/3;

        //criar um contador iniciando em zero
        int quantidadeNotas = 0;

        //incrementa 3x o contador
         quantidadedeNotas++;
         quantidadedeNotas++;
         quantidadedeNotas++;

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
        
        //Verifica se o nome é maria ou joao
        if(nome.equals("Maria") || nome.equals("Lucas")){
            //Executa se uma condiçao for verdadeira
            System.out.println("Aluno cadastrado no grupo");
        }else{
            System.out.println("Aluno nao cadastrado"); 
        }
        
        //Criar uma variavel boolena indicandicando a situaçao de recuperaçao
        boolean recuperaçao = false;

        //O ! inverte valor lógico
        //Como recuperaçao é false,!recuperaçao é true
        if(!recuperaçao){
            //Executa quando nao esta em recuperaçao
            System.out.println("Nao esta em recuperaçao");
        }

        //Operador ternario , forma simplificada de um if else
            String resultado = media >=7 ?
        "Passou de ano" : " Nao passou" ;
        
        //Mostrar o resultado final
        System.out.println(resultado);
        

        //Criar um menu de opçoes
        System.out.println("\nEscolha uma opçao");
        //Mostrar opaço 1
        System.out.println("1-mostrar media");
        //Mostra opçao 2
        System.out.println("2- Mostrar status");
        //Mostrar opçao 3
        System.out.println("3- Encerra");

        //Recebe a opaçao do usuario
        int opçao = entrada.nextInt();

        //Estrutura swich para escolher a opçao
        switch (opcao) {
            //Caso o uduari escolha 1 
            case 1:
                //Mostra a media final
                System.out.println("Media final:"+ media);
                //Encerrar este case
                break;

                //Caso o usuario escola 2
            case 2:
                //Mostra a media final
                System.out.println("Status do aluno:"+ resultado);
                //Encerrar este case
                break;
            
             //Caso o usuario escola 3
            case 3:
                //Mostra a media final
                System.out.println("Sistema encerrado");
                //Encerrar este case
                break;

                //Execute caso nenhuma opçao seja encontrada
                default:
                    //Mostrar mensagem de erro
                    System.out.println("Opçao invalida");

        }
        //Fecha o scannner
        encontrar.close();

     }

    
}