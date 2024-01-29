package exercise3;


public class CLLTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		CLL list = new CLL();

		//inserting
		list.insertAtBeginning(123);
		list.insertAtEnd(93);
		list.insertAtEnd(512);

		//display
		list.display();

		//insert more values
		list.insertAtBeginning(789);
		list.insertAtPosition(532, 2);
		list.insertAtPosition(13, 4);

		//display
		list.display();

		//clone method test
		CLL cloneList = list.clone();
		cloneList.display();
		cloneList.displayClone(list);

	}
}
