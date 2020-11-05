package com.blz.code;

import org.junit.Assert;
import org.junit.Test;

public class TestQueue {

	@Test
	public void EnqueIntegers() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		Queue<Integer> queue = new Queue<Integer>();
		queue.enque(myFirstNode);
		queue.enque(mySecondNode);
		queue.enque(myThirdNode);
		INode peak = queue.peak();
		queue.printNodes();
		Assert.assertEquals(myFirstNode, peak);
	}

	@Test
	public void DequeueUntillEmpty() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		Queue<Integer> queue = new Queue<Integer>();
		queue.enque(myFirstNode);
		queue.enque(mySecondNode);
		queue.enque(myThirdNode);
		INode deque = null;
		deque = queue.deque();
		Assert.assertEquals(myFirstNode, deque);
	}
}