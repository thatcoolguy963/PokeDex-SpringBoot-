package Model;

import java.util.ArrayList;
import java.util.List;

public class PokemonModel {
    
        private int id;
        private String name;
        private String type;
        private List<PokemonModel> pokemonList = new ArrayList<>();
    
        public PokemonModel() {
    
        }
    
       public PokemonModel(int id, String name, String type) {
             this.id = id;
             this.name = name;
             this.type = type;
        }
    
        public int getPokemonId() {
            return id;
        }
        public String getPokemonName() {
            return name;
        }
        public String getPokemonType() {
            return type;
        }
        public List<PokemonModel> getAllPokemon() {
            return pokemonList;
        }
    
        public void setPokemonId(int id) {
              this.id = id;
        }
    
        public void setPokemonName(String name) {
               this.name = name;
        }
        public void setPokemonType(String type) {
               this.type = type;
        }
    
    }
    

