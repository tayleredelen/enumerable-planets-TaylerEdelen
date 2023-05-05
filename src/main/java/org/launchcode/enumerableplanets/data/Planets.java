package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, "Does not have water"),
    VENUS("Venus", 225, "Does not have water"),
    EARTH("Earth", 365, "Has water"),
    MARS("Mars", 687, "Does not have water"),
    JUPITER("Jupiter", 4333, "Does not have water"),
    SATURN("Saturn", 10759, "Does not have water"),
    URANUS("Uranus", 30687, "Has water"),
    NEPTUNE("Neptune", 60200, "Has water"),
    PLUTO("Pluto", 248, "Has water");


    //field
    private final String name;
    private final Integer yearLength;
    private final String hasWater;

    //constructor

    Planets(String name, Integer yearLength, String hasWater) {
        this.name = name;
        this.yearLength = yearLength;
        this.hasWater = hasWater;
    }


    //getter
    public String getName() {
        return name;
    }

    public Integer getYearLength() {
        return yearLength;
    }

    public String getHasWater() {
        return hasWater;
    }
}
