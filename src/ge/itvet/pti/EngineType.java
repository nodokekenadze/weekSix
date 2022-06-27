package ge.itvet.pti;

public enum EngineType {
    PETROL,
    DIESEL,
    ELECTRIC,
    HYBRID;

    public boolean hasEmission(){
        switch(this){
            case DIESEL:
            case PETROL:
            case HYBRID:
                return true;
        }
        return false;
    }
}
