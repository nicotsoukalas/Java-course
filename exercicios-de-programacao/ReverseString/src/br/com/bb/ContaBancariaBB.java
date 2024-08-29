package br.com.bb;

public class ContaBancariaBB {

    public String titular;
    public double saldo;

    public ContaBancariaBB(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void atualizarSaldo(double valor) {
        saldo += valor;
    }

    public String toString() {
        return "{ Titular: " + this.titular.toString() + ", Saldo: " + this.saldo + " }";
    }
}
