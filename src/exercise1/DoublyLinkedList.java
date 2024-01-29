package exercise1;

public class DoublyLinkedList<E> {
	//instance variables
	public Node<E> header;
	public Node<E> trailer;
	private int size = 0;

	public DoublyLinkedList() {
		header = new Node<E>(null);
		trailer = new Node<E>(null);
	}

	public void insertAtBeginning(E data) {
		Node<E> newest = new Node<>(data);
		if(header.getNext() == null){
			header.setNext(newest);
			trailer.setPrev(newest);
		} else {
			newest.setNext(header.getNext());
			header.getNext().setPrev(newest);
			header.setNext(newest);
			newest.setPrev(header);
		}
		size++;
	}

	public void addLast(E data) {
		Node<E> newest = new Node<>(data);
		if(header.getNext() == null){
			header.setNext(newest);
			trailer.setPrev(newest);
		} else {
			newest.setNext(trailer);
			newest.setPrev(trailer.getPrev());
			trailer.getPrev().setNext(newest);
			trailer.setPrev(newest);
		}
		size++;
	}
	public void concatenate(DoublyLinkedList<E> l, DoublyLinkedList<E> m) {
		l.trailer.getPrev().setNext(m.header.getNext());
		m.header.getNext().setPrev(l.trailer.getPrev());
		this.header = l.header;
		this.trailer = m.trailer;
		this.size = l.size + m.size;
	}

	public void display(){
		if(!isEmpty()){
			Node<E> current = header.getNext();
			while(current.getNext() != null){
				System.out.println(current.getElement());
				current = current.getNext();
			}
		} else {
			System.out.println("List is empty");
		}

	}

	public String getSize(){
		return "Size of list is " + size;
	}
	public boolean isEmpty(){
		return size == 0;
	}

}
