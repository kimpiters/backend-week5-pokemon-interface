import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;
    private static final String type = "electric";
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    // Getters and Setters

    public List<String> getAttacks() {
        return attacks;
    }

    // Methods

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderpunch");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 10;
            }
            case "water" -> {
                damage = 20;
            }
            case "grass" -> {
                damage = 15;
            }
            case "electric" -> {
                damage = 5;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroball");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 4;
            }
            case "water" -> {
                damage = 8;
            }
            case "grass" -> {
                damage = 6;
            }
            case "electric" -> {
                damage = 2;
            }
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.setHp(enemy.getHp() - damage);
        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                int damage = 10;
                System.out.println(enemy.getName() + " loses " + damage + " hp");
                enemy.setHp(enemy.getHp() - damage);
            }
            case "water" -> {
                int damage = 20;
                System.out.println(enemy.getName() + " loses " + damage + " hp");
                enemy.setHp(enemy.getHp() - damage);
            }
            case "grass" -> {
                int damage = 15;
                System.out.println(enemy.getName() + " loses " + damage + " hp");
                enemy.setHp(enemy.getHp() - damage);
            }
            case "electric" -> {
                int boost = 10;
                System.out.println(enemy.getName() + " gains " +  boost + " hp");
                enemy.setHp(enemy.getHp() + boost);
            }
        }

        if (enemy.getHp() > 0) {
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volttackle");
        String enemyType = enemy.getType();
        int damage = 0;
        switch (enemyType) {
            case "fire" -> {
                damage = 10;
            }
            case "water" -> {
                damage = 20;
            }
            case "grass" -> {
                damage = 19;
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

}
