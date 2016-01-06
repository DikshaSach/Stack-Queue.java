public class LinkedList1 {
public LinkedList1(){} // default constructor 
		protected Node head;
		protected int count;	
			public LinkedList1(Node n){
				head =n;
			}

			
			public LinkedList1(int x){
				head = new Node(x);
			}
			public int multiply(){
				Node current = head;
				int product = 1;
				while(current!=null){
					product *= current.getData();
					current = current.getNext();
				}
				return product;
			}
			
			
			
			public void insert(int x) {
				if(head.getData()>x){ // case 1: insert before head
					head = new Node(x, head);
				} else {
					Node current = head;
					Node previous = head;
					while (current!=null){
						if (current.getData()>x){ // case 2: insert into the middle of the list
							previous.setNext(new Node(x, current));
							// Node temp = new Node(x, current);
						//	previous.setNext(temp);
							break;
						} else {
							previous = current;
							current = current.getNext();
						} // else
					} // end of while
					if(current == null){ // case 3: insert after list
						previous.setNext(new Node(x));
					} // if 
				} // else
			} // insert method
			
			public boolean delete(int x){
				if(x==head.getData()){
					head = head.getNext();
					return true;
				}
				Node current = head;
				Node previous = head;
				while (current!=null){
					if (current.getData()==x){ // case 2: delete from the middle or from the end
						previous.setNext(current.getNext());
						return true;
					} else if(current.getData()>x)  {
						return false;
					} else {
						previous = current;
						current = current.getNext();
					}
				}// while
				return false;
			} // delete method
		public void append(int x) {
			Node current = head;
			while (current.getNext()!=null){
				current = current.getNext();
			}
			current.setNext(new Node(x));
		}
			
		}


