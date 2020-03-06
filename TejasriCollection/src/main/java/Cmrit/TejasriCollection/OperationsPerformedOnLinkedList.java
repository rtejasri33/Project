package Cmrit.TejasriCollection;

public class OperationsPerformedOnLinkedList {
	public static Node head =new Node(0);
	OperationsPerformedOnLinkedList() {
		Node[] n=new Node[10];
		n[0]=new Node(1);
		head.next=n[0];
		for(int h=1;h<10;h++) {
			n[h]=new Node(h+1);
			n[h-1].next=n[h];
		}
		n[9].next=null;	
	}
	void append(int t) {
		Node nn=new Node(t);
		if(head.next==null) 
			head.next=nn;
		else {
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=nn;
		}
	}
	void insertingAtBeginingOfList(int t) {
		Node nn=new Node(t);
		nn.next=head.next;
		head.next=nn;
	}
	void insertionAfterSpecificNode(int positionOfSpecificNode,int t) {
		Node nn=new Node(t);
		if(head.next==null) 
			head.next=nn;
		else {
			Node temp=head;
			for (int i=0;i<positionOfSpecificNode;i++)
				temp=temp.next;
			nn.next=temp.next;
			temp.next=nn;
		}
	}
	void printList(){
		if(head.next !=null) {
			Node node = head.next;
			while(node!=null) {
				System.out.print(node.dataField+" ");
				node=node.next;
			}}
		else
			System.out.println("List is empty");			
	}
	void deletionAtLastNode() {
		if(head.next !=null) {
			Node temp=head;
			while(temp.next.next!=null)
				temp=temp.next;
			System.out.println(temp.next.dataField+" has been deleted from the list");
			temp.next=null;
		}
		else
			System.out.println("List is empty");
	}
	void deletionAtFirstNode() {
		if(head.next !=null) {
			System.out.println(head.next.dataField+" has been deleted from the list");
			head.next=head.next.next;
		}
		else
			System.out.println("List is empty");
	}
	void deletionAfterSpecificNode(int positionOfNode) {
		Node temp=head;
		for(int i=1;i<positionOfNode;i++)
			temp=temp.next;
		System.out.println("The element in position "+positionOfNode+" ("+temp.next.dataField+") has been deleted from the list");
		temp.next=temp.next.next;
	}
	void searchingForAnElement(int elementToBeSearched) {
		if(head.next!=null) {
			Node temp=head;
			int i=0;
			while(temp.next!=null  && temp.next.dataField!=elementToBeSearched ) {
				temp=temp.next;
				i++;
			}
			if(temp.next!=null && temp.next.dataField==elementToBeSearched)
				System.out.println(elementToBeSearched+" is found at position "+(i+1));
			else
				System.out.println(elementToBeSearched+" is not in the List");
		}
		else
			System.out.println("List is empty");
	}
}