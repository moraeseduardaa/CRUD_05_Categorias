package com.moraes.categorias.controller;

import com.moraes.categorias.model.CategoriaModel;
import com.moraes.categorias.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public CategoriaModel criarCategoria(@RequestBody CategoriaModel produtoModel){
        return categoriaService.criarCategoria(produtoModel);
    }

    @GetMapping
    public List<CategoriaModel> listarCategoria(){
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CategoriaModel> buscarCategoria(@PathVariable  Long id){
        return categoriaService.buscarCategoria(id);
    }

    @DeleteMapping("/{id}")
    public void deletarCategoria(@PathVariable Long id){
        categoriaService.deletarCategoria(id);
    }

}
