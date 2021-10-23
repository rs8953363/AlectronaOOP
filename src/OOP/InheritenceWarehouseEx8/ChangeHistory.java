package OOP.InheritenceWarehouseEx8;

import java.util.ArrayList;

public class ChangeHistory {
    ArrayList<Double> history = new ArrayList<>();
    public ChangeHistory() {
    }
    public void add(double status){
        history.add(status);
    }
    public void clear(){
        history.clear();
    }
public double maxValue(){
       double max=0.0;
       if (!history.isEmpty())
           for (Double item: history) {
        if (item >= max)
            max = item;
           }
    return max;
    }

    public double minValue(){
        double min=0.0;
        if (!history.isEmpty())
            for (Double item: history) {
                if (item <= min)
                    min = item;
            }
        return min;
    }
public double average(){
        double average = 0.0;
        double sum = 0.0;
        if (!history.isEmpty()){
            for (Double item : history){
                sum = sum+item;
            }
            average = sum /history.size();
        }
        return average;
        }
        
    @Override
    public String toString() {
        return "ChangeHistory{" +
                "history=" + history +
                '}';
    }
}
