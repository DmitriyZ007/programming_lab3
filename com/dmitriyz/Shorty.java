package com.dmitriyz;

import java.util.Random;

public class Shorty implements ICommunicationActions, IPhysicMovement {
    private static float CURRENCY_VALUE;
    private final String NAME;
    private boolean appetite = false;
    private Position position = Position.GROUND;
    private String circs = "No_Data";
    private float moneyAmount;

    public Shorty(String name, float moneyAmount) {
        this.NAME = name;
        this.moneyAmount = moneyAmount;
        sayHi();
        checkMoney();
    }

    public static void setCurrencyValue(float currencyValue) {
        CURRENCY_VALUE = currencyValue;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position pos) {
        position = pos;
    }

    public String getCircs() {
        checkMoney();
        return circs;
    }

    public boolean isAppetite() {
        return appetite;
    }

    public void setAppetite(boolean appetite) {
        this.appetite = appetite;
    }

    public float getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(float moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getName() {
        return NAME;
    }

    private void checkMoney() {
        if (getMoneyAmount() < CURRENCY_VALUE)
            circs = "бедный";
        else circs = "богатый";
    }

    public int chooseAttraction() {
        Random random = new Random();
        return random.nextInt(4);
    }

    @Override
    public void sayHi() {
        System.out.println(NAME + ": Привет! Я " + getCircs());
    }

    @Override
    public void sayBye() {
        System.out.println(NAME + ": Пока!");
    }

    @Override
    public void sayHungry() {
        System.out.println(NAME + ": Хочу питсу");
    }

    @Override
    public void sayNotHungry() {
        System.out.println(NAME + ": Я не голоден");
    }

    @Override
    public void swim() {
        if (getPosition() == Position.GROUND) {
            setPosition(Position.WATER);
            System.out.println(getName() + " зашёл в воду");
        } else if (getPosition() == Position.WATER) {
            setPosition(Position.GROUND);
            System.out.println(getName() + " поплыл к берегу");
        }
    }

    @Override
    public void fall() {
        System.out.println(getName() + " плюхнулся в воду");
        setPosition(Position.WATER);
        setAppetite(true);
        sayHungry();
        swim();
        sayBye();
    }

    @Override
    public void slide() {
        setPosition(Position.WATER);
        sayNotHungry();
        swim();
        sayBye();
    }
}

