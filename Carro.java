//Cria classe carro 

import javax.print.DocFlavor.STRING;

public class Carro {
    
    //Cria atributos da classe
    String marca;
    String modelo;
    int ano;
    double valor; 


    //Construtor
    public Carro( String marca,String modelo,int ano,double valor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;                                                      

    }
    
    //Metodo para exibir informaçoes 
    public Void mostrarDados(){
        System.out.println("==== CARRO CADASTRO ====");
        System.out.println("Marca:" +marca );
        System.out.println("Modelo:"+modelo);
        System.out.println("ano:" +ano);
        System.oyt.println("Valor:R$" +valor);
    }
     

    //Metodos GET
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double getValor(){
        return valor;
    }

    //Metodos SET
    public Void setMarca(String marca){
        this.marca = marca;
    }
    
    public Void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public Void setAno(int ano){
        this.ano = ano;
    }

    public Void setValor(double valor){
        this.valor = valor;
    }
}
