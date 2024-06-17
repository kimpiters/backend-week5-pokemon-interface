import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;
    private static final String type = "water";
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    // Getters and Setters

    public List<String> getAttacks() {
        return attacks;
    }

    // Methods

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
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
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump");
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
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydrocanon");
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
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with raindance");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                int damage = 20;
                System.out.println(enemy.getName() + " loses " + damage + " hp");
                enemy.setHp(enemy.getHp() - damage);
            }
            case "water" -> {
                int damage = 5;
                System.out.println(enemy.getName() + " loses " + damage + " hp");
                enemy.setHp(enemy.getHp() - damage);
            }
            case "grass" -> {
                int boost = 10;
                System.out.println(enemy.getName() + " gains " + boost + " hp");
                enemy.setHp(enemy.getHp() + boost);
            }
            case "electric" -> {
                System.out.println("Raindance has no effect on " + enemy.getName());
            }
        }

        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }




}
