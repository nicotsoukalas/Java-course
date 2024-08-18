package br.com.nicotsoukalas.moradias;

public class Casa {
    public Boolean inteligente = false; 
    public String nome; 

    public Casa() {
    }

    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }

    public void acenderLuz() {
        if (inteligente) 
            System.out.println("Comando de voz");
            else 
            System.out.println("Pressionar interruptor");
        
    }
}
