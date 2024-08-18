import java.util.Arrays;

import br.com.nicotsoukalas.moradias.Casa;

public class Main {
    public static void main(String[] args) {
        // Casa casa1 = new Casa(false);
        // Casa casa2 = new Casa(true);
        // Casa casa3 = new Casa();
        // casa3.inteligente = false;
        // casa1.inteligente = false;
        // casa2.inteligente = true;
        // casa1.acenderLuz();
        // casa2.acenderLuz();
        // casa3.acenderLuz();

        // casa3.nome = "Minha Casa";
        // System.out.println(casa3.nome);

        // Double soma = Matematica.soma(1.0, 1.0);
        // System.out.println(Matematica.limite);
        // System.out.println(soma);
        // Double somaNaoEstatica = new Matematica().somaNaoEstatica(1.0,1.0);
        // System.out.println(Matematica.limite);
        // System.out.println(somaNaoEstatica);
        // System.out.println(soma);

        Usuario u1 = new Usuario();
        u1.username = "u1";
        Usuario u2 = new Usuario();
        u2.username = "u1";
        System.out.println(u1.equals(u2));
        // System.out.println(u1);
        // System.out.println(u2);
        System.out.println("String 1".equals("String 1"));
        Usuario[] array1 = { u1, u2 };
        
        Usuario u3 = new Usuario();
        u3.username = "u1";
        Usuario u4 = new Usuario();
        u4.username = "u1";
        Usuario[] array2 = { u3, u4 };

        System.out.println(Arrays.equals(array1, array2));
    }
}
