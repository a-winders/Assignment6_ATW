
/**
 * @author Adam Winders
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Node {
	
	/**
	 * Instance fields
	 * Changed first letters to uppercase for Left & Right child to help me with readability.
	 */
	private int data;
	private Node node;
	public Node LChild;	 
	public Node RChild;
	
	/**
	 * @param data
	 */
	public Node(int data)
	{
		LChild=null;
		RChild=null;
		this.data=data;
	}	// end Node
	
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}	// end getData
	
	
	/**
	 * @param data	the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}	// end setData
	
	
	/**
	 * @return the lChild
	 */
	public Node getLChild() {
		return LChild;
	}	// end getlChild
	
	
	/**
	 * @param lChild the lChild to set
	 */
	public void setLChild(Node LChild) {
		this.LChild = LChild;
	}	// end setlChild
	
	
	/**
	 * @return the rChild
	 */
	public Node getRChild() {
		return RChild;
	}	// end getrChild
	
	
	/**
	 * @param rChild the rChild to set
	 */
	public void setRChild(Node RChild) {
		this.RChild = RChild;
	}	// end setrChild
	
	/**
	 * @return total number of Nodes traversed in DFS
	 */
	public int getNumberOfNodes() {
		int leftNumber = 0;
		int rightNumber = 0;
		int numberOfNodes = 0;
		
		if (LChild != null) 
			leftNumber = LChild.getNumberOfNodes();
		if (RChild != null) 
			rightNumber = RChild.getNumberOfNodes();
		
		numberOfNodes = +1 + leftNumber + rightNumber;

	
		System.out.println("Number of nodes traversed: " +numberOfNodes);
		return numberOfNodes;
		
				
		}	// end getNumberOfNodes
	

	
	
}	// end class