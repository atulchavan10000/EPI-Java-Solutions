package epi;
import java.util.Map;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class RomanToInteger {
  @EpiTest(testDataFile = "roman_to_integer.tsv")

  public static int romanToInteger(String s) {
    // TODO - you fill in here.
	Map<Character, Integer> map = Map.of(
			'I', 1,
			'V', 5,
			'X', 10,
			'L', 50,
			'C', 100,
			'D', 500,
			'M', 1000
			);
	int sum = map.get(s.charAt(s.length() - 1));
	for(int i = s.length() - 2; i >= 0; i--) {
		if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
			sum = sum - map.get(s.charAt(i));
		}else {
			sum = sum + map.get(s.charAt(i));
		}
	}
	
    return sum;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "RomanToInteger.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
