package org.example.cobe;

import java.util.Random;

public class CubeD20 implements CubeBehavior {

    public Integer roll() {
        Integer roll = new Random().nextInt(20) + 1;;
        System.out.println("Cube 20D = " +roll);
        return roll;
    }
}
