public class TesteJogo {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Alice");
        Jogador jogador2 = new Jogador("Bob");

        // Alice derrota um monstro
        jogador1.derrotarMonstro();
        // Bob derrota um monstro
        jogador2.derrotarMonstro();

        // Imprimindo os placares
        System.out.println("Placar individual de Alice: " + jogador1.placarIndividual); // 1
        System.out.println("Placar individual de Bob: " + jogador2.placarIndividual);   // 1
        System.out.println("Placar geral: " + Jogador.placarGeral);                      // 2
    }
}

