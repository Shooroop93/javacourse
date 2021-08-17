package day11.task2.classes;

import day11.task2.Interface.PhysAttack;

import java.util.StringJoiner;

public class Warrior extends Hero {

    public Warrior () {
        magicDef = 0;
        physDef = 0.8;
        physAtt = 30;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Warrior.class.getSimpleName() + "[", "]")
                .add("health=" + health)
                .toString();
    }
}
