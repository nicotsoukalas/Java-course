public class CarroTestar {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.modelo = "Uno";
        carro1.marca = "Fiat";
        carro1.ano = 2015;
        carro1.velocidade = 60;

        carro1.acelerar(20);

        System.out.println("Velocidade: " + carro1.velocidade + 
        "km/h");

        carro1.frear(30);

        System.out.println("Velocidade: " + carro1.velocidade + 
        "km/h");
    }
}
