/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabriel.projeto.models;

/**
 *
 * @author gabriel
 */
public class Diarista extends Pessoa {
  
  Diarista() {}

  public Diarista(Long id, String nome, String telefone, String cpf, String endereco) {
    super(id, nome, telefone, cpf, endereco);
  }
  
    public Diarista(String nome, String telefone, String cpf, String endereco) {
    super(null, nome, telefone, cpf, endereco);
  }
 
}
