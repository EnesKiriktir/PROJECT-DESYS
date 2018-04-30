

public class Node {
	Object data;
	private Node link;
	private Node prev;
	

	public Node(Object dataToAdd) {
		data = dataToAdd;
		link = null;
		prev=null;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	

}
