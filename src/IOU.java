import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iouList;

    public IOU() {
        this.iouList = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        iouList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return iouList.getOrDefault(toWhom, 0.0);
    }
}
