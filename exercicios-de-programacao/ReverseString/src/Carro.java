/*
 * Crie uma classe chamada Carro com os seguintes atributos:
 * modelo, ano, cor e velocidade.
 * Adicione um método chamado acelerar
 * que aumenta a velocidade em 10 unidades.
 * Finalmente, crie um método getDetalhes,
 * que imprima todas as informações do carro no seguinte formato:
 * "Modelo: Fusca Ano: 2020 Cor: Azul Velocidade: 10".
 * Crie um construtor que inicializa todos os atributos.
 * Na classe Main, instancie um objeto da classe Carro chamado meuCarro
 * com o modelo "Fusca", ano 2020, e cor "azul", via construtor.
 * Acelere o carro chamando o método acelerar e 
 * imprima o valor retornado pela operação getDetalhes.
 */
public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;
    
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    
    public void acelerar() {
        velocidade += 10;
    }
    
    public String getDetalhes() {
        return "Modelo: " + modelo + " Ano: " + ano + " Cor: " + cor + " Velocidade: " + velocidade; 
        
    }
}
