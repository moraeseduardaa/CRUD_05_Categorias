package com.moraes.categorias.service;

import com.moraes.categorias.model.CategoriaModel;
import com.moraes.categorias.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaModel criarCategoria(CategoriaModel categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }

    public List<CategoriaModel> findAll(){
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaModel> buscarCategoria(Long id){
        return categoriaRepository.findById(id);
    }

    public void deletarCategoria(Long id){
        categoriaRepository.deleteById(id);
    }

}
