package com.dmitriyz;

public class SeaParaboloid extends SeaAttraction {
    static private final String TYPE = "Parabolloid";

    public SeaParaboloid(String name) {
        super(name, TYPE);
    }

    @Override
    public Position throwObject(String shortyName) {
        System.out.println("Морской параболлоид " + getNAME() + " подбрасывает в воздух коротышку " + shortyName);
        return Position.AIR;
    }

}
