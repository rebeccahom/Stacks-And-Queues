/**
 * @author Rebecca Hom
 * @since April 6, 2017
 * JUnit test for MyStack
 */
import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class MyStackTest {

	@Test
	//Test if the reference variable of a new MyStack object points to null
	public void testMyStack1() {
		try{
			MyStack<Integer> n;
			n = new MyStack<Integer>();
			assertNotNull("Default constructor should not return null reference",n);
			
		}
		catch(Exception e){
			fail("Exception thrown by default constructor: " + e.getMessage());
		}
	}
	
	@Test
	//Test if a new MyStack object is empty upon instantiation; also test if the empty method works properly
	public void testMyStack2(){
		try{
			MyStack<Integer> n = new MyStack<Integer>();
			assertTrue("Default should be empty upon instantion",n.empty());
		}
		catch(Exception e){
			fail("Exception thrown by default constructor: " + e.getMessage());
		}
		
	}
	
	@Test
	//Test if the empty method works when an items are pushed and popped so that the stack is empty
	public void testEmpty1(){
		try{
			MyStack<Integer> n = new MyStack<Integer>();
			n.push(1);
			n.pop();
			assertTrue("Method should return true because the stack is now empty",n.empty());
		}
		catch(Exception e){
			fail("Exception thrown by empty method: " + e.getMessage());
		}
	}
	
	@Test
	//Test if the empty method words when items are pushed and popped multiple times
	public void testEmpty2(){
		try{
			MyStack<Integer> n = new MyStack<Integer>();
			n.push(1);
			n.pop();
			n.push(2);
			n.push(3);
			n.pop();
			n.pop();
			assertTrue("Method should return true because the stack is empty",n.empty());
		}
		catch(Exception e){
			fail("Exception thrown by empty method: " + e.getMessage());
		}
	}
	@Test
	//Test if the method handles when the stack is empty
	public void testPeek1(){
		try{
			MyStack<Integer> n = new MyStack<Integer>();
			assertNull("Method should throw EmptyStackException",n.peek());
		}
		catch(EmptyStackException e){
			//Correct behavior
		}
		catch(Exception e){
			fail("Method should handle empty exceptions");
		}
	
	}
	
	@Test
	//Test if peek returns the object at the top of the stack
	public void testPeek2(){
		try{
			MyStack<Integer> n = new MyStack();
			
			n.push(5);
			n.push(1);
			
			assertTrue("Method should return the last node added ",n.peek()==1);
		}
		catch(Exception e){
			fail("Method should return the last node added");
		}
	}
	
	@Test
	//Test if peek returns the object at the top of the stack when items are pushed and popped
	//multiple times
	public void testPeek3(){
		try{
			MyStack<Integer> n = new MyStack();
			n.push(1);
			n.push(2);
			n.pop();
			n.push(3);
			n.pop();
			n.push(4);
			n.push(5);
			assertTrue("Method should return last value added. ",n.peek()==5);
		}
		catch(Exception e){
			fail("Peek throws exception: " + e.getMessage());
		}
	}
	
	@Test
	//Test if pop returns the correct object
	public void testPop1(){
		try{
			MyStack<Integer> n = new MyStack();
			n.push(1);
			assertTrue("Method should return the last item added",n.pop()==1);
		}
		catch(Exception e){
			fail("Method should return the last item added");
		}
	}
	
	@Test
	//Test if pop handles empty stacks
	public void testPop2(){
		try{
			MyStack<Integer> n = new MyStack();
			assertNull("Method should return null if stack is empty",n.pop());
		}
		catch(EmptyStackException e){
			//Correct behavior
		}
		catch(Exception e){
			fail("Exception thrown by pop method: " + e.getMessage());
		}
	}
	
	@Test
	//Test if pop removes the correct object
	public void testPop3(){
		try{
			MyStack<Integer> n = new MyStack();
			n.push(1);
			n.push(2);
			n.push(3);
			
			n.pop();
			assertTrue("Method should return the last item in the stack",n.pop()==2);
		}
		catch(Exception e){
			fail("Exception thrown by pop method: " + e.getMessage());
		}
	}

	@Test
	//Test if the empty method returns false when an object is pushed onto the stack
	public void testPush1(){
		try{
			MyStack<Integer> n = new MyStack<Integer>();
			n.push(1);
			assertFalse("Method should return false",n.empty());
		}
		catch(Exception e){
			fail("Exception thrown by empty method: " + e.getMessage());
		}
	}
	
	@Test
	//Test if the Item is successfully added
	public void testPush2(){
		try{
			MyStack<Integer> n = new MyStack();
			n.push(1);
			n.push(2);
			assertTrue("The stack should have the last item added",n.peek()==2);
		}
		catch(Exception e){
			fail("Exception thrown by push method: " + e.getMessage());
		}
	}
}