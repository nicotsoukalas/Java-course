package abstracao;

public class TV {
    private boolean ligada;
    private int volume;
    private int canal;

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println(
                "A TV está " + (ligada ? "ligada" : "desligada") // IF TERNÁRIO
        );
    }

    public void aumentarVolume() {
        this.volume++;
        System.out.println("Volume aumentado para " + this.volume);
    }

    public void diminuirVolume() {
        this.volume--;
        System.out.println("Volume diminuído para " + this.volume);
    }

    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Canal alterado para " + this.canal);
    }

}
