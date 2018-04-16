package Listas;


public class Node {
	
	String grade;
	double id;
	
	
	Node next;
	
	public Node() {}
	
	public Node(String grade, double id) {
		this.grade= grade;
		this.id= id;
	}
	
	public String toString() {
		
		return "Grade:" + this.grade + "\t" + "value: " + this.id + "\n" ;
	}
	
	public Node clone() {
		Node temp= new Node(this.grade, this.id);
		return temp;
	}
}
