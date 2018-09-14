/**
 * 
 * @author Rebecca Hom
 * @since April 6, 2017
 * Node class: A class that creates a node to be stored in a reference based stack or queue
 * @param <E>
 */
public class Node<E> {
	private E data;
	private Node<E> next;
	
/**
 * Default constructor that creates a Node object and sets its data field to default values
 */
	public Node(){
		data = null;
		next = null;
	}
	
/**
 * Constructor that checks for null nodes
 * @param data The data or information inside a node
 */
	public Node(E data){
		if (data == null){
			throw new IllegalArgumentException("No data provided");
		}
		this.data = data;
	}
	
/**
 * Constructor that sets data and next to some value
 * @param data The data or information inside a node
 * @param next The node after the current node
 */
	public Node(E data, Node<E> next){
		this.data = data;
		this.next = next;
	}
	
//Public getters and setters so that other classes can access and modify these values
	public void setData(E data){
		this.data = data;
	}
	
	public E getData(){
		return data;
	}
	
	public void setNext(Node<E> next){
		this.next = next;
	}
	
	public Node<E> getNext(){
		return next;
	}
}
