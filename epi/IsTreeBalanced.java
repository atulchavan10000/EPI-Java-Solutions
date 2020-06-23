package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class IsTreeBalanced {

  @EpiTest(testDataFile = "is_tree_balanced.tsv")

  public static boolean isBalanced(BinaryTreeNode<Integer> tree) {
    // TODO - you fill in here.
	return checkHeight(tree) != Integer.MIN_VALUE;
  }
  
  public static int checkHeight(BinaryTreeNode<Integer> tree) {
	  if(tree == null) return -1;
	  
	  int leftHeight = checkHeight(tree.left);
	  if(leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
	  
	  int rightHeight = checkHeight(tree.right);
	  if(rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
	  
	  int heightDiff = leftHeight - rightHeight;
	  if(Math.abs(heightDiff)> 1) {
		  return Integer.MIN_VALUE;
	  }else {
		  return Math.max(leftHeight, rightHeight) + 1;
	  }
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "IsTreeBalanced.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
