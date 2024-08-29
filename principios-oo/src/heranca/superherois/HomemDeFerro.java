package heranca.superherois;

import java.util.Arrays;

public class HomemDeFerro extends SuperHeroi{

    public HomemDeFerro(String traje, String[] superPoderes) {
        super(traje, superPoderes);
        System.out.println("Homem de Ferro!");
    }

    public void usarSuperPoder(int index) {
        System.out.println(Arrays.toString(superPoderes));
        System.out.println("Falar com Jarvis");
        super.usarSuperPoder(index);
    } 

}

