package org.example.bonuses;

import org.example.characters.Character;

public class BonusStat implements BonusBehavior {
    private Character character;

    public BonusStat(Character character) {
        this.character = character;
    }

    public Integer getBonus() {
        return (character.getAmount() - 10)/2;
    }

    public String getTitle() {
        return "You have bonus for stat " + this.character.getClass().getSimpleName() + " " + getBonus();
    }
    public Character getCharacter(){
        return character;
    }
}
