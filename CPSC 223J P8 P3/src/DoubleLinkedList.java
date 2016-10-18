

class node{
	String info;
	node next;
	node back;
	public node(String val)
	{info = val; next = null; back = null; }
}


public class DoubleLinkedList {
	node List;
	DoubleLinkedList()
	{List = null;}
	public void insert(String val){
		node p = new node(val);
		if(List == null){
			List = p;
			List.back = p;
		}
		else{
			List.next = p;
		}
	}
	
	void DisplayLTR(){
		node p = List;
		do{
			System.out.print(p.info + "->");
			p = p.next;
		}while(p != null);
	}
	
	void DisplayRTL(){
		node p = List;
		do{
			System.out.print(p.info + "->");
			p.back = p.back.next;
		}while(p != p.back);
	}
	
	public static void main(String[] args){
		DoubleLinkedList l = new DoubleLinkedList();
		l.insert("January");
		l.insert("February");
		l.insert("March");
		l.insert("April");
		l.insert("May");
		l.insert("June");
		l.insert("July");
		l.insert("August");
		l.insert("September");
		l.insert("October");
		l.insert("November");
		l.insert("December");
		l.DisplayLTR();
	}
}
