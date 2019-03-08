package ATM;

import java.util.ArrayList;

public class History {
    private ArrayList<String> history = new ArrayList<>();

    void setHistory(String transction, double value) {
        history.add(transction + " : " + value);

    }

    void getHistory(int index) {
        System.out.println(history.get(index));
    }
}