import java.security.SecureRandom;
import java.util.Arrays;

import static java.lang.Math.floor;

class DnDCharacter {

    private final SecureRandom numberGenerator;

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitPoints;

    public DnDCharacter() {
        numberGenerator = new SecureRandom();

        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();

        hitPoints = 10 + modifier(constitution);
    }

    private int rollDie() {
        return numberGenerator.nextInt(6) + 1;
    }

    int ability() {
        int[] rolls = {rollDie(), rollDie(), rollDie(), rollDie()};

        return Arrays.stream(rolls)
                .sorted()
                .skip(1)
                .sum();
    }

    int modifier(int input) {
        return (int) floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitPoints;
    }
}
