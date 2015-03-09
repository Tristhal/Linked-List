public class LList{

	private LNode head;
	private LNode tail;

	public LList(){
		head = null;
	}
	///
	public void push(final int n){
		LNode tmp = new LNode(n, head);
		if (head==null){
			tail=tmp;
		}
		head = tmp;
		if(head.getLast()==null){
			
		}
		else{
			head.setLast(tmp);
		}
	}
	public LNode pop(){
		LNode tmp=head;
		head=head.getNext();
		head.setLast(null);
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
	public void delete(LNode e){
		if(e.getNext()==null || e.getLast()==null){
			if(e==tail){
				if(e==head){
					tail=null;
					head=null;
				}
				else{
					tail=e.getLast();
					tail.setNext(null);
				}
			}
			else if(e==head){
				head=e.getNext();
				head.setLast(null);
			}
			else{
				e.getNext().setLast(null);
				e.getLast().setNext(null);			
			}

		}
		else{
			e.getNext().setLast(e.getLast());
			e.getLast().setNext(e.getNext());
		}
	}
	public void delete(int n){
		LNode observed=tail;
		if(observed.getVal()==n){
			delete(observed);
		}
		else{
			while (true){
				observed=observed.getLast();
				if(observed==head){
					if(observed.getVal()==n){
						delete(observed);
						
					}
					break;
				}
				else if(observed.getVal()==n){
					delete(observed);
					break;
				}
				
			}
		}
		
	}
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