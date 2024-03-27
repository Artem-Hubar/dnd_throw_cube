package org.example;

import org.example.bonuses.BonusAdditionalCube;
import org.example.bonuses.BonusBehavior;
import org.example.bonuses.BonusStatic;
import org.example.characters.Agility;
import org.example.characters.Intellect;
import org.example.entity.Advantage;
import org.example.entity.Person;
import org.example.characters.Character;
import org.example.payload.GamePayload;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Character checkingCharacter = new Intellect(20);

        ArrayList<Character> charPerson = new ArrayList<>();
        ArrayList<BonusBehavior> bonuses = new ArrayList<>();
        bonuses.add(new BonusStatic(3));
        bonuses.add(new BonusAdditionalCube(4));
        charPerson.add(new Intellect(15));
        charPerson.add(new Agility(14));
        Person person = new Person("Dratar",charPerson, new Advantage(true), bonuses);
        GamePayload gamePayload = new GamePayload(checkingCharacter, person);
        gamePayload.play();
    }
}
