package com.blz.code;

public class Stack<K> extends LinkedList<K> {
	
	private final LinkedList LinkedList;

	public Stack() {
		this.LinkedList = new LinkedList();
	}
	
	public void push(INode Node) {
		LinkedList.add(Node);
	}
	
	public INode peak() {
		return LinkedList.head;
	}
	
	public INode pop() {
		return LinkedList.pop();
	}

	public boolean isEmpty() {
		return LinkedList.isEmpty();
	}
}