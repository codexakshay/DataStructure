package com.blz.code;

import org.junit.Assert;
import org.junit.Test;

public class TestLinkedList {

	@Test
	public void given3NumbersAdded() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedAtTheTop() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(56);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.add(mySecondNode);
		lst.add(myThirdNode);
		lst.printNodes();
		boolean result = LinkedList.head.equals(myThirdNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAppendedToLinkedListShouldBeAddedAtTheLast() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.printNodes();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenInsertedToLinkedListShouldBeAddedInBetweenElements() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.append(myThirdNode);
		lst.insert(myFirstNode, mySecondNode);
		lst.printNodes();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListAndDeleteFirstElement() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.pop();
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.printNodes();
		boolean result = LinkedList.head.equals(mySecondNode) && LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListAndDeleteLastElement() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.popLast();
		lst.printNodes();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListAndSearchElement() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.Search(30);
		lst.printNodes();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListToSearchAndInsertElement() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(40);
		Node<Integer> myFourthNode = new Node<Integer>(70);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myFourthNode);
		lst.Insert(30, myThirdNode);
		lst.printNodes();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.head.getNext().getNext().equals(myThirdNode) && LinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenNumbersWhenAddedtoLinkedListToSearchAndDeleteElementToReturnSizeOfList() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(40);
		Node<Integer> myFourthNode = new Node<Integer>(70);
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.append(myFourthNode);
		lst.Delete(40);
		lst.printNodes();
		lst.size();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}
}