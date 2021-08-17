package day11.task2.classes;

import day11.task2.Interface.Healer;
import day11.task2.Interface.MagicalAttack;
import day11.task2.Interface.PhysAttack;

import java.util.StringJoiner;

public class Shaman extends Hero implements PhysAttack, MagicalAttack, Healer {

    private double magicAtt = 15;

    public Shaman () {

        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;

    }


    @Override
    public void magicalAttack(Hero hero) {

        double dpsMagic = magicAtt * (1- hero.magicDef);

        if ((hero.health- dpsMagic) < 0) {
            hero.health = 0;
        } else {
            hero.health -= dpsMagic;
        }

    }

    @Override
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        } else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {

        if (hero.health + 30 > 100) {
            hero.health = 100;
        } else {
            hero.health += 30;
        }

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Shaman.class.getSimpleName() + "[", "]")
                .add("health=" + health)
                .toString();
    }
}
