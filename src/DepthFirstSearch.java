/**
 * @author Adam Winders
 * Class meant to search tree in depth-first manner.
 *
 */

/**
 * Default constructor for DFS.
 * @author alpha
 *
 */
public class DepthFirstSearch {       
       Node root;
       public DepthFirstSearch()
       {               
                   System.out.println("\n**************************************"
                   						+ "\nCall DFS with root node to do a Depth First Search"
                   						+ "\n**************************************");
       }	// end DepthFirstSearch
 
/**
 * Searches Tree depth-first.
 * @param node
 */
 public void DFS(Node node) {
            if (node == null) {
            	return; }	// end if
        	else {
        		DFS(node.getLChild());
        		DFS(node.getRChild());
        		System.out.println("Node value: " +node.getData()); // prints out node that search begins at
        	}	// end else
        	
        
        		  //ADD CODE TO TRAVERSE THE TREE HERE
                  //THIS IS APPROXIMATELY THREE LINES OF CODE
                  //INCLUDING AN IF STATEMENT TO
                  //SEE IF THE NODE IS A LEAF
                  //AND TWO RECURSIVE CALLS TO THE CHILDREN
                   
                   /**
                    * Project Instructions:
                    * 1. Left & Right child variables are null == leaf (should be base case)
                    * 2. traverse Left child and then the Right child (call DFS on Lchild, and DFS on Rchild)
                    * 3. print values of the nodes as you traverse them
                    * 4. print the number of nodes that are traversed
                    * 5. print height of the tree
                    * 	 hint: the height of each node is 1 + max(leftChildHeight, rightChildHeight)
                    */

                  //MODIFY OTHER CODE AS NECESSARY

        }	// end DFS

}	// end class