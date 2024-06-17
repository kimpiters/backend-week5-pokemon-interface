import java.util.List;

public class PokemonTrainer {
    String name;
    List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
