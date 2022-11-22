package org.example;

public class Main {
    public static void main(String[] args) {

        SonicBlaster sonicblaster = new SonicBlaster();
        Lightsaber lightsaber = new Lightsaber();
        LongBow longBow = new LongBow();
        Robot robot_one = new Robot("Number 5", longBow);
        Robot robot_two = new Robot("Bender", sonicblaster);
        Robot robot_three = new Robot("C3-P0", lightsaber);
        System.out.println(robot_one.name);
        System.out.println(robot_two.name);
        robot_one.Attack();
        robot_two.Attack();
    }
}