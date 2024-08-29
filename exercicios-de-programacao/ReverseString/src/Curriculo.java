/*
 * Escreva uma classe chamada Curriculo para montar o seu currículo profissional.
 * Ela deve ter atributos nome, idade, competencias e experiencias.
 * Além disso, deve ter um método sobreMim que imprime um resumo do currículo
 * da seguinte forma: "Olá, eu sou Giuliana, trabalho com [Java],
 * e minhas experiências foram [Instrutora Online, Desenvolvedora]".

Esse exercício é para praticar a sintaxe de uso de uma classe 
com atributos e métodos, então aproveite para reforçar o conteúdo estudado!
 */

 import java.util.Arrays;
 
 public class Curriculo {
     public String nome = "Giuliana Bezerra";
     public Integer idade = 34;
     public String[] competencias = { "Java" };
     public String[] experiencias = { "Instrutora Online", "Desenvolvedora" };
     
     public String sobreMim() {
         return "Olá, eu sou " + nome + 
         ", tenho " + idade + " anos, trabalho com " +
         Arrays.toString(competencias) + ", e minhas experiências foram " + Arrays.toString(experiencias);
     }
 }
