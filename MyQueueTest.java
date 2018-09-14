/**
 * @author Rebecca Hom
 * @since April 6, 2017
 * 
 * JUnit test for MyQueue class
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class MyQueueTest {

	//Test if the default constructor works correctly (it should not be null upon instantiation)
	@Test
	public void testMyQueue1() {
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			assertNotNull("Default constructor should instantiate a MyQueue object", n);
		}
		catch(Exception e){
			fail("Default constructor throws exception: \n" + e.getClass() +  "\n" + e.getMessage());
		}
	}
	

	//Check how peek handles empty queues
	@Test
	public void testPeek(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			assertNull(n.peek());
		}
		catch(Exception e){
			fail("Method should return null if the queue is empty: \n" + e.getClass() +  "\n" + e.getMessage());
		}
	}
	

	//Test if the peek removes the head (it shouldn't)
	@Test
	public void testPeek2(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.offer(2);
			n.peek();
			n.peek();
			assertNotNull("Peek should not remove any items from the queue",n);			
		}
		catch(Exception e){
			fail("Peek throws an exception: \n" + e.getClass() +  "\n" + e.getMessage());
		}
	}
	

	//Test if peek returns the head of the queue (it should)
	@Test
	public void testPeek3(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.offer(2);
			assertTrue("Peek should return the head of the queue",n.peek()==1 );
		}
		catch(Exception e){
			fail("Peek throws an exception: " + e.getMessage());
		}
	}
	


	//Check how poll handles empty queues
	@Test
	public void testPoll1(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			assertNull("Method should return null when the queue is empty",n.poll());
		}
		catch(Exception e){
			fail("Poll throws an exception: " + e.getMessage());
		}
	}
	
	//Test if poll returns the head
	@Test
	public void testPoll2(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.offer(2);
			n.offer(3);
			int testVariable = n.poll();
			assertEquals("Method should return the head",1,testVariable);
		}
		catch(Exception e){
			fail("Poll throws an exception: \n" + e.getClass() +  "\n" + e.getMessage());
		}
		
	}
	
	//Test if poll removes the head
	@Test
	public void testPoll3(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();			
			n.offer(1);
			n.offer(2);
			n.poll();
			int testNum = n.peek();
			assertEquals("Method should remove the head",2, testNum);
		}
		catch(Exception e){
			fail("Poll throws an exception: " + e.getMessage());
		}
	}
	
	//Test if poll removes items correctly by adding multiple items, and then removing them
	@Test
	public void testPoll4(){
		try {
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.offer(2);
			n.poll();
			n.offer(3);
			n.poll();
			n.poll();
			assertTrue("Method should return empty because no more items are in the queue",n.peek()==null);
		}
		catch(Exception e){
			fail("Method throws an exception: " + e.getMessage());
		}
	}
	

	//Test if the item is properly inserted with the offer method
	@Test
	public void testOffer1(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			assertTrue("Method should add new item",n.peek()==1);
		}
		catch(Exception e){
			fail("Offer throws an exception: " + e.getMessage());			
		}
	}
	
	//Test if offer throws ClassCatchException
	@Test
	public void testOffer2(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			Object x = new String("0");
			n.offer((Integer)x);
			fail("Offer should be throwing ClassCatchException");
		}
		catch(ClassCastException e){
			//Correct behavior
		}
		catch(Exception e){
			fail("Offer throws wrong exception: " + e.getMessage());
		}
	}
	
	//Test if offer throws NullPointerException
	@Test
	public void testOffer3(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(null);
			fail("Offer shouldn't allow null to be enqueued");
		}
		catch(NullPointerException e){
			//Correct behavior
		}
		catch(Exception e){
			fail("Offer throws wrong exception: \n" + e.getClass() +"\n"+ e.getMessage());
		}
	}
	
	//Test if offer correctly works by adding multiple items and checking the head
	@Test
	public void testOffer4(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.poll();
			n.offer(2);
			n.offer(3);
			n.poll();
			int testNum = n.peek();
			assertEquals("Offer should successfully add items",3,testNum);
		}
		catch(Exception e){
			fail("Offer throws exception: \n" + e.getClass() +"\n"+e.getMessage());
		}
	}
	
	//Test if offer correctly works by adding multiple items and checking the head
	@Test
	public void testOffer5(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.offer(2);
			n.offer(3);
			n.offer(4);
			assertTrue("Offer should successfully add items",n.peek()==1);
		}
		catch(Exception e){
			fail("Offer throws exception: " + e.getMessage());
		}
	}
	
	//Test if offer correctly works by adding multiple items, removing 1, and checking the head
	@Test
	public void testOffer6(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.offer(2);
			n.offer(3);
			n.poll();
			int testNumber = n.peek();
			assertEquals("Offer should successfully add items. ",2,testNumber);
		}
		catch(Exception e){
			fail("Offer throws an exception: " + e.getMessage());
		}
	}
	
	//Test if offer and poll work correctly by using them in alternating order
	@Test
	public void testOffer7(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.poll();
			n.offer(2);
			int testVariable = n.poll();
			assertEquals("Offer should successfully add items",2,testVariable);
		}
		catch(Exception e){
			fail("Offer throws an exception: " + e.getMessage());
		}
	}
	
	//Test if offer and poll work correctly by adding and removing in a different order
	@Test
	public void testOffer8(){
		try{
			MyQueue<Integer> n = new MyQueue<Integer>();
			n.offer(1);
			n.offer(2);
			n.offer(3);
			n.offer(4);
			int testNum = n.poll();
			assertEquals("Offer should succcessfully add items",2,testNum);
		}
		catch(Exception e){
			fail("Offer throws an exception: \n" + e.getClass() + "\n" + e.getMessage());
		}
	}

	
	
}
