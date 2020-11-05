package com.blz.code;

import org.junit.Assert;
import org.junit.Test;

public class TestStack {

	@Test
	public void PushIntegersTest() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode peak = stack.peak();
		stack.printNodes();
		Assert.assertEquals(myThirdNode, peak);
	}

	@Test
	public void PushPopIntegersTest() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode pop = null;
		while (!(stack.isEmpty())) {
			pop = stack.pop();
		}
		Assert.assertEquals(myFirstNode, pop);
	}
}