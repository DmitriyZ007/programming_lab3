package com.dmitriyz;

public abstract class SeaAttraction implements IRotateForces {
    private final String NAME;
    private final String TYPE;

    public SeaAttraction(String name, String type) {
        NAME = name;
        TYPE = type;
        System.out.println("Морской аттракцион " + NAME + " типа " + TYPE + " поставлен");
    }

    public String getNAME() {
        return NAME;
    }

    public abstract Position throwObject(String shortyName);
}
