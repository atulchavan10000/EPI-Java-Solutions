package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.List;
public class SearchFirstKey {
  @EpiTest(testDataFile = "search_first_key.tsv")

  public static int searchFirstOfK(List<Integer> A, int k) {
    // TODO - you fill in here.
	  int left = 0;
	  int right = A.size() - 1;
	  int result = - 1;
	  while(left <= right) {
		  int mid = left + (right - left) / 2;
		  if(A.get(mid) > k) {
			  right = mid - 1;
		  }else if(A.get(mid) == k) {
			  result = mid;
			  // nothing to the right can be the first occurence of k
			  // and we dont want to stop at finding the k, we will stop
			  // when we find the first occurence, hence next step
			  right = mid - 1;
		  }else { // here A.get(mid) < k
			  left = mid + 1;
		  }
	  }
	  
    return result;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "SearchFirstKey.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
