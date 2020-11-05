package com.blz.code;

public class Node<K extends Comparable<K>> implements INode<K> {

	private K key;
	private INode<K> next;

	public Node(K key) {
		super();
		this.key = key;
		this.next = null;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}
}