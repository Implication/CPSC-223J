import java.util.*;

class List implements Comparable<List>{
	private String name;
	private int num;
	public List(String n, int i){
		num = i;
		name = n;
	}
	public String getName() {return name; }
	public int getNum() {return num; }
	public boolean equals(List other){
		return this.getNum() == other.getNum();
	}
	public int compareTo(List other)
	{
		if(this.equals(other))
		return 0;
		else if(getNum() > other.getNum())
			return 1;
		else
			return -1;
	}

	public String toString()
	{
		return getName() + "," + getNum();
	}

	
}

public class Main
{
	public static void main(String[] args)
	{
		List[] Students = new List[5];
		Students[0] = new List("Bob",10);
		Students[1] = new List("Mary", 7);
		Students[2] = new List("Bill", 5);
		Students[3] = new List("Tom", 15);
		Students[4] = new List("Jack", 3);
		
		PriorityQueue<List> pQueue = new PriorityQueue<List>();
		for(int i = 0; i < 5; i++){
			pQueue.add(Students[i]);
		}
		
		while(!pQueue.isEmpty()){
			Iterator<List> it = pQueue.iterator();
			System.out.print("queue-->");
			while(it.hasNext()){
				System.out.print(it.next() + "-->");
			}
			System.out.println("NULL");
			System.out.println(pQueue.remove().getName() + " is Served, now the queue is");
		}
		System.out.println("queue-->NULL");
		System.out.println("All served :)");
	}
}
