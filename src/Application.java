/**
 * @author Adam Winders
 * Class meant to test methods within Tree, Node, and DFS classes.
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);	// Generates practice tree of Type 5
		DepthFirstSearch aSearch = new DepthFirstSearch();
		aSearch.DFS(root);	// search begins at root of the tree - hence: depth FIRST search
		aTree.leftHeight(root);	// prints height of left side
		aTree.rightHeight(root);	// prints height of right side
		root.getNumberOfNodes();	// prints total number of nodes in Tree
		aTree.totalHeight(root);	// prints total height of Tree
	}	// end main

}	// end class