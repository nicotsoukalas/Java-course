// Array de Tarefas
// Escreva um programa para gerenciar tarefas da seguinte forma:

// O programa permite que até 10 tarefas sejam cadastradas.
// Serão exibidas 3 opções: 1. Cadastrar tarefa, 2. Listar tarefas e 3. Sair
// Caso seja selecionada a opção 1, deve ler o número da tarefa (entre 1 e 10) e
// depois a tarefa em si, que será cadastrada na posição do array equivalente
// ao número da tarefa fornecido (ex: 0 no array é a primeira posição, 1 é a segunda, ...).
// Caso seja selecionada a opção 2, deve imprimir todas as tarefas encontradas no formato:

// Tarefa 1 - gfwgjf
// Tarefa 2 - kfhwekfjwhe
// Caso seja selecionada qualquer outra opção,
// o programa deve imprimir "Encerrando programa..." e deverá encerrar.

import java.util.Scanner;
 
public class Tarefas {
  public static void main(String[] args) {
    String[] tarefas = new String[] {
        "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };
    Scanner scanner = new Scanner(System.in);
 
    while (true) {
      // Lê opção (1 - Cadastrar, 2 - Exibir, Qualquer outra - Sair)
      System.out.println("Opções:");
      System.out.println("1. Cadastrar tarefa");
      System.out.println("2. Listar tarefas");
      System.out.println("3. Sair");
 
      int opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do teclado
 
      switch (opcao) {
        case 1 -> {
          System.out.println("Digite o número da tarefa (1 à 10):");
          int numeroTarefa = scanner.nextInt();
          scanner.nextLine(); // Limpar o buffer do teclado
 
          if (numeroTarefa <= 0 || numeroTarefa > 10) {
            System.out.println("Número da tarefa inválido.");
            continue;
          }
 
          System.out.println("Digite a tarefa:");
          String tarefa = scanner.nextLine();
          tarefas[numeroTarefa - 1] = tarefa;
        }
        case 2 -> {
          for (int i = 0; i < tarefas.length; i++) {
            System.out.printf(
                "Tarefa %d - %s%n", i + 1, tarefas[i]);
          }
        }
        default -> {
          System.out.println("Encerrando programa...");
          scanner.close();
          return;
        }
      }
    }
  }
}