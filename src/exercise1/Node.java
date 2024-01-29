package exercise1;

public class Node<E>{
	//references
	private E element;
	private Node<E> previous;
	private Node<E> next;
	public Node(E data) {
		element = data;
		previous = null;
		next = null;
	}

	public E getElement() { return element; }
	public Node<E> getPrev() { return previous; }
	public Node<E> getNext() { return next; }
	public void setPrev(Node<E> previousNode) { previous = previousNode; }
	public void setNext(Node<E> nextNode) { next = nextNode; }

}