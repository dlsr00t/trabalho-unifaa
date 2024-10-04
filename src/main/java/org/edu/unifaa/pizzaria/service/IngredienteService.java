package org.edu.unifaa.pizzaria.service;

import org.edu.unifaa.pizzaria.model.Ingrediente;
import org.edu.unifaa.pizzaria.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


@Service
public class IngredienteService {
    @Autowired //To pedindo o controle dessa classe para eu utilizar.
    private IngredienteRepository ingredienteRepository;

        public Ingrediente adicionar(Ingrediente ingrediente){
            //Aqui eu poderia validar se todos os dados obrigatórios do ingrediente estão corretos.
            return ingredienteRepository.adicionar(ingrediente);
        }

        public List<Ingrediente> obterTodos(){
            return ingredienteRepository.obterTodos();
        }


        public Ingrediente obterPorId(long id){
            return ingredienteRepository.obterPorId(id);

        }
}
