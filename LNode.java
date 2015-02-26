public class LNode{

	private int val;
	private LNode next;
	private LNode last=null;

	public LNode(final int val, final LNode next){
		this.val = val;
		this.next = next;
	}

	public int getVal(){return val;}
	public LNode getNext(){return next;}

	public void setVal(final int val){this.val = val;}
	public void setNext(final LNode next){this.next = next;}
	public void setLast(final LNode last){this.last = last;}

	public String toString(){
		return "<" + val + ">";
	}
}