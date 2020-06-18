package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class DeleteKthLastFromList {
  @EpiTest(testDataFile = "delete_kth_last_from_list.tsv")

  // Assumes L has at least k nodes, deletes the k-th last node in L.
  public static ListNode<Integer> removeKthLast(ListNode<Integer> head, int k) {
    // TODO - you fill in here.
	  ListNode<Integer> dummyHead = new ListNode<>(0, head);
	  ListNode<Integer> first = dummyHead;
	  ListNode<Integer> second = dummyHead;
	  
	  while(k-- > 0) {
		  second = second.next;
	  }
	  
	  while(second.next != null) {
		  first = first.next;
		  second = second.next;
	  }
	  
	  first.next = first.next.next;
	  
	  
    return dummyHead.next;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "DeleteKthLastFromList.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
