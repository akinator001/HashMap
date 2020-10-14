package com.cp.hashmap;

public class LinkedList<K> {
	INode<K> head;
	INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null) {
			this.head = node;
		} 
		else {
			INode<K> tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}	
	
	public void append(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} 
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void print() {
		INode<K> tmpNode = head ; 
		while(tmpNode != null) {
			System.out.print(tmpNode.getKey()+"->");
			tmpNode=tmpNode.getNext();
		}
		System.out.println();
	}
	
	public void insert(INode<K> pNode, INode<K> node, INode<K> nNode) {
		pNode.setNext(node);
		node.setNext(nNode);
	}
	
	public INode<K> pop() {
		INode<K> tmpNode = head;
		head = head.getNext();
		return tmpNode;	
	}
	
	public INode<K> popLast() {
		INode<K> tmpNode = head;
		while( tmpNode.getNext() != tail) {
			tmpNode = tmpNode.getNext();
		}
		tail = tmpNode;
		tmpNode = tmpNode.getNext();
		tail.setNext(null);
		return tmpNode;
	}
	
	public INode<K> searchNode(K key){
		INode<K> tmpNode = head;
		while(tmpNode != null ) {
			if(tmpNode.getKey().equals(key))
				return tmpNode;
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	public void insert(INode<K> pNode, INode<K> node) {
		if(pNode.getNext() == null) {
			pNode.setNext(node);
		}
		else {
			INode<K> tmpNode = pNode.getNext();
			pNode.setNext(node);
			node.setNext(tmpNode);
		}
	}

	public int size() {
		int size = 0;
		INode<K> tmpNode = head;
		while (tmpNode != null) {
			size++;
			tmpNode = tmpNode.getNext();
		}
		return size;
	}
	
	public void pop(INode<K> node) {
		INode<K> tmpNode = head;
		while (tmpNode.getNext() != node) {
			tmpNode = tmpNode.getNext();
		}
		tmpNode.setNext(node.getNext());
	}
	
	@Override
	public String toString() {
		return "MyLinkedListNode{ " + head + " }";
	}
}
