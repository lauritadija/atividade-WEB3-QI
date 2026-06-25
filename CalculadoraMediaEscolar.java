//Importa a classe Scanner para permitir entrada de dados pelo teclado
import java.util.Scanner;

//Cria a classe principal
public class CalculadoraMediaEscolar {
    
    //Metodo principal onde o programa começa a executar
    public static void main(String[] args) {
        
        //Cria um objeto Scanner para ler informações digitadas pelo usuário
        Scanner entrada = new Scanner(System.in);

        //Solicita e recebe o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        //Solicita a primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        //Solicita a segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        //Solicita a terceira nota
        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        //Calcula a média
        double media = (nota1 + nota2 + nota3)/3;

        //Cria um contador iniciando em zero
        int quantidadeNotas = 0;

        //Incrementa 3x o contador
        quantidadeNotas++;
        quantidadeNotas++;
        quantidadeNotas++;

        //Exibindo na tela
        System.out.println("\n==== RESULTADO ====");

        System.out.println("Aluno: " + nome);

        System.out.println("Quantidade de avaliações: " + quantidadeNotas);

        System.out.println("Média: " + media);
        
        //Variável booleana
        boolean aprovado = media >= 7;

        if(media >= 7 && media <= 10){
            System.out.println("Aluno dentro da média de aprovação.");
        }
        //Verifica se o aluno foi aprovado
        if(aprovado){
            System.out.println("Situação: Aprovado");
        }else{
            System.out.println("Situação: Reprovado");
        }

        //Estrutura de decisão com várias possibilidades
        if(media >= 9){
            System.out.println("Status: Excelente");
        }else if(media >= 7){
            System.out.println("Status: Bom");
        }else if(media >= 5){
            System.out.println("Status: Recuperação");
        }else{
            System.out.println("Status: Reprovado");
        }

        //Verifica se o nome é Maria ou João
        if(nome.equals("Maria") || nome.equals("Lucas")){
            //Executa se uma condição for verdadeira
            System.out.println("Aluno cadastrado no grupo");
        }else{
            System.out.println("Aluno não cadastrado");
        }

        //Cria uma variável booleana indicando a situação de recuperação
        boolean recuperacao = false;

        //O ! inverte o valor lógico
        //Como recuperacao é false, !recuperacao é true
        if(!recuperacao){
            //Executa quando não está em recuperação
            System.out.println("Não está em recuperação");
        }

        //Operador ternário, forma simplificada de um if/else
            String resultado = media >= 7 ?
            "Passou de ano" : "Não passou";

            //Mostrar o resultado final
            System.out.println(resultado);

            //Cria um menu de opções
            System.out.println("\nEscolha uma opção:");
            //Mostra opção 1
            System.out.println("1 - Mostrar média");
            //Mostra opção 2
            System.out.println("2 - Mostra status");
            //Mostra opção 3
            System.out.println("3 - Encerra");

            //Recebe a opção do usuário
            int opcao = entrada.nextInt();

            //Estrutura switch para escolher a opção
            switch(opcao){

                //Caso o usuário escolha 1
                case 1:
                    //Mostra a média final
                    System.out.println("Média final: "+ media);
                    //Encerrar este case
                    break;

                //Caso o usuário escolha 2
                case 2:
                    //Mostra a média final
                    System.out.println("Status do aluno: " + resultado);
                    //Encerrar este case
                    break;

                //Caso o usuário escolha 3
                case 3:
                    //Mostra a média final
                    System.out.println("Sistema encerrado");
                    //Encerrar este case
                    break;

                //Executa caso nenhuma opção seja encontrada
                default:
                    //Mostra mensagem de erro
                    System.out.println("Opção inválida");
            }
        //Fecha o Scanner 
        entrada.close();
    }
}