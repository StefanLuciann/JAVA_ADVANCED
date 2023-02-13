package enums;

public enum Planet {
    VENUS("huge","Venus",300),
    MARS("small","Mars",200),
    URANUS("medium","Uranus",100),
    MERCUR("large","Mercur",900);

    private final String sizeOfPlanet;
    private final String planetName;

    private final long distanceFromEarth;

    Planet(String sizeOfPlanet, String planetName, long distanceFromEarth) {
        this.sizeOfPlanet = sizeOfPlanet;
        this.planetName = planetName;
        this.distanceFromEarth = distanceFromEarth;
    }

    public long getDistanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return sizeOfPlanet + " " + planetName;
    }
}