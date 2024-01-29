package exercise3;

public class CLLNode {
	private Integer data;
	private CLLNode next;

	public CLLNode() {

	}
	public CLLNode(Integer data) {
		this.data = data;
		this.next = null;
	}
	public Integer getData() {
		return data;
	}
	public CLLNode getNext() {
		return next;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public void setNext(CLLNode next) {
		this.next = next;
	}


}
