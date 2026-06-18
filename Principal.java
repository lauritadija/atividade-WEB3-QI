public class Principal {
    public static void main(String[] args) {
        
        //Criando objetos da classe carro.

        Carro carro1 = new Carro("Toyota","Corolla", 2023, 135000, " rosa","eletrico");
        Carro carro2 = new Carro("Fiat", "Palio", 2010, 18000, "branco", "combustao interna");
        Carro Carro3 = new Carro("Ford", "Fiesta",2016,50000, "vermelho","rotativo");
        Carro carro4 = new Carro("Volkswagen", "Gol",2022,49900,"laranja","Hibrido");
        Carro carro5 = new Carro("fiat","argo",2026,79590, "roxo","Eletrica");
        Carro Carro6 = new Carro("Jeep","Compass",2018,93900,"preto","Hibridos");

        //exibindo os dados 
        Carro1.mostrarDados();
        System.out.println();

        Carro2.mostrarDados();
        System.out.println();

        Carro3.mostrarDados();
        System.out.println();

        Carro4.mostrarDados();
        System.out.println();

        Carro5.mostrarDados();
        System.out.println();

        Carro6.mostrarDados();
        System.out.println();

        Carro7.mostrarDados();
        System.out.println();
        
        
        
    }
}