package day11.task2.classes;

import day11.task2.Interface.MagicalAttack;

import java.util.StringJoiner;

public class Magician extends Hero implements MagicalAttack {

    private double magicAtt = 20;

    public Magician() {

        physDef = 0;
        physAtt = 5;
        magicDef = 0.8;

    }

    @Override
    public void magicalAttack(Hero hero) {
        double dpsMagic = magicAtt * (1-hero.magicDef);

        if ((hero.health- dpsMagic) < 0) {
            hero.health = 0;
        } else {
            hero.health -= dpsMagic;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Magician.class.getSimpleName() + "[", "]")
                .add("health=" + health)
                .toString();
    }
}
