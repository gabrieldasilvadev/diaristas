/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gabriel.projeto.repository;

import java.util.List;

/**
 *
 * @author gabriel
 */
public interface IRepository<T, ID> {
  
  List<T> buscarTodos();
  
  T cadastrar(T model);
  
  T bucarPorId(ID id);
  
  boolean excluirPorId(ID id);
  
}
