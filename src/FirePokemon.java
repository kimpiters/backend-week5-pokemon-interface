import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;
    private static final String type = "fire";
    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    // Getters and Setters

    public List<String> getAttacks() {
        return attacks;
    }

    // Methods

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 5;
            }
            case "water" -> {
                damage = 15;
            }
            case "grass" -> {
                damage = 20;
            }
            case "electric" -> {
                damage = 10;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroball");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 5;
            }
            case "water" -> {
                damage = 10;
            }
            case "grass" -> {
                damage = 12;
            }
            case "electric" -> {
                damage = 8;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with firelash");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 2;
            }
            case "water" -> {
                damage = 6;
            }
            case "grass" -> {
                damage = 8;
            }
            case "electric" -> {
                damage = 4;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flamethrower");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 10;
            }
            case "water" -> {
                damage = 17;
            }
            case "grass" -> {
                damage = 25;
            }
            case "electric" -> {
                damage = 15;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }
}
