package org.example.entity;

import org.example.bonuses.BonusBehavior;
import org.example.bonuses.BonusStat;
import org.example.characters.Character;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Character> character = new ArrayList<>();
    private Advantage advantage;
    private ArrayList<BonusBehavior> BonusBehavior = new ArrayList<>();

    public ArrayList<BonusBehavior> getBonus() {
        return BonusBehavior;
    }

    public void setBonus(ArrayList<BonusBehavior> bonusStats) {
        this.BonusBehavior = bonusStats;
    }

    public Person(String name, ArrayList<Character> character, Advantage advantage, ArrayList<BonusBehavior> bonusStats) {
        this.name = name;
        this.advantage = advantage;
        this.BonusBehavior = bonusStats;
        addStat(character);
    }

    public Person(String name, ArrayList<Character> character) {
        this.name = name;
        this.character = character;
    }

    private void addStat(ArrayList<Character> characters){
        for(Character character : characters){
            this.character.add(character);
            this.BonusBehavior.add(new BonusStat(character));
        }
    }

    public boolean AdvantagePresent(){
        return advantage != null;
    }

    public Advantage getAdvantage() {
        return advantage;
    }

    public void setAdvantage(Advantage advantage) {
        this.advantage = advantage;
    }

    public Person(String name, ArrayList<Character> character, Advantage advantage) {
        this.name = name;
        addStat(character);
        this.advantage = advantage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Character> getCharacter() {
        return new ArrayList<Character>(character);
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }
}
