package org.example.bonuses;

import org.example.cobe.CubeWithBuff;

public class BonusAdditionalCube implements BonusBehavior {
    private int additionalCube;

    public BonusAdditionalCube(int additionalCube) {
        this.additionalCube = additionalCube;
    }

    public Integer getBonus() {
        return new CubeWithBuff(additionalCube).roll();
    }

    public String getTitle() {
        return "You have bonus on additional cube";
    }
}
