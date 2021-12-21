package linklist;

public class MyNodeUC5main {
	 public static void popElementLinkedList(Integer a1,Integer a2,Integer a3){
	        MyNode<Integer> myFirstNode = new MyNode<>(a1);
	        MyNode<Integer> mySecondNode = new MyNode<>(a2);
	        MyNode<Integer> myThirdNode = new MyNode<>(a3);
	        Mylinkedlist myLinkedList = new Mylinkedlist();
	        
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        System.out.print("Initial Linked List: ");
	        myLinkedList.printMyNodes();
	        
	        myLinkedList.pop();
	        System.out.print("Linked List after popping first element: ");
	        myLinkedList.printMyNodes();
	        

	        // check if linked list popped
	        boolean result = myLinkedList.head.equals(mySecondNode) && 
	                         myLinkedList.tail.equals(myThirdNode) ;
	        System.out.println(a1+" has been popped out from the linked list with nodes "
	                + a1+", "+ a2 + " and "+ a3+ " : "+ result);
	    }
	    
	    public static void main(String []args){
	        System.out.println("print basic nodes"
	                + "related to linked list.");
	        // Pop an element from a linked list
	        popElementLinkedList(56,30,70);
	    }
	}


