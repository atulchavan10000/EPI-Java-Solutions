package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class IsStringPalindromic {
  @EpiTest(testDataFile = "is_string_palindromic.tsv")

  public static boolean isPalindromic(String s) {
    // TODO - you fill in here.
	
	  int i= 0, j = s.length() -1;
	  while(i < j) {
		  // i and j keep looking for alphanumeric chars
		  while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
		  while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
		  
		  if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
			  return false;
		  }
	  }
	  
    return true;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "IsStringPalindromic.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
