package com.dmitriyz;

public class Donut extends Shorty {
    public Donut(float moneyAmount) {
        super("Пончик", moneyAmount);
    }

    @Override
    public void sayHi() {
        System.out.println(getName() + ": Я люблю параболоиды, а ещё я " + getCircs());
    }

}
