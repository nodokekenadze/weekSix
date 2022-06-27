package ge.itvet.pti;

import java.util.ArrayList;
import java.util.List;

public class InspectionCenter {
    private static InspectionRules rule;

    public static void setRule(InspectionRules rule) {
        InspectionCenter.rule = rule;
    }

    public static List<InspectionFaultyTypes> inspection(Vehicle vehicle) {
        List<InspectionFaultyTypes> list = new ArrayList<>();
        if (vehicle.getEngine().getType().hasEmission()) {
            if (vehicle.getEngine().getEmission() > rule.engineMaxEmission.get(vehicle.getEngine().getType())) {
                list.add(InspectionFaultyTypes.EMISSION);
            }
        }
        if (vehicle.getBrakingEfficiency() >= rule.getBreakingEfficiencyMinRequirements()) {
            list.add(InspectionFaultyTypes.BREAkING);
        }
        if (list.isEmpty()) {
            list.add(InspectionFaultyTypes.NONE);
        }
        return list;
    }
}
