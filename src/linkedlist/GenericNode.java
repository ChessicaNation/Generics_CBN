package linkedlist;

/**
 * This class models a Node object which contains T objects. Each
 * node has its internal data (a T object) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/chessicanation
 * Programming Project 3
 * CS131ON
 */
public class GenericNode<T> {
	
	private T genericData;  //data that the object stores
	private GenericNode<T> nextGenericNode; //pointer to the nextGenericNode that will be in GenericLinkedList
	
	/**
	 * Constructor build GenericNode object. Initializes nextGenericNode 
	 * and genericData to null.
	 */
	public GenericNode()
	{
		setNextGenericNode(null);
		genericData=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the genericData of the object.
	 * @param genericData
	 */
	public void setGenericData(T genericData) {
		this.genericData=genericData;
	}//end setGenericData
	
	/**
	 * This method returns the genericData of the object.
	 * @return T (genericData)
	 */
	public T getGenericData() {
		return this.genericData;
	}//end getGenericData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode<T> getGenericNode() {
		return this;
	}//end getGenericNode
	
	/**
	 * This method updates the pointer for the nextGenericNode.
	 * @param nextGenericNode
	 */
	public void setNextGenericNode(GenericNode<T> nextGenericNode)
	{
		this.nextGenericNode=nextGenericNode;
	}//end setNextGenericNode
	
	/**
	 * This method returns the genericNode stored in the nextGenericNode pointer.
	 * @return nextGenericNode object
	 */
	public GenericNode<T> getNextGenericNode() {
		return nextGenericNode;
	}//end getNextGenericNode
	
}//end class
