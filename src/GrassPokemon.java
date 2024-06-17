import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;
    private static final String type = "grass";
    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    // Getters and Setters

    public List<String> getAttacks() {
        return attacks;
    }

    // Methods

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafstorm");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 22;
            }
            case "water" -> {
                damage = 20;
            }
            case "grass" -> {
                damage = 17;
            }
            case "electric" -> {
                damage = 25;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarbeam");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 8;
            }
            case "water" -> {
                damage = 4;
            }
            case "grass" -> {
                damage = 6;
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

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechseed");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 15;
            }
            case "water" -> {
                damage = 10;
            }
            case "grass" -> {
                damage = 5;
            }
            case "electric" -> {
                damage = 20;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp\n" + name.getName() + " gains " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        name.setHp(name.getHp() + damage);

        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveblade");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 14;
            }
            case "water" -> {
                damage = 7;
            }
            case "grass" -> {
                damage = 8;
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
