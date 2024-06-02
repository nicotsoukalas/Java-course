import br.com.nicotsoukalas.moradias.Casa;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(false);
        Casa casa2 = new Casa(true);
        Casa casa3 = new Casa();

        // casa3.inteligente = false;

        // casa1.inteligente = false;
        // casa2.inteligente = true;
        casa1.acenderLuz();
        casa2.acenderLuz();
        casa3.acenderLuz();

        casa3.nome = "Minha Casa";
        System.out.println(casa3.nome);
    }
}
