public class Aluno {

    // Atributos
    private String nome;
    public int setIdade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 130) {
            System.out.println("Idade cadastrada.");
        } else {
            System.out.println("Erro! Idade inválida");
        }
        
    }

}
