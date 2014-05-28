package at.election;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ComputingSpec {
    private List<Result> results;

    @Before
    public void setup() {
        results = ElectionResult.instance.getResult();
    }

    @Test
    public void listTheResult() {
        for(Result result : results) {
            print(result);
        }
    }

    private void print(Result result) {
        System.out.println(result.getConstituency() + "\t||\t" + result.getParty() + "\t||\t" + result.getCandidate() + "\t||\t" + result.getVotes());
    }

}
