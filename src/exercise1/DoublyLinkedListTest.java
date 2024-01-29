package exercise1;

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
		DoublyLinkedList<Integer> m = new DoublyLinkedList<>();

		//adding values into list l
		l.insertAtBeginning(23);
		l.addLast(12);
		l.addLast(9943);
		l.addLast(51274);
		System.out.println("Displaying List L");
		l.display();
		System.out.println(l.getSize());


		//adding values to list m
		m.insertAtBeginning(536);
		m.insertAtBeginning(952);
		m.addLast(4);
		System.out.println("\n_________________");
		System.out.println("Displaying List M");
		m.display();
		System.out.println(m.getSize());

		//Create new list and use concatenate method
		DoublyLinkedList<Integer> n = new DoublyLinkedList<>();
		System.out.println("\n_________________");
		System.out.println("Displaying List N before concatenating");
		n.display();
		System.out.println("\nDisplaying List N after concatenating");
		n.concatenate(l,m);
		n.display();
		System.out.println(n.getSize());
	}
}
