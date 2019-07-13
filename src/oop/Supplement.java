package oop;

public class Supplement extends Exercise {
    public Supplement(String name, int staminaModifier) {
        super(name, staminaModifier, 0);
    }

    public String toString(){
        return String.format(
                "%s: Stamina modifier: %d",
                getName(), getStaminaModifier()
        );
    }
}
