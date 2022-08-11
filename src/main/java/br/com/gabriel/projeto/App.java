/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.com.gabriel.projeto;

import br.com.gabriel.projeto.models.Diarista;
import br.com.gabriel.projeto.repository.DiaristaRepository;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    var repository = new DiaristaRepository();

    var opcao = "q";

    do {
      System.out.println("");
      
      exibirMenu();

      System.out.print("Informe a opção desejada: ");
      opcao = scanner.nextLine();

      System.out.println("");

      switch (opcao) {
        case "1" ->
          listarDiaristas(repository);
        case "2" ->
          cadastrarDiarista(scanner, repository);
        case "3" ->
          buscarDiarista(scanner, repository);
        case "4" ->
          excluirDiarista(scanner, repository);
        case "q" ->
          System.out.println("Saindo do sistema...");
        default ->
          System.out.println("Opção Invalida.");
      }
    } while (!opcao.equals("q"));

    scanner.close();
  }

  private static void listarDiaristas(DiaristaRepository repository) {
    var diaristas = repository.buscarTodos();
    
    if(diaristas.isEmpty()) {
      System.out.println("Não existem diaristas cadastrados.");
    }
    
    for (Diarista diarista : diaristas) {
      System.out.println(diarista.getId() + " - " + diarista.getNome());
    }
  }

  private static void exibirMenu() {
    System.out.println("1 - Listar Diaristas");
    System.out.println("2 - Cadatastrar Diarista");
    System.out.println("3 - Buscar Diarista");
    System.out.println("4 - Excluir Diarista");
    System.out.println("q - Sair do Sistema");
  }

  private static void cadastrarDiarista(Scanner scanner, DiaristaRepository repository) {
    System.out.print("Nome: ");
    var nome = scanner.nextLine();
    System.out.print("Telefone: ");
    var telefone = scanner.nextLine();
    System.out.print("CPF: ");
    var cpf = scanner.nextLine();
    System.out.print("Endereço: ");
    var endereco = scanner.nextLine();

    var diarista = new Diarista(nome, telefone, cpf, endereco);

    repository.cadastrar(diarista);
    System.out.println("Diarista cadastrado com sucesso!");
  }

  private static void buscarDiarista(Scanner scanner, DiaristaRepository repository) {
    System.out.print("ID: ");
    var id = scanner.nextLong();
    scanner.nextLine();

    var diarista = repository.bucarPorId(id);

    if (diarista != null) {
      System.out.println(diarista.getId() + " - " + diarista.getNome());
    } else {
      System.out.println("Diarista não encontrado!");
    }
  }

  private static void excluirDiarista(Scanner scanner, DiaristaRepository repository) {
    System.out.print("ID: ");
    var id = scanner.nextLong();
    scanner.nextLine();

    try {
      var foiExcluido = repository.excluirPorId(id);

      if (foiExcluido) {
        System.out.println("Diarista exlcuido com sucesso!");
      } else {
        System.out.println("Diarista não existe! Por favor informar um ID válido.");
      }
    } catch (Exception e) {
      System.out.println("Falha ao excluir diarista! - " + e.getMessage());
    }
  }
}
