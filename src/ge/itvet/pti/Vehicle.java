package ge.itvet.pti;

import java.util.Random;
import java.util.UUID;
import java.util.Objects;


public class Vehicle {
    private static final Random RANDOM = new Random();
    private final String vin = UUID.randomUUID().toString();
    private final Engine engine;
    private final int seats;
    private final double brakingEfficiency;

    {
        engine = new Engine();
        Integer volume = engine.getVolumeInCC();
        seats = 2 + RANDOM.nextInt(volume != null && volume < 2200 ? 3 : 8);
        brakingEfficiency = (1 + RANDOM.nextInt(999)) / 10.;
    }

    public double getBrakingEfficiency() {
        return brakingEfficiency;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public String getVin() {
        return vin;
    }

    public boolean isMinivan(int seats){
        return seats > 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getSeats() == vehicle.getSeats() && Double.compare(vehicle.getBrakingEfficiency(), getBrakingEfficiency()) == 0 && Objects.equals(getVin(), vehicle.getVin()) && Objects.equals(getEngine(), vehicle.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVin(), getEngine(), getSeats(), getBrakingEfficiency());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", engine=" + engine +
                ", seats=" + seats +
                ", brakingEfficiency=" + brakingEfficiency +
                '}';
    }

}
