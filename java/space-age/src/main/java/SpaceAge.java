import java.rmi.MarshalException;
import java.time.temporal.Temporal;

class SpaceAge {

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    private double getAgeOnPlanet(Planet planet) {
        return seconds / planet.getOrbitalPeriodInEarthSeconds();
    }

    double onEarth() {
        return getAgeOnPlanet(Planet.EARTH);
    }

    double onMercury() {
        return getAgeOnPlanet(Planet.MERCURY);
    }

    double onVenus() {
        return getAgeOnPlanet(Planet.VENUS);
    }

    double onMars() {
        return getAgeOnPlanet(Planet.MARS);
    }

    double onJupiter() {
        return getAgeOnPlanet(Planet.JUPITER);
    }

    double onSaturn() {
        return getAgeOnPlanet(Planet.SATURN);
    }

    double onUranus() {
        return getAgeOnPlanet(Planet.URANUS);
    }

    double onNeptune() {
        return getAgeOnPlanet(Planet.NEPTUNE);
    }

    private enum Planet {
        MERCURY (0.2408467),
        VENUS (0.61519726),
        EARTH (1),
        MARS (1.8808158),
        JUPITER (11.862615),
        SATURN (29.447498),
        URANUS (84.016846),
        NEPTUNE (164.79132);

        private static final long SECONDS_IN_YEAR = 31557600;

        double orbitalPeriodInEarthSeconds;

        Planet(double earthYears) {
            orbitalPeriodInEarthSeconds = SECONDS_IN_YEAR * earthYears;
        }

        public double getOrbitalPeriodInEarthSeconds() {
            return orbitalPeriodInEarthSeconds;
        }
    }

}
