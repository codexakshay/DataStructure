package com.blz.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedList<K extends Comparable<K>> {
	public static INode head;
	public static INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void printNodes() {
		StringBuffer Nodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			Nodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				Nodes.append("->");
			tempNode = tempNode.getNext();
		}
		Nodes.append(tempNode.getKey());
		System.out.println(Nodes);
	}

	public void append(INode<K> Node) {
		if (this.head == null) {
			this.head = Node;
		}
		if (this.tail == null) {
			this.tail = Node;
		} else {
			this.tail.setNext(Node);
			this.tail = Node;
		}
	}

	public void insert(INode Node, INode newNode) {
		INode tempNode = Node.getNext();
		Node.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode Search(K key) {
		INode tempNode = head;
		INode<K> node = null;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey() == key)
				node = tempNode;
			tempNode = tempNode.getNext();
		}
		return node;
	}

	public void Insert(K key, INode newNode) {
		INode tempNode = head;
		while (!(tempNode.getKey() == key)) {
			tempNode = tempNode.getNext();
		}
		Search(key);
		insert(tempNode, newNode);
	}

	public int size() {
		int size = 0;
		if (this.head == null) {
			return size;
		}
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		System.out.println(size + 1);
		return size + 1;
	}

	public INode Delete(K key) {
		INode firstNode = head;
		INode tempNode = head;
		while (!(tempNode.getKey() == key)) {
			tempNode = tempNode.getNext();
		}
		this.head = tempNode;
		pop();
		INode LastNode = this.head;
		this.head = firstNode;
		INode node = this.head;
		while (node.getNext().getKey() != key) {
			node = node.getNext();
		}
		node.setNext(LastNode);
		return this.head;
	}
}