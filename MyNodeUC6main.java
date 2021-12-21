package linklist;

public class MyNodeUC6main {
	
	public static void deleteLastElementLinkedList(Integer a1,Integer a2,Integer a3){
        MyNode<Integer> myFirstNode = new MyNode<>(a1);
        MyNode<Integer> mySecondNode = new MyNode<>(a2);
        MyNode<Integer> myThirdNode = new MyNode<>(a3);
        Mylinkedlist myLinkedList = new Mylinkedlist();
        
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        System.out.print("Initial Linked List: ");
        myLinkedList.printMyNodes();
        
         System.out.println(myLinkedList.popLast());
        System.out.println("Linked List after popping last element: ");
        myLinkedList.printMyNodes();
        
        // check if last element of linked list popped
        boolean result = myLinkedList.head.equals(myFirstNode) && 
                         myLinkedList.tail.equals(mySecondNode) ;
        System.out.println(a3+" has been popped out from the linked list with nodes "
                + a1+", "+ a2 + " and "+ a3+ " : "+ result);
    }
    
    public static void main(String []args){
        System.out.println(" perform basic nodes"
                + "related to linked list.");
        // Delete last element of the linked list
        deleteLastElementLinkedList(56,30,70);
    }

}
