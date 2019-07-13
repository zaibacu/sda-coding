package oop;

public class Trainee {
    private String name;
    private int stamina;
    private int strength;
    private final int maxStamina;

    public Trainee(String name, int stamina, int strength) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
        this.maxStamina = stamina;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void doExcercise(Exercise exercise){
        System.out.printf("Doing %s\n", exercise);
        this.stamina -= exercise.getStaminaModifier();
        this.strength += exercise.getStrengthModifier();
        printStats();
    }

    public void consumeSupplement(Supplement supplement){
        System.out.printf("Consuming %s\n", supplement);
        this.stamina += supplement.getStaminaModifier();
        this.stamina = Math.min(maxStamina, stamina);
        printStats();
    }

    public void printStats(){
        System.out.printf("Stamina: %d, Strength: %d\n", stamina, strength);
    }
}
