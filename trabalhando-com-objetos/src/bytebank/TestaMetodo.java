package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = 
                contaDaMarcela.transfere(3000, contaDoPaulo);
        if (sucessoTransferencia) {
            System.out.println("Transferência com sucesso!");
        }else {
            System.out.println("Faltou dinheiro!");
        };

        System.out.println("conta da Marcela " + contaDaMarcela.saldo);
        System.out.println("conta do Paulo " + contaDoPaulo.saldo);

        contaDoPaulo.titular = "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);

    }
}
