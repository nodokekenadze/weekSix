package ge.itvet.pti;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InspectionRules {
    private static final Random RANDOM = new Random();
    private  double breakingEfficiencyMinRequirement;
    private double minivanEmissionImmunity=(RANDOM.nextInt(15)+5)/10.;
    public Map<EngineType, Double> engineMaxEmission=new HashMap<>();




    public double getBreakingEfficiencyMinRequirements() {
        return breakingEfficiencyMinRequirement;
    }

    public double getMinivanEmissionImmunity() {
        return minivanEmissionImmunity;
    }

    public InspectionRules( double BreakingEfficiencyMinRequirement, int minivanEmissionImmunity) {

        this.breakingEfficiencyMinRequirement = BreakingEfficiencyMinRequirement;
        this.minivanEmissionImmunity = minivanEmissionImmunity;


    }



    public void setMinivanEmissionImmunity(int minivanEmissionImmunity) {
        this.minivanEmissionImmunity = minivanEmissionImmunity;
    }

    public void setBreakingEfficiencyMinRequirements(double breakingEfficiencyMinRequirements) {
        this.breakingEfficiencyMinRequirement = breakingEfficiencyMinRequirements;
    }

    @Override
    public String toString() {
        return "InspectionRules{" +
                "breakinEfficiencyMinRequirment=" + breakingEfficiencyMinRequirement +
                ", minivanEmissionImmunity=" + minivanEmissionImmunity +
                ", engineMaxEmission=" + engineMaxEmission +
                '}';
    }
}



