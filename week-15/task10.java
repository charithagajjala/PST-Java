import java.util.*;

class TopNEngine {

    private Map<String, Double> map = new HashMap<>();

    public void addItem(String name, double score) {
        map.put(name, score);
    }

    public List<String> getTopN(int n) {
        return map.entrySet().stream()
            .sorted((a,b) -> Double.compare(b.getValue(), a.getValue()))
            .limit(n)
            .map(Map.Entry::getKey)
            .toList();
    }
}
