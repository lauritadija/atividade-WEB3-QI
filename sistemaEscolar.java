//Criar a classe chamada SistemaEscolar

public class sistemaEscolar {
     
    //Criar um array de objeto do tipo aluno
    Aluno alunos[] = new Aluno[5];

    //Cria uma variavel para controlar quantos alunos foram cadastrados
    int quantidade = 0;

    //Cria um metodo chamado cadastrarAluno
    public void cadastrarAluno(Aluno aluno){
        if(quantidade < alunos.length){

            //Armazena o objeto aluno na posiçao atual do array
            alunos[quantidade] = aluno;

            //Aumenta o contador de alunos cadastrados quantidade++;
            
            //Mostrar mensagem informando que o aluno foi cadastrado
            System.out.println("Aluno cadastrado com sucesso!");
        }else{
            //Executar caso o array esteja cheio
            System.out.println("Limite de alunos atingido!");
        }
    }
    
    //Criar um metodo para listar os lunos utilizando FOR
    public void listarComFor(){

        //exibir um titulo 
        System.out.println("\nLISTA DE ALUNOS");

        //Estrutura de repetiçao FOR, percorre todas as posiçoes do array
        for(int i = 0; i < alunos.length; i++){

            //Verifica se existe um aluno naquela posiçao
            if(alunos[i] !=null){ 

                //Chama o metodo mostraDados
                alunos[i].mostrarDados();
            }
        }
    }
    //Criar um metodo para listar alunos utilizando WHILE
    public void listarComwhile(){
        
        //Exibe um titulo
        System.out.println("\nLISTAR UTILIZANDO WHILE");

        //CRIAR A VARIAVEL DE CONTROLE
        int i = 0;

        //Estrutura de repetiçao while, continua enqunto o i for menor q o tamanho do array
        while(i < alunos.length){

            //Verifica se existe aluno na posiçao atual
            if(alunos[i] !=null){

                //Exibe dados do aluno
                aluno[i].mostrarDados();

            }
            //INCREMENTA O CONTADOR
            i++;
        }  
    }

    //criar um metodo para buscar um aluno pelo nome
    public void buscarAluno(String nome){

        //utilizar o FOR para percorrer o array
        for(int i = 0; i < alunos.length; i++){

            //Verifica se a posiçao possui um objeto
            if(alunos[i] !=null){

                //Compara o nome pesquisado como nome armazenado
                if(alunos[i].nome.equals(nome)){
                    
                    //Mostrar mensagem quando encontar
                    System.out.println("Aluno encontrado !");

                    //Exibe os dados do aluno encontrado 
                    alunos[i].mostrarDados();

                    //Interrompe for 
                    break;
                }
            }
        }
    }

    //Criar um metodo para mostrar o tamanho do array
    public void msotrarTamanhoArray(){

        //Mostra a quantidade maxima de posiçao disponivel
        System.out.println("Quantidade maxima de alunos:" + alunos.length);
    }
}
