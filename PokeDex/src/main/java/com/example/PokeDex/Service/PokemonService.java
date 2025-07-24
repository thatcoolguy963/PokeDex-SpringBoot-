package com.example.PokeDex.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.stereotype.Service;

import Model.PokemonModel;


@Service
public class PokemonService {
    
    
    public List<PokemonModel> pokemonList = new ArrayList<>();
  
   PokemonService() {
    pokemonList.add(new PokemonModel(1, "Charizard", "Fire"));
    pokemonList.add(new PokemonModel(2, "Venusaur", "Grass/Poison"));
    pokemonList.add(new PokemonModel(3, "Blastoise", "Water"));
    pokemonList.add(new PokemonModel(4, "Pidgeot", "Normal/Flying"));
    pokemonList.add(new PokemonModel(5, "Raichu", "Electric/Psychic"));
    pokemonList.add(new PokemonModel(6, "Nidoqueen", "Poison/Ground"));
     
     
}
  public List<PokemonModel> getAllPokemon() {
    return pokemonList;
  }
   

}


