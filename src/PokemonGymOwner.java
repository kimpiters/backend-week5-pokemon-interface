import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{
    String name;
    String town;
    List<Pokemon> pokemons;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);

        this.town = town;
    }

    // Getters and Setters

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
