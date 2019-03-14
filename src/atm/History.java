package atm;

import java.util.ArrayList;

public class History {
    private ArrayList<String> history = new ArrayList<>();

    public void setHistory(String transaction, double value) {
        history.add(transaction + " : " + value);

    }

    public String getHistory(int index) {
        if (index > 0 && index <= history.size()) {
            return (history.get(index-1));
        }
        if(index ==0)
            return "Begin of history";
        return "End of history";

    }
    public boolean size(int x){
        return (x<=history.size());

    }
    public int size(){
        return history.size();
    }

    public void delete(){
        history.remove(0);

    }
}