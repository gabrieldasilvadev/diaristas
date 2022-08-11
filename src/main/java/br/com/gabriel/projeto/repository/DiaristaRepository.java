/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabriel.projeto.repository;

import br.com.gabriel.projeto.models.Diarista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class DiaristaRepository implements IRepository<Diarista, Long> {

  private List<Diarista> diaristas;

  private Long idAtual;

  public DiaristaRepository() {
    diaristas = new ArrayList<>();
    idAtual = 1L;
  }

  @Override
  public List<Diarista> buscarTodos() {
    return diaristas;
  }

  @Override
  public Diarista cadastrar(Diarista model) {
    model.setId(idAtual);

    diaristas.add(model);
    idAtual++;
    return model;
  }

  @Override
  public Diarista bucarPorId(Long id) {
    for (Diarista diarista : diaristas) {
      if (diarista.getId().equals(id)) {
        return diarista;
      }
    }
    return null;
  }

  @Override
  public boolean excluirPorId(Long id) {
    var diaristaEncontrada = bucarPorId(id);

    if (diaristaEncontrada != null) {
      diaristas.remove(diaristaEncontrada);
      return true;
    }

    return false;
  }
}
