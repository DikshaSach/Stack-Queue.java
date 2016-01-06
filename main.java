
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Stack
Stack s = new Stack(0);
System.out.println("New stack");
int a =20;
int b=1;
while(b<=a){
	s.insert(b++);
	
}
/*
s.insert(1);
s.insert(2);
s.insert(3);
s.insert(4);
s.insert(5);
s.insert(6);
s.insert(7);
s.insert(8);
s.insert(9);
s.insert(10);
s.insert(11);
s.insert(12);
s.insert(13);
s.insert(14);
s.insert(15);
s.insert(16);
s.insert(17);
s.insert(18);
s.insert(19);
s.insert(20); */
// s.delete(3); // testing delete method
s.clearAll(); // clears the stack
System.out.println("Stack deleted.");
s.print();

System.out.println();
System.out.println();
// Queue
Queue q = new Queue(0);
System.out.println("New Queue");
int c=20;
int d=1;
while(d<=c){
	q.insert(d++);
}
/*
q.insert(1);
q.insert(2);
q.insert(3);
q.insert(4);
q.insert(5);
q.insert(6);
q.insert(7);
q.insert(8);
q.insert(9);
q.insert(10);
q.insert(11);
q.insert(12);
q.insert(13);
q.insert(14);
q.insert(15);
q.insert(16);
q.insert(17);
q.insert(18);
q.insert(19);
q.insert(20);*/
q.clearAll();
q.print();
System.out.println("Queue deleted");
q.print();
	}

}
