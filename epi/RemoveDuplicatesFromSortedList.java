package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class RemoveDuplicatesFromSortedList {
  @EpiTest(testDataFile = "remove_duplicates_from_sorted_list.tsv")

  public static ListNode<Integer> removeDuplicates(ListNode<Integer> L) {
    // TODO - you fill in here.
	  ListNode<Integer> currentNode = L;
	  while(currentNode != null && currentNode.next != null) {
		  if(currentNode.data == currentNode.next.data) {
			  currentNode.next = currentNode.next.next;
		  }else {
			  currentNode = currentNode.next;
		  }
	  }
    return L;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "RemoveDuplicatesFromSortedList.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
