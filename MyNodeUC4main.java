package linklist;

public class MyNodeUC4main {
	
	public static void insertLinkedListElement(Integer a1,Integer a2,Integer a3){
        MyNode<Integer> myFirstNode = new MyNode<>(a1);
        MyNode<Integer> mySecondNode = new MyNode<>(a2);
        MyNode<Integer> myThirdNode = new MyNode<>(a3);
        Mylinkedlist myLinkedList = new Mylinkedlist();
        
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        System.out.print("Nodes before insert: ");
        myLinkedList.printMyNodes();
        
        myLinkedList.insert(myFirstNode,mySecondNode);
        System.out.print("Nodes after insert: ");
        myLinkedList.printMyNodes();
        

        // check if linked list created
        boolean result = myLinkedList.head.equals(myFirstNode) && 
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode) ;
        System.out.println(a2+" has been inserted in the linked list with nodes "+ a1+
                " and "+ a3+ " : "+ result);
    }
    
    public static void main(String []args){
        System.out.println("print basic nodes"
                + "related to linked list.");
        // Create a linked list by appending 30 and 70 to 56
        insertLinkedListElement(56,30,70);
    }

}
