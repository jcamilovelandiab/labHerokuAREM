package edu.escuelaing.arem;

/**
 * This class is a generic linked list.
 * @author Juan Camilo Velandia Botello
 */
public class LinkedList<T> {
	
	private Node<T> head;
	private int size;
	
	/**  Creates a linked list.
	 */
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	/** Adds an element to the linked list.
	 * @param data It is the data that will be added to the list.
	 */
	public void add_back(T data) {
		Node<T> new_node = new Node<T>(data);
		if(this.head == null) {
			this.head = new_node;
		}else {
			Node<T> last = head;
			while(last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(new_node);
		}
		this.size++;
	}
	
	/**
	 * Removes the first element with the value of data.
	 * @param data It is the data that will be removed from the list.
	 */
	public void remove(T data) {
		Node<T> temp = head;
		Node<T> prev = null;
		while(temp != null) {
			if(temp.getData()==data) {
				size--;
				prev.setNext(temp.getNext());
				break;
			}
			prev = temp;
			temp=temp.getNext();
		}
	}
	
	/** Obtains the element's value at the position index.
	 * @param index It is the position.
	 * @return The data that will be searched on the list.
	 */
	public T find(int index) {
		Node<T> temp = head;
		for(int i=0; i<index; i++) {
			temp = temp.getNext();
		}
		return temp.getData();
	}
	
	/** Prints all elements in the list.
	 */
	public void print() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(" "+temp.getData());
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	/**
	 * Gets the linkedlist's size.
	 * @return The length of the linked list.
	 */
	public int getSize() {
		return this.size;
	}
	
	/** Gets the head from the linked list.
	 * @return The head on the list.
	 */
	public Node<T> getHead() {
		return this.head;
	}
}