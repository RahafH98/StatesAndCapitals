package statesandcapitals;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StatesAndCapitals {
    private final Map<String, String> statesAndCapitals;

    public StatesAndCapitals(Map<String, String> statesAndCapitals) {
        this.statesAndCapitals = statesAndCapitals;
    }

    public boolean doesStateExist(String state) {
        return statesAndCapitals.containsKey(state);
    }

    public boolean doesCapitalExist(String capital) {
        return statesAndCapitals.containsValue(capital);
    }

    public boolean doesStateAndCapitalMatch(String state, String capital) {
        return statesAndCapitals.containsKey(state) && statesAndCapitals.get(state).equals(capital);
    }

    public Collection<String> getAllStates() {
        return statesAndCapitals.keySet();
    }

    public Collection<String> getAllCapitals() {
        return statesAndCapitals.values();
    }
}


