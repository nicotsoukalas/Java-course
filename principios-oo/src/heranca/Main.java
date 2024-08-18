package heranca;

import heranca.superherois.HomemAranha;
import heranca.superherois.HomemDeFerro;
import heranca.superherois.SuperHeroi;
import heranca.superherois.ViuvaNegra;

public class Main {
    public static void main(String[] args) {
        SuperHeroi[] superHerois = {
            new HomemAranha("Roupa vermelha com teias", new String[] {"Lançar teia"}),
            new HomemDeFerro("Roupa vermelha super resistente", new String[] {"Usar traje de guerra"}),
            new ViuvaNegra("Roupa preta", new String[] {"Espiã"})
        };
 
        validar(superHerois);

        for (SuperHeroi superHeroi : superHerois) {
            System.out.println(superHeroi.getTraje());
            superHeroi.usarSuperPoder(0);
        }
    }

    static void validar(SuperHeroi[] superHerois) {
        if (superHerois[0] instanceof HomemAranha) {
            System.out.println("Lógica de validação do Homem Aranha...");
        }
    }
}
