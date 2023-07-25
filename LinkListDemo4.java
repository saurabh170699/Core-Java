package com.july20.stack;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkListDemo4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Linked List :"+linkedList );
			System.out.println("1 . Insert Element");
			System.out.println("2. Delete Element");
			System.out.println("3. Display Elements");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice : ");
			
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element to insert ");
				int elementsToAdd = scanner.nextInt();
				linkedList.add(elementsToAdd);
				break;
			
			case 2:
				if(linkedList.isEmpty())
				{
					System.out.println("Linked Lisk Is empty. Nothing to delete ");
					
				}
				else
				{
					System.out.println("Enter the elements to delete");
					int elementToDelete = scanner.nextInt();
					boolean removed = linkedList.remove(Integer.valueOf(elementToDelete));
					if(removed)
					{
						System.out.println("Elements "+elementToDelete +" deleted From the linked list .");
						
					}
					else
					{
						System.out.println("Element for found in the linked list. ");
						
					}
				}
				break;
				
			case 3:
				System.out.println("Elements in the linked list.");
				System.out.println(linkedList);
				break;
				
			case 4:
				System.out.println("Exiting the program. ");
				scanner.close();
				System.exit(0);
		    default:
		    	System.out.println("Invalid choice. please try again. ");
				
				
			}
		}
				
		
	}
}
