package main;

import linkedlist.*;

/**
 * This class contains a main method to test
 * the Node, LinkedList, GenericNode,
 * and GenericLinkedList classes.
 * 
 * @author rkelley/njohnson/chessicanation
 * Programming Project 3
 * CS131ON
 */

public class TestLinkedList {

	public static void main(String[] args) {
		
		// ====================== TESTING NODE AND LINKEDLIST =========================
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		//separator println
		System.out.println();
		
		// =============== TESTING GENERICNODE AND GENERICLINKEDLIST ==================
		
		
		// ************************** Testing Integer Objects *************************
		
		//using empty-argument constructor to create a GenericLinkedList to hold integers
		GenericLinkedList<Integer> integerList = new GenericLinkedList<Integer>();
		
		//using empty-argument constructor to create a GenericNode of type integer
		GenericNode<Integer> intNode = new GenericNode<Integer>();
		
		//using setter to set the data for each GenericNode
		intNode.setGenericData(11);
		
		//using addGenericNode method to add the GenericNode to the GenericLinkedList
		integerList.addGenericNode(intNode);
		
		//repeating the process for a total of three GenericNodes in the GenericLinkedList
		intNode = new GenericNode<Integer>();
		intNode.setGenericData(22);
		integerList.addGenericNode(intNode);
		intNode = new GenericNode<Integer>();
		intNode.setGenericData(33);
		integerList.addGenericNode(intNode);
		
		//creating a temporary GenericNode to traverse through the GenericLinkedList
		//using a do while loop and print out the genericData contained in the GenericNodes
		GenericNode<Integer> tempIntNode = integerList.getGenericList();
		do 
		{
			System.out.println(tempIntNode.getGenericData());
			tempIntNode = tempIntNode.getNextGenericNode();
		} while (tempIntNode!=null);

		//separator println
		System.out.println();
		
		// ************************** Testing Double Objects *************************
		
		//using empty-argument constructor to create a GenericLinkedList to hold doubles
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
		
		//using empty-argument constructor to create a GenericNode of type double
		GenericNode<Double> doubleNode = new GenericNode<Double>();
		
		//using setter to set the data for each GenericNode
		doubleNode.setGenericData(1.1);
		
		//using addGenericNode method to add the GenericNode to the GenericLinkedList
		doubleList.addGenericNode(doubleNode);
		
		//repeating the process for a total of three GenericNodes in the GenericLinkedList
		doubleNode = new GenericNode<Double>();
		doubleNode.setGenericData(2.22);
		doubleList.addGenericNode(doubleNode);
		doubleNode = new GenericNode<Double>();
		doubleNode.setGenericData(3.333);
		doubleList.addGenericNode(doubleNode);
		
		//creating a temporary GenericNode to traverse through the GenericLinkedList
		//using a do while loop and print out the genericData contained in the GenericNodes
		GenericNode<Double> tempDoubleNode = doubleList.getGenericList();
		do 
		{
			System.out.println(tempDoubleNode.getGenericData());
			tempDoubleNode = tempDoubleNode.getNextGenericNode();
		} while (tempDoubleNode!=null);

		//separator println
		System.out.println();
		
		// ************************** Testing String Objects *************************
		
		//using empty-argument constructor to create a GenericLinkedList to hold strings
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();
		
		//using empty-argument constructor to create a GenericNode of type integer
		GenericNode<String> stringNode = new GenericNode<String>();
		
		//using setter to set the data for each GenericNode
		stringNode.setGenericData("Hello");
		
		//using addGenericNode method to add the GenericNode to the GenericLinkedList
		stringList.addGenericNode(stringNode);
		
		//repeating the process for a total of three GenericNodes in the GenericLinkedList
		stringNode = new GenericNode<String>();
		stringNode.setGenericData("Hola");
		stringList.addGenericNode(stringNode);
		stringNode = new GenericNode<String>();
		stringNode.setGenericData("Bonjour");
		stringList.addGenericNode(stringNode);
		
		//creating a temporary GenericNode to traverse through the GenericLinkedList
		//using a do while loop and print out the genericData contained in the GenericNodes
		GenericNode<String> tempStringNode = stringList.getGenericList();
		do 
		{
			System.out.println(tempStringNode.getGenericData());
			tempStringNode = tempStringNode.getNextGenericNode();
		} while (tempStringNode!=null);

	}//end main

}//end class
