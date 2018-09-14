/**
 * 
 * @author Rebecca Hom
 * @since April 6, 2017
 * MyStack<E> class: A reference based implementation of the stack class
 * Objects are added and removed in a first out, last out basis
 */
import java.util.*;
public class MyStack<E> {
	private Node<E> top;

/**
 * Default constructor that creates an empty MyStack object
 * Takes no parameters
 */
	public MyStack(){
	}
	
/**
 * Checks if the stack is empty (i.e. if there are any items in the stack)
 * @return true If the stack is empty (if the head is null)
 * @return false If the stack is not empty (if the head is not null)
 */
	public boolean empty(){
		//If the head is null, then the stack is empty
		if (top == null){
			return true;
		}
		return false;
	}
	
/**
 * Looks at the item on top of the stack (i.e. the item last added to the stack)
 * and returns its value
 * @return The data of the item on top of the stack
 * @throws EmptyStackException If the stack is empty
 */
	public E peek() throws EmptyStackException{
		if (top == null){
			throw new EmptyStackException();
		}
		
		//Return the data of the item at the top of the stack
		return top.getData();
	}
	
/**
 * Removes the item on top of the stack (i.e. the last item added to the stack)
 * and returns its value
 * @return The data of the item that has just been removed from the stack
 * @throws EmptyStackException If the stack is empty
 */
	public E pop() throws EmptyStackException{
		if (top == null){
			throw new EmptyStackException();
		}
		
		//Create a temporary reference to point to the item last added to the stack
		//so that access to it isn't lost
		Node<E> temp = top;
		
		//Point the top of the stack to the next node
		top = top.getNext();
		
		return temp.getData();
	}

/**
 * Adds an item to the top of the stack
 * @param item The data of the item to be added
 * @return The data of the item that is added
 */
	public E push(E item){
		//Check if the stack is empty
		if (top == null){
			//Create a new node object to add to the queue
			top = new Node<E>(item);
			top.setNext(null);
			return top.getData();
		}
		
		//Create a temporary reference to the top of the stack so that access
		//to it isn't lost
		Node<E> n = top;
		//Create a new node to add to the stack
		top = new Node<E>(item);
		
		//Link the new node to the stack
		top.setNext(n);
		return top.getData();
	}
	
}
