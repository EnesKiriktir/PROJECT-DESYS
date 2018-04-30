
public class DoubleLinkedList {
	private Node head;
	private Node tail;
	public DoubleLinkedList() 
	{
		head=null;
		tail=null;
	}
	public void add(Integer dataToadd) 
	{
		Node newnode;
		if (head==null) {//LIST IS EMPTY
			newnode=new Node(dataToadd);
			head=newnode;
			tail=newnode;
		}
		else {//DEÐÝÞTÝRELECEK 
			newnode=new Node(dataToadd);
			if (dataToadd%2==0) {
				newnode.setLink(head);
				head.setPrev(newnode);
				head=newnode;				
			}
			else {
				newnode.setPrev(tail);
				tail.setLink(newnode);
				tail=newnode;
			}
		}
	}
	public void display1() 
	{
		if (head==null)
			System.out.println("Linked is empty.");
		else {
			Node temp=head;
			while (temp!=null) {
				System.out.print(temp.getData()+" ");
				temp=temp.getLink();
			}
			System.out.println();
		}		
	}
	public void display2() 
	{
		if (head==null)
			System.out.println("Linked is empty.");
		else {
			Node temp=tail;
			while (temp!=null) {
				System.out.print(temp.getData()+" ");
				temp=temp.getPrev();						
			}
			System.out.println();
		}
	}
	public void remove(Integer s)
	{
		if (head==null)
			System.out.println("Linked is empty.");
		else 
		{
			while (((Integer)head.getData()).equals(s)) {
				head=head.getLink();
				head.setPrev(null);
			}
			Node temp=head;
			while (temp!=null) {
				if (((Integer)temp.getData()).equals(s)) {
					if (temp.getLink()==null) {
						tail=tail.getPrev();
						tail.setLink(null);
					}
					else {
						temp.getPrev().setLink(temp.getLink());
						temp.getLink().setPrev(temp.getPrev());
					}
										
				}
				temp=temp.getLink();
			}
		}
	}
	
	public Object getelementX(int x) {
		Node temp=head;
		if (head==null) {
			System.out.println("Linked is empty.");
			return null;
			}
		else if(x>size() || x<1){
			System.out.println("Index out of range.");
			return null;
			}
		else 
		{
		for (int i = 0; i < x; i++) {
			temp=temp.getLink();
			}
		}
		return temp.getData();
	}
	public int size()
	{
		int count=0;
		if (head==null)
			System.out.println("Linked is empty.");
		else 
		{
			Node temp=head;
			while (temp!=null) {
				count++;
				temp=temp.getLink();
			}
		}
		return count;
	}
	public boolean search(int s) {
		boolean flag=false;
		if (head==null)
			System.out.println("Linked is empty.");
		else 
		{
			Node temp=head;
			while (temp!=null) {
				if (temp.getData().equals(s)) {
					flag=true;
					break;
				}
				temp=temp.getLink();
			}
		}
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


