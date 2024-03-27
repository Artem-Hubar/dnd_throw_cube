package org.example.payload;

import org.example.bonuses.BonusStat;
import org.example.bonuses.BonusBehavior;
import org.example.cobe.CubeD20;
import org.example.entity.Advantage;
import org.example.entity.Person;
import org.example.characters.Character;

public class GamePayload {
    private Character characterChecking;

    private Person person;
    private Integer amountAdvantage = 0;

    public GamePayload(Character characterChecking, Person person) {
        this.characterChecking = characterChecking;
        this.person = person;
    }
    private Integer rollByAdvantage(boolean advantagePresent){
        if (advantagePresent){
            Advantage advantage = person.getAdvantage();
            return advantage.roll();
        }else {
            System.out.println("Person doesn`t have advantage");
            return new CubeD20().roll();

        }
    }
    public void play(){
        System.out.println(characterChecking.getTitle() + "= " + characterChecking.getAmount());
        amountAdvantage = rollByAdvantage(person.AdvantagePresent());
        if (amountAdvantage == 20){
            System.out.println("You win");
            return;
        } else if (amountAdvantage <=1) {
            System.out.println("You lose");
            return;
        }else {

            if (person.getBonus() != null){

                for(BonusBehavior bonus : person.getBonus()){
                    if (bonus instanceof  BonusStat){
                        Character stat = ((BonusStat)bonus).getCharacter();
                        if (characterChecking.getClass() == stat.getClass()){
                            System.out.println(bonus.getTitle());
                            amountAdvantage += bonus.getBonus();
                        }
                    }else {
                        System.out.println(bonus.getTitle());
                        amountAdvantage += bonus.getBonus();
                    }
                }
            }
            System.out.println("проверка результата с классом сложности");
            System.out.println("static = "+ characterChecking.getAmount() + " наш бросок = " + amountAdvantage);
            if (characterChecking.getAmount() > amountAdvantage){
                System.out.println("You lose");
            }else {
                System.out.println("You win");
            }
        }
    }



}
