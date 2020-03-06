package Cmrit.TejasriCollection;

import java.util.Scanner;

public class LinkedList {
	public static void main(String[] args) {
		OperationsPerformedOnLinkedList ll=new OperationsPerformedOnLinkedList();
		while(true) {
			Scanner s=new Scanner(System.in);
			System.out.println("\n"+"Select one option from menu:"+"\n"+"1.insertion 2.print 3.deletion 4.Searching for an element 5.exit");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Where do you want to insert the element?"+"\n"+"1.At starting of list 2.At ending of list 3.After specific node");
				int choiceOfInsertion=s.nextInt();
				if(choiceOfInsertion<4) {
					System.out.println("Enter element to be inserted");
					int elementToBeInserted=s.nextInt();
					if(choiceOfInsertion==1) 
						ll.insertingAtBeginingOfList(elementToBeInserted);
					else if(choiceOfInsertion==2)
						ll.append(elementToBeInserted);
					else {
						System.out.println("Enter the position of the node, after which you want to insert the new node");
					    int positionOfSpecificNode=s.nextInt();
					    ll.insertionAfterSpecificNode(positionOfSpecificNode, elementToBeInserted);
					}
				}	
				else
					System.out.println("Please enter a valid option");
				break;
			case 2:
					ll.printList();
				break;
			case 3:
				System.out.println("Where do you want to delete the element?"+"\n"+"1.At starting of list 2.At ending of list 3.Or delete a Specific node");
				int choiceOfDeletion=s.nextInt();
				if(choiceOfDeletion<4) {
					if(choiceOfDeletion==1) 
						ll.deletionAtFirstNode();
					else if(choiceOfDeletion==2)
						ll.deletionAtLastNode();
					else {
						System.out.println("Enter the position of the node which you want to delete");
					    int positionOfNode=s.nextInt();
					    ll.deletionAfterSpecificNode(positionOfNode);
					}
				}	
				else
					System.out.println("Please enter a valid option");
				break;
			case 4:
				System.out.println("Enter the element which you want to search");
				int elementToBeSearched=s.nextInt();
				ll.searchingForAnElement(elementToBeSearched);
				break;
			case 5:
				System.out.println("You have exited from the program");
				s.close();
				System.exit(0);
			default:
				System.out.println("Please enter a valid choice");
			}
		}
	}	
		
}
