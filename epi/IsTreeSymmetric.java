package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class IsTreeSymmetric {
  @EpiTest(testDataFile = "is_tree_symmetric.tsv")

  public static boolean isSymmetric(BinaryTreeNode<Integer> tree) {
    // TODO - you fill in here.
    return tree == null || checkSymmetric(tree.left, tree.right);
  }
  
  public static boolean checkSymmetric(BinaryTreeNode<Integer> tree0, BinaryTreeNode<Integer> tree1) {
	  if(tree0 == null && tree1 == null ) {
		  return true;
	  }else if(tree0 != null && tree1 != null) {
		  return  tree0.data == tree1.data
			&& checkSymmetric(tree0.left, tree1.right)
			&& checkSymmetric(tree0.right, tree1.left);
	  }
	  // either one of the substrees are not null
	  return false;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "IsTreeSymmetric.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
