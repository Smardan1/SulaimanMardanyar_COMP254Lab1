package exercise3;

public class CLL implements Cloneable {
	private CLLNode head;
	private CLLNode tail;
	public Integer size;

	public CLL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	public CLL(CLLNode head, CLLNode tail) {
		this.head = head;
		this.tail = tail;
	}

	public void insertAtBeginning(Integer data) {
		CLLNode newest = new CLLNode(data);
		if(head == null) {
			this.head = newest;
			this.tail = newest;
			this.tail.setNext(newest);
		} else {
			newest.setNext(head);
			this.head = newest;
			this.tail.setNext(head);
		}
		this.size++;
	}

	public void insertAtEnd(Integer data) {
		CLLNode newest = new CLLNode(data);
		if(this.head == null) {
			insertAtBeginning(data);
		} else {
			this.tail.setNext(newest);
			this.tail = newest;
			this.tail.setNext(head);
			this.size++;
		}
	}

	public void insertAtPosition(Integer data, Integer position) {
		CLLNode newest = new CLLNode(data);
		if(this.head == null) {
			insertAtBeginning(data);
		} else {
			CLLNode current = this.head;
			for(int i = 1; i < position - 1 && current != tail; i++) {
				current.getNext();
			}
			if(current != tail) {
				newest.setNext(current.getNext());
				current.setNext(newest);
			} else {
				insertAtEnd(data);
			}
		}
		this.size++;
	}

	public void display() {
		if(this.head == null) {
			System.out.println("List is Empty");
		} else {
			CLLNode current = this.head;
			System.out.print("Size: " + this.size + " ) ");
			do {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			} while(current != this.head && current != null);
			System.out.println();
		}
	}
	public void deleteFromBeginning() {
		if(this.head == null) {
			System.out.println("List Empty");
		} else {
			this.head = this.head.getNext();
			this.tail.setNext(this.head);
			this.size--;
		}
	}

	public void deleteFromEnd() {
		if (this.head == null) {
			System.out.println("List Empty");
		} else {
			CLLNode current = this.head;
			while (current.getNext() != this.tail) {
				current = current.getNext();
			}
			this.tail = current;
			this.tail.setNext(this.head);
			this.size--;
		}
	}
	public void deleteFromPosition(Integer position) {
		if(this.head == null) {
			System.out.println("List Empty");
		} else {
			CLLNode current = this.head;
			for(int i = 1; i < position -1 && current != this.tail; i++) {
				current = current.getNext();
			}
			if(current!= this.tail) {
				current.setNext(current.getNext().getNext());
			} else {
				deleteFromEnd();;
			}
			this.size--;
		}
	}
	public CLLNode getHead() {
		return this.head;
	}
	public CLLNode getTail() {
		return this.tail;
	}
	public Integer getSize() {return this.size;}
	public void displayClone(CLL list) {

		System.out.println("\nClone Display:");
		this.display();
		System.out.println("Clone of the circular linked list: ");
		System.out.println("List == Clone: " + (list == this));
		System.out.println("list.equals(clone): " + list.equals(this));
		System.out.println("list.getHead() = clone.getHead(): " + (list.getHead() == this.getHead()));
		System.out.println("list.getTail() = clone.getTail(): " + (list.getTail() == this.getTail()));
	}
	public CLL clone() throws CloneNotSupportedException {
		CLL other = (CLL) super.clone();
		if(size > 0) {
			other.head = new CLLNode(head.getData());
			CLLNode current = head.getNext();
			CLLNode otherTail = other.head;
			do {
				CLLNode newest = new CLLNode(current.getData());
				otherTail.setNext(newest);
				otherTail = newest;
				current = current.getNext();
			}
			while(current != head);
		}
		System.out.println("");
		return other;
	}

}
