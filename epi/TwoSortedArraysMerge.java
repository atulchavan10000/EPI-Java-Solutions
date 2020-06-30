package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.List;
public class TwoSortedArraysMerge {

  public static void mergeTwoSortedArrays(List<Integer> A, int m,
                                          List<Integer> B, int n) {
    // TODO - you fill in here.
	  
	int indexA = m - 1;
	int indexB = n - 1;
	
	int mergedIndex = m + n - 1;
	
	while(indexB >= 0) {
		if(indexA >=0 && A.get(indexA) > B.get(indexB)) {
			A.set(mergedIndex, A.get(indexA));
			indexA--;
		}else {
			A.set(mergedIndex, B.get(indexB));
			indexB--;
		}
		mergedIndex--;
	}
    return;
  }
  @EpiTest(testDataFile = "two_sorted_arrays_merge.tsv")
  public static List<Integer>
  mergeTwoSortedArraysWrapper(List<Integer> A, int m, List<Integer> B, int n) {
    mergeTwoSortedArrays(A, m, B, n);
    return A;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "TwoSortedArraysMerge.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
