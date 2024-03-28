package iloveyouboss;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<Scorable> scores = new ArrayList<>();

    public void add(Scorable scorable){
        scores.add(scorable);
    }

    public int arithmeticMean(){
        int total = scores.stream().mapToInt(Scorable::getScore).sum();
        return total / scores.size();
    }
}
