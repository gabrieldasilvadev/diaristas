/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabriel.projeto.models;

import java.util.Objects;

/**
 *
 * @author gabriel
 */
public abstract class Pessoa {

  private Long id;
  private String nome;
  private String telefone;
  private String cpf;
  private String endereco;

  public Pessoa() {
  }

  public Pessoa(Long id, String nome, String telefone, String cpf, String endereco) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    this.cpf = cpf;
    this.endereco = endereco;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 97 * hash + Objects.hashCode(this.id);
    hash = 97 * hash + Objects.hashCode(this.nome);
    hash = 97 * hash + Objects.hashCode(this.telefone);
    hash = 97 * hash + Objects.hashCode(this.cpf);
    hash = 97 * hash + Objects.hashCode(this.endereco);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Pessoa other = (Pessoa) obj;
    return true;
  }

  @Override
  public String toString() {
    return "Pessoa{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", endereco=" + endereco + '}';
  }

}
