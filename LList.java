//Tristhal Parasrm
//LList.java
//
//Represents a linked list and manipulates it
public class LList{

	private LNode head;
	private LNode tail;

	public LList(){
		head = null;
	}
	///
	public void push(final int n){//adds to the head 
	//rewires the next and last
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
		//removes front making the one behind it the head
		LNode tmp=head;
		head=head.getNext();
		head.setLast(null);
		return tmp;
	}
	///
	public void enqueue(final int n){//add to the tail 
		LNode temp=new LNode(n,null);
		temp.setLast(tail);//reworks pointers
		tail.setNext(temp);
		tail=temp;
	}
	public LNode dequeue(){//pop
		return pop();
	}
	///
	public void delete(LNode e){//contains cases for head and tail as e
	//redefines head and tail if necessary
	//otherwise it just reworks pointers
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
	public void delete(int n){//searches for the node with n
	//if it finds it it calls delete for that node
	//otherwise it ends
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
	public void deleteAt(int pos){//assumes a valid indicie is given
	//finds the node at position pos starting from the tail going towards the head.
	//pos 0 = tail
		LNode observed=tail;
		int i=0;
		while (true){
			if (i==pos){
				break;
			}
			else{
				observed=observed.getLast();
				i++;
			}
	
			
		}
		delete(observed);
	}
	public void sortedInsert(LNode e){
		LNode observed=tail;
		int i=0;
		while(true){
			if(observed.getVal()>=e.getVal()){
				if(observed==tail){
					enqueue(e.getVal());
					break;
					
				}
				else{
					e.setNext(observed.getNext());
					e.getNext().setLast(e);
					e.setLast(observed);
					observed.setNext(e);
					
					break;
					
				}
			}
			else if(observed==head){
				push(e.getVal());
				break;
			}
			else{
				observed=observed.getLast();
				i++;
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