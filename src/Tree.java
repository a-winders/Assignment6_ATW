/**
 * @author Adam Winders
 * Generates Tree to be used with DFS class.
 * @author Nathan Johnson, Bellarmine University
 *
 */
import java.util.Queue; // import the Queue class
import java.util.LinkedList;
public class Tree {
	
	/**
	 * Instance fields
	 */
	private int height;
	private Node root;	// where tree starts
	
	/**
	 * Default constructor
	 * Sets starting position for tree with Node-1
	 */
	public Tree()
	{
		setRoot(new Node(1));
	}	// end Tree
	
	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}	// end getRoot
	
	
	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}	// end setRoot
	
	/**
	 * @param height
	 * @return Root Node value
	 */
	//returns the root node
	public Node generatePracticeTree(int height)
	{
	   this.height=height;
	   int level=1;
	   //Creating tree breadth-first so
	   //Put the child nodes in a queue
	   Queue <Node> childQ=new LinkedList<Node>();
	   Node pn=root;
	   //Create the children of the root and put some data
	   //Put them in the child queue
	   //int value=pn.getData();
		
	   	childQ.add(pn);
	   	System.out.println ("***********************\n"
	   						+ "Root Node value: "+pn.getData()
	   						+"\n***********************");
		int value=pn.getData();
	   		   	
		//Remove the front of the queue
		//Create its children
		//Put them in the queue
		//Data is just parent data+1 or 2 depending on which child
	   while (level<(height) && !childQ.isEmpty())
			 {
				 System.out.println("\n\n======================\n"
				 					+ "      Level is: "+level +
				 					"\n======================");
				 for(int i=1;i<=Math.pow(2,(level-1));i++)
				 {
					 pn=childQ.remove();
					 System.out.println("Parent Node value: "+pn.getData());
					 value++;
					 System.out.println("Adding Left Child: "+(value));
					 pn.setLChild(new Node(value));
					 childQ.add(pn.getLChild());
					 value++;
					 System.out.println("Adding Right Child: "+(value));
					 pn.setRChild(new Node(value));
					 childQ.add(pn.getRChild());
				 }	// end for
					 
				 level++;System.out.println("\n>>>>>> Level: "+level + " <<<<<<");
			 }	// end while
			 
		
		return root;
		
	}	// end generatePracticeTree
	

	/**
	 * 
	 * @param node
	 * @return left height of binary tree
	 */
	public static int leftHeight (Node node) {
		int height = 0;
		while (node != null) {
			height++;
			node = node.getLChild();
		}	// end while
		System.out.println("\nLeft height: "+height);
		return height;
	}	// end leftHeight
	
	/**
	 * 
	 * @param node
	 * @return right height of binary tree
	 */
	public static int rightHeight (Node node) {
		int height = 0;
		while (node != null) {
			height++;
			node = node.getRChild();
		}	// end while
		System.out.println("Right height: "+height + "\n");
		return height;
	}	// end rightHeight
	
	/**
	 * 
	 * @param root
	 * @return total height of tree
	 */
	public static int totalHeight (Node root) {
		if (root == null)	// base case
			return 0;
		int lh = leftHeight(root);
		int rh = rightHeight(root);
		int th = lh + rh;
		
		System.out.println("Total height of tree: " +th);
		return th;	
	}	// end totalHeight
	
}	// end class
