package org.example;

public class Dinosaur implements Attacker{

    public String name;
    public String attackMethod;
    public int attackPower;

    public Dinosaur(String name, String attackMethod, int attackPower) {
        this.name = name;
        this.attackMethod = attackMethod;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.attackMethod + " for " + this.attackPower + " damage!");
    }
}
