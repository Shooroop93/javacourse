package day11.task2.classes;

import day11.task2.Interface.PhysAttack;

public abstract class Hero implements PhysAttack {

    int health;
    double physDef;
    double magicDef;
    int physAtt;



    public Hero () {
        health = 100;
    }

    public void physicalAttack (Hero hero) {

        double dpsPhysical = physAtt * (1-hero.physDef);

        if (hero.health-dpsPhysical < 0) {
            hero.health = 0;
        } else {
            hero.health -= dpsPhysical;
        }


    }

}
