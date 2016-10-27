class Node{
	String data;
	Node next;
	Node prev;
	Node(String val){
		data = val;
		next = null;
		prev = null;
	}
}


public class CircularDoubleLinkedList {
	Node root = null;
	Node current;
	public void insert(String data){
		Node p  = new Node(data);
		if(root == null) {
			root = p;
			root.next = root;
			root.prev = root;
		}
		else{
			current = root;
			while(current.next != root){
				current = current.next;
			}
			
			current.next = p;
			p.next = root;
			p.prev = current;
			root.prev = p;
		}
	}
	
	public void displayList(){
		current = root;
			do{
				System.out.print(current.data + " ");
				current = current.next;
			}while(current != root);
		Node last = root.prev;
		System.out.println();
		System.out.println("Now lasts...");
		do{
			System.out.print(last.data + " ");
			last = last.prev;
		}while(last != root.prev);
		}
	
	public static void main(String[] args){
		CircularDoubleLinkedList c = new CircularDoubleLinkedList();
		c.insert("A");
		c.insert("B");
		c.insert("C");
		
		c.displayList();
	}
}
