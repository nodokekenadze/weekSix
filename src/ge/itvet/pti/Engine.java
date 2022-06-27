package ge.itvet.pti;

import java.util.Objects;
import java.util.Random;

public class Engine {
    private final static Random R =new Random();
    private  final EngineType type;
    private   Integer volumeInCC;
    private int emission= (R.nextInt(99)+1)/10;



    public Engine(EngineType type) {
        this.type=type;
        if (type.hasEmission()){
            volumeInCC=R.nextInt(6000)+1000;
        }
        emission= Integer.parseInt(null);
        volumeInCC=null;
    }
    public Engine(){
        this(EngineType.values()[(int) (Math.random() * EngineType.values().length)]);

    }

    public EngineType getType() {
        return type;
    }

    public Integer getEmission() {
        return emission;
    }

    public Integer getVolumeInCC() {
        return volumeInCC;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type=" + type +
                ", volumeInCC=" + volumeInCC +
                ", emission=" + emission +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return getType() == engine.getType() && Objects.equals(getVolumeInCC(), engine.getVolumeInCC()) && Objects.equals(getEmission(), engine.getEmission());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getVolumeInCC(), getEmission());
    }
}
