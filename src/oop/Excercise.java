package oop;

public class Excercise {
    private String name;
    private int staminaModifier;
    private int strengthModifier;

    public Excercise(String name, int staminaModifier, int strengthModifier) {
        this.name = name;
        this.staminaModifier = staminaModifier;
        this.strengthModifier = strengthModifier;
    }

    public String getName() {
        return name;
    }

    public int getStaminaModifier() {
        return staminaModifier;
    }

    public int getStrengthModifier() {
        return strengthModifier;
    }

    public String toString(){
        return String.format(
                "%s: Stamina modifier: %d Strength modifier: %d",
                name, staminaModifier, strengthModifier
        );
    }
}
