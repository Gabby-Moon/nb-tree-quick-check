import java.util.List;
import java.util.Map;

public class NbQuickCheck {

  /**
   * Performs a pre-order traversal of the tree, printing each node on a separate line.
   * Does nothing if the root is not present in the tree.
   *
   * @param tree the tree represented as a map of parent nodes to child lists
   * @param root the root node to start traversal from
   */
  public static void preOrder(Map<Integer, List<Integer>> tree, int root) {
    if(!tree.containsKey(root)) {
      return;
    }
    // print first
    System.out.println(root);
    // get list
    List<Integer> children = tree.get(root);
    // go through children
    for(int child : children) {
      // use child as the root
      preOrder(tree, child);
    }
  }

  /**
   * Returns the minimum value in the tree.
   * Returns Integer.MAX_VALUE if the root is null.
   *
   * @param root the root node of the tree
   * @return the minimum value in the tree or Integer.MAX_VALUE if root is null
   */
  public static int minVal(Node<Integer> root) {
    if(root == null) return Integer.MAX_VALUE;
    int min = root.value;
    for(Node<Integer> num : root.children) {
      min = Math.min(min, minVal(num));
    }
    return min;
  }
  
}
