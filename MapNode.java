package com.cp.hashmap;

public class MapNode<K,V> implements INode<K> {
	
	K key;
	V value;
	MapNode<K,V> next;
	
	MapNode(K key , V value){
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public V getValue() {
		return this.value;
	}
	
	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setKey(K key) {
		this.key = key ;
	}

	@Override
	public INode<K> getNext() {
		return this.next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = (MapNode<K, V>) next;
	}
	
	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{"+"K=").append(key).append(" v=").append(value).append("}");
		
		if(next != null ) 
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();	
	}
	
}