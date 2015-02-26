public class LList{

	private LNode head;
	private LNode tail;

	public LList(){
		head = null;
	}
	///
	public void add(final int n){
		LNode tmp = new LNode(n, head);
		head.setLast(tmp);
		if (head==null){
			tail=tmp;
		}
		head = tmp;
	}
	public LNode pop(){
		LNode tmp=head;
		head=head.getNext();
		return tmp;
	}
	///
	public void enqueue(final int n){
		LNode temp=new LNode(n,null);
		temp.setLast(tail);
		tail.setNext(temp);
		tail=temp;
	}
	public LNode dequeue(){
		return pop();
	}
	///
	public LNode returntail(){
		return tail;
	}
	public LNode returnhead(){
		return head;
	}
	public String toString(){
		String ans = "";
		LNode tmp = head;
		while (tmp != null){
			ans += tmp + ", ";
			tmp = tmp.getNext();
		}
		ans = ans.substring(0, ans.length() - 2);
		return "{" + ans + "}";
	}
}