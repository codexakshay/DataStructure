package com.blz.code;


public class Queue<K> extends LinkedList<K>{

	private final LinkedList LinkedList;

	public Queue() {
		this.LinkedList = new LinkedList<>();
	}
	
	public void enque(INode Node) {
		LinkedList.append(Node);
	}

	public INode peak() {
		return LinkedList.head;
	}
	
	public INode deque() {
		return LinkedList.pop();
	}
}