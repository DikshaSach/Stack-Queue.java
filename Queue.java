
public class Queue extends LinkedList1 {
	private Node back; // last node in the list.
	
	public Queue(int x){
		head=new Node(x); // new node created and set to head
		back = head; // the tail/back is set to head
		count =1; // count is now set to 1
	} // end of declaring x
	
	// override parent class insert method
	public void insert(int x){
		if(head!=null){
			if(head.getNext()==null){ // next node is null then create a new node and set it to temp
				Node temp = new Node(x);
				back =temp; // tail is now set to temp
				head.setNext(back); // head's next node is set to the tail/back
				count++; // increment counter
			}else {
				Node temp = new Node(x); // if next node isn't null create a temp node
				back.setNext(temp); // set the tail's next to temp
				back = temp; // tail is now set to temp
				count++; // increment 
			}
		} // end of if statement
		else { head = new Node(x);
		count =1;
		} // end of else
	} // end of insert method
	
	// override parent class delete method
	public boolean delete(int x){
		Boolean test = false; // test originally set to false
		if(x>0){ 
			for (int i =0; i<x; i++){
				if(head!=null){
					head=head.getNext();
					count--;
					test = true;
				} // end of if
			} // end of for
		} // end of if
		return test;
				} // end of delete
				
	public void clearAll(){
		int index = count;
		for (int i=0; i<index; i++){
			System.out.println(head.getData());
			delete(1);
		}
	}
	public void print(){
		Node current = head;
		if(head!=null){
			for (int i =0; i<count; i++){
				System.out.println(current.getData());
				current = current.getNext();
			} // end of for
		} // end of if
	} // end of print 
}


