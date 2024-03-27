package org.example.cobe;

import java.util.Random;

public class CubeWithBuff implements CubeBehavior{
    int buff;

    public CubeWithBuff(int buff) {
        this.buff = buff;
    }

    public Integer roll() {

        Integer roll = new Random().nextInt(buff) + 1;;
        System.out.println("Cube 20D = " +roll);
        return roll;
    }
}
