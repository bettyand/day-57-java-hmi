import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iouList = new HashMap<>();

    public IOU() {}

    public void setSum(String toWhom, double amount) {
        iouList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return iouList.getOrDefault(toWhom, 0.0);
    }
}
