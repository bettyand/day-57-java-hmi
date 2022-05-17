import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.facility.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> unitContents = this.facility.get(storageUnit);
        for (String content : unitContents) {
            if (content.equalsIgnoreCase(item)) {
                unitContents.remove(item);
                break;
            }
        }
        if (unitContents.size() == 0) {
            this.facility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.facility.keySet()) {
            if (unit.length() > 0) {
                units.add(unit);
            }
        }
        return units;
    }
}
