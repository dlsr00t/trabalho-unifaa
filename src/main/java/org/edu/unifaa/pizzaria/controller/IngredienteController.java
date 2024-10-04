package org.edu.unifaa.pizzaria.controller;

import org.edu.unifaa.pizzaria.model.Ingrediente;
import org.edu.unifaa.pizzaria.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/ingredientes")
public class IngredienteController {
    
    @Autowired
    private IngredienteService ingredienteService;

    @PostMapping
    public Ingrediente adicionar(@RequestBody Ingrediente ingrediente){
        return ingredienteService.adicionar(ingrediente);
    }
    @GetMapping
    public List<Ingrediente> obterTodos(){
        return ingredienteService.obterTodos();

    }
    @GetMapping("/{id}")
    public Ingrediente obterPorId(@PathVariable long id){
        return ingredienteService.obterPorId(id);
    }


    //CRUD (GET, POST, PUT, DELETE)

}


//http://localhost:8080/api/ingredientes