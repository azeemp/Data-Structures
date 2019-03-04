

public class Main {
	public static void main(String args[]){
	    LinkedList list = new LinkedList();
	   
	    list.addNode(1);
	    list.append(2);
	    list.append(3);
	    list.append(3);
	    list.append(4);
	    
	    System.out.println("1) Remove duplicates from a Linked List:");
	    System.out.println("With duplicates:");
	    list.print(list);
	    list.removeDuplicates(list.gethead());
	    System.out.println();
	    System.out.println("Without duplicates:");
	    list.print(list);
	    System.out.println();
	    System.out.println();
	    
	    LinkedList list2 = new LinkedList();
	    
	    list2.addNode(4);
	    list2.append(5);
	    list2.append(6);
	    list2.append(7);
	    list2.append(8);
	    
	    System.out.println("2) Merge 2 sorted Linked Lists:");
	    System.out.println("List 1:");
	    list.print(list);
	    System.out.println();
	    System.out.println("List 2:");
	    list.print(list2);
	    System.out.println();
	    System.out.println("Merged:");
	    list.mergeSortedLists(list.gethead(),list2.gethead());
	    list.print(list);
	    		
	}


}
