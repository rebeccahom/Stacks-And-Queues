/**
 * 
 * @author Rebecca Hom
 * @since April 6, 2017
 * MyQueue<E> class: A reference based implementation of the Queue interface
 * Objects are added and removed on a first in, first out basis
 * @param <E>
 */
public class MyQueue<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	
	/**
	 * Default constructor that creates an empty MyQueue object
	 * Takes no parameters
	 */
	public MyQueue(){
	}
	
/**
 * Looks at the item on the top of the queue (i.e. the first item added
 * to the queue) and returns its value
 * @return E The data of the item on the top of the queue
 */
	public E peek(){
		//If the head is empty, return null
		if (head==null){
			return null;
		}
		return head.getData();
	}

/**
 * Removes the item on the top of the queue (i.e. the first item added to the queue)
 * and returns its value
 * @return E The data of the item on the top of the queue
 */
	public E poll(){
		//If the head is empty, return null
		if (head==null){
			return null;
		}
		//Create a temporary reference and point it to head so that access to head isn't lost
		E temp = head.getData();
		//Make head point to the next object in the queue
		head = head.getNext();
		return temp;
		
	}
	
/**
 * Adds an item to the back of the queue and returns true is the item is successfully added
 * @param item The data of the item that is to be added to the queue
 * @return true If the item is successfully added
 * @throws ClassCastException Thrown if the class of the element being added to the list
 * causes an exception
 * @throws NullPointerException Thrown if the element being added is null, and the queue does
 * not allow null items to be added
 */
	public boolean offer(E item) throws ClassCastException, NullPointerException{
		//Cannot add null items to the queue
		if (item == null){
			throw new NullPointerException();
		}
		
		//Check if the queue is empty
		else if (head==null){
			//Create a new node to add to the queue
			Node <E> node = new Node<E>(item);
			//Point the head and tail to that node
			head = node;
			tail = node;
			return true;
		}
		
		//Create a new node to add to the queue
		Node<E> node = new Node<E>(item);
		//Create a temporary reference to the last item in the queue so that access
		//to it isn't lost
		Node<E> temp = tail;
		
		//Point tail to the new node
		tail = node;
		
		//Link the new node to the queue
		temp.setNext(tail);
		return true;
	}
}
