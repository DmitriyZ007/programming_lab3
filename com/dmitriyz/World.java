package com.dmitriyz;

public class World {
    public static final float CURRENCY_VALUE = 3000.0f;


    public static void main(String[] args) {
        Shorty.setCurrencyValue(CURRENCY_VALUE);

        Shorty[] people = new Shorty[6];
        people[0] = new Shorty("Спрутс", 3300);
        people[1] = new Shorty("Дубс", 3500);
        people[2] = new Donut(4000);
        people[3] = new Shorty("Грязинг", 5500);
        people[4] = new Shorty("Дрянинг", 4300);
        people[5] = new Shorty("Скуперфильд", 6000);
        System.out.println();

        SeaAttraction[] attractions = new SeaAttraction[4];
        attractions[0] = new SeaParaboloid("DragonForce");
        attractions[1] = new SeaParaboloid("RoyalScramble");
        attractions[2] = new SeaFerrisWheel("RearPunch");
        attractions[3] = new SeaFerrisWheel("SpaceStellar");

        for (Shorty shorty : people) {
            System.out.println();
            if (shorty.getPosition() == Position.GROUND) {
                shorty.swim();
            }
            shorty.setPosition(attractions[shorty.chooseAttraction()].throwObject(shorty.getName()));
            if (shorty.getPosition() == Position.AIR) {
                shorty.fall();
            } else {
                shorty.slide();
            }
        }
    }

}
