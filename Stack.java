
public class Stack extends LinkedList1{
	
	public Stack(int x){
		head = new Node(x); // new node created and set to head
		count =1; // count is set to 1 since a new node was created
	}
	// override the parent class insert method
	public void insert(int x){
		if(head!=null){ // if the heads not equal to null
			Node temp = new Node(x); // create node temp
			temp.setNext(head); // set temps next to be the head.
			head = temp; // head is now equal to temp
			count++; // increment counter
		} else {
			head = new Node(x); // if  head is null create a new head
			count =1; // increment counter by only 1
		} 
		}
	
	// override the parent class delete method.
	public boolean delete(int x){
		Boolean test = false; // boolean test is set to be false.
		if(x>0){ // if x is greater than 0
			for (int i=0; i<x; i++){ // for loop 
				if(head!=null){ // if the head is not equal to null
					head=head.getNext();  // new head is equal to the head's next
					count--; // decrement the counter
					test = true; // return true for the boolean test
				} // end of if
			} // end of for
		} // end of if
		return test;
	} // end of delete
	
	public void clearAll(){
		int ind = count; // index variable is now set to count
		for(int i=0; i<ind; i++){
 			System.out.println(head.getData()); 
			delete(1);
		}// end of for
	} // end of clearall
	
	public void print(){
		Node current = head;
		for(int i=0; i<count; i++){
			System.out.println(current.getData());
			current = current.getNext();
		} // end of for
	} // end of print
	
	
	
	
	}





