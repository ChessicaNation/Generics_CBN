package linkedlist;
/**
 * This class models a linked list in which each generic node has a pointer
 * to the generic node after it, except the tail which does not have 
 * a generic node after.
 * @author rkelley/njohnson/chessicanation
 * Programming Project 3
 * CS131ON
 */
public class GenericLinkedList<T> {

	private GenericNode<T> head; //node to represent the head of the list
	private GenericNode<T> tail; //node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) {return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head GenericNode of the list from which
	 * you can traverse the entire by following GenericNode links.
	 * @return
	 */
	public GenericNode<T> getGenericList()
	{
		return head;
	}//end getGenericList
	
	/**
	 * This method adds a new GenericNode to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail GenericNodes
	 * to the GenericNode passed in. If the list is not empty it places the 
	 * GenericNode at the end of the list and updates the pointers in the tail. 
	 * This implementation does not support adding entries to the middle
	 * of the list.
	 * @param bNode
	 */
	public void addGenericNode(GenericNode<T> bNode)
	{
		if (isEmpty()) {
			head = bNode;
			tail=head;
			return;
		}
		
		tail.setNextGenericNode(bNode);
		tail=tail.getNextGenericNode();
		tail.setNextGenericNode(null);
		length++;
		
	}//end addGenericNode

}//end class
