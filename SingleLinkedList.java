
public class SingleLinkedList {

	Node head;

	public void add(Object data) {
		if (head == null) {
			Node newNode = new Node(data);
			head = newNode;

		} else {
			Node temp = head;
			while (temp.getLink() != null) {
				temp = temp.getLink();
			}
			Node newNode = new Node(data);
			temp.setLink(newNode);
		}
	}

	public int size() {
		if (head == null)
			return 0;
		else {
			int count = 0;
			Node temp = head;
			while (temp != null) {
				temp = temp.getLink();
				count++;
			}
			return count;

		}
	}

	public void display() {
		if (head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				temp = temp.getLink();
			}
		}
	}

	public void remove(Object dataToDelete) {
		if (head == null)
			System.out.println("List is empty");
		else {
			while ((Integer) head.getData() == (Integer) dataToDelete)
				head = head.getLink();

			Node temp = head;
			Node previous = null;
			while (temp != null) {
				if ((Integer) temp.getData() == (Integer) dataToDelete) {
					previous.setLink(temp.getLink());
					temp = previous;
				}
				previous = temp;
				temp = temp.getLink();
			}
		}
	}
	public int findVariance() {
		int sum=0;
		int count=0;
		Node temp=head;
		while(temp!=null) {
			sum+=Integer.parseInt(temp.getData().toString());
			count++;
			temp=temp.getLink();
		}
		int average=sum/count;
		temp=head;
		int sum2=0;
		while(temp!=null) {
			sum2+=Math.pow(Integer.parseInt(temp.getData().toString())-average, 2);
			temp=temp.getLink();
		}
		int variance=sum2/count;
		return variance;
	}
}
