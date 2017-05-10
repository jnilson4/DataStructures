package data.controller;

import data.model.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<String> foodStack;
	
	public DataController()
	{
		customerQueue = new LinkedList<Customer>();
		foodStack = new Stack<String>();
	}
	
	public void start()
	{
		myQueue();
		myStack();
	}
	
	private void myQueue()
	{
		Customer customer1 = new Customer("Jake");
		Customer customer2 = new Customer("Alyssa");
		
		customerQueue.add(customer1);
		customerQueue.add(customer2);
		
		customerQueue.remove();
	}
	
	private void myStack()
	{
		foodStack.push("Ramen");
		foodStack.push("Chicken");
		
		foodStack.pop();
		
		foodStack.peek();
	}
}