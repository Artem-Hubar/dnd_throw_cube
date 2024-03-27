package org.example.bonuses;

public class BonusStatic implements BonusBehavior {
    private Integer bonus;

    public BonusStatic(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getBonus() {
        return bonus;
    }
    public String getTitle() {
        return "You have bonus for static " + bonus;
    }
}
