public class TesteCarro {
    public static void main (String[] args) {
        Carro meuCarro = new Carro("Fusca", 2020, "Azul");
        meuCarro.acelerar();
        System.out.println(meuCarro.getDetalhes());
    }
}