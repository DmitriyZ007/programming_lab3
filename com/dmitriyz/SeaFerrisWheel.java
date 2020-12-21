package com.dmitriyz;

public class SeaFerrisWheel extends SeaAttraction {
    static private final String TYPE = "FerrisWheel";

    public SeaFerrisWheel(String name) {
        super(name, TYPE);
    }

    @Override
    public Position throwObject(String shortyName) {
        System.out.println(shortyName + " скатился с чёртова колеса " + getNAME());
        return Position.WATER;
    }

}
