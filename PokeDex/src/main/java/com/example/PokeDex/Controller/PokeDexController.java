package com.example.PokeDex.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.PokeDex.Service.*;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


import Model.PokemonModel;


@RestController
@RequestMapping("/PokeDex")
public class PokeDexController {

    @Autowired
    PokemonService pokemonService;
    
    @GetMapping("/all")
    public List<PokemonModel> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }
    
@ExceptionHandler(Throwable.class)
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public String handleAllErrors(Throwable ex) {
    return "An error occurred: " + ex.getMessage();
}

    
   
}





