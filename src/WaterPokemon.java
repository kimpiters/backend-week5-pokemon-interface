import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;
    private static final String type = "water";
    List<String> attacks = Arrays.asList("Surf", "Hydropump", "Hydrocanon", "Raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    // Getters and Setters

    public List<String> getAttacks() {
        return attacks;
    }

    // Methods

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with Surf");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 20;
            }
            case "water" -> {
                damage = 12;
            }
            case "grass" -> {
                damage = 15;
            }
            case "electric" -> {
                damage = 17;
            }
        }
        System.out.println(enemy + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy + " has " + enemy.getHp() + " hp left");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with Hydropump");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 10;
            }
            case "water" -> {
                damage = 4;
            }
            case "grass" -> {
                damage = 6;
            }
            case "electric" -> {
                damage = 8;
            }
        }
        System.out.println(enemy + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy + " has " + enemy.getHp() + " hp left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with Hydrocanon");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 8;
            }
            case "water" -> {
                damage = 2;
            }
            case "grass" -> {
                damage = 4;
            }
            case "electric" -> {
                damage = 6;
            }
        }
        System.out.println(enemy + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy + " has " + enemy.getHp() + " hp left");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with Raindance");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                int damage = 20;
                System.out.println(enemy + " loses " + damage + " hp");
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(enemy + " has " + enemy.getHp() + " hp left");
            }
            case "water" -> {
                int damage = 5;
                System.out.println(enemy + " loses " + damage + " hp");
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(enemy + " has " + enemy.getHp() + " hp left");
            }
            case "grass" -> {
                int boost = 10;
                System.out.println(enemy + " gains " + boost + " hp");
                enemy.setHp(enemy.getHp() + boost);
                System.out.println(enemy + " has " + enemy.getHp() + " hp left");
            }
            case "electric" -> {
                System.out.println("Raindance has no effect on " + enemy);
            }
        }
    }




}
