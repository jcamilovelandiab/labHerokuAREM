package edu.escuelaing.arem;

/**
 * This is the class node, which it contains two variables.
 * First, the data which it is the node's value.
 * Second, the node next which it is the neighboor on the right. It points to another(next) node.
 * @author Juan Camilo Velandia Botello
 */
public class Node<T> {

	private T data;
	private Node<T> next;
	
	/** Creates a node with the specified data. It receives as parameter the node's value.
	 * @param data The node's value.
	 */
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	/** Creates a node with the specified data and neighboor.
	 * @param data It is the node's values.
	 * @param next This is the another node which this node is pointing at.
	 */
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	/** Gets the node's value.
	 * @return The node's data.
	 */
	public T getData() {
		return this.data;
	}
	
	/** Sets the node's data.
	 * @param data It is the new node's value.
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/** Gets the node to which this node is pointing at.
	 * @return The node to which this node is pointing at.
	 */
	public Node<T> getNext() {
		return next;
	}

	/** Sets the pointer or neighboor.
	 * @param next It is the new neighboor that this node will have.
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	/** Gets the node's information.
	 */
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
}