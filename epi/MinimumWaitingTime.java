package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.Collections;
import java.util.List;
public class MinimumWaitingTime {
  @EpiTest(testDataFile = "minimum_waiting_time.tsv")

  public static int minimumTotalWaitingTime(List<Integer> serviceTimes) {
    // TODO - you fill in here.
	Collections.sort(serviceTimes);
	int totalWaitingTime = 0;
	for(int i = 0; i < serviceTimes.size(); i++) {
		int duration = serviceTimes.get(i);
		int numRemainingServices = serviceTimes.size() - (i+1);
		totalWaitingTime += duration*numRemainingServices;
	}
    return totalWaitingTime;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "MinimumWaitingTime.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
