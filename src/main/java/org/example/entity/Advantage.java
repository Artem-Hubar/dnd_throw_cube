package org.example.entity;

import org.example.cobe.CubeD20;

public class Advantage {
    private boolean advantage;


    public void setAdvantage(boolean advantage) {
        this.advantage = advantage;
    }

    public Advantage(boolean advantage) {
        this.advantage = advantage;
    }
    public Integer roll(){
        Integer answer = 0;
        String title;

        if (advantage){
            title = "advantage";
        }else {
            title = "помеха";
        }
        System.out.println("active buff - " + title);
        System.out.println("first roll");
        CubeD20 cubeD20 = new CubeD20();
        Integer firstRoll = cubeD20.roll();
        System.out.println("second roll");
        Integer secondRoll = cubeD20.roll();
        if (advantage){
            if (firstRoll >= secondRoll){
                answer = firstRoll;

            }else {
                answer = secondRoll;
            }
        }else {
            if (firstRoll <= secondRoll){
                answer = firstRoll;

            }else {
                answer = secondRoll;
            }
        }
        return answer;
    }
}
