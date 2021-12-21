package linklist;

public class MyNodeUC2Main {
	
	public static void createLinkedListAddingHead(Integer a1,Integer a2,Integer a3){
		
        MyNode<Integer> myFirstNode = new MyNode<>(a3);
        
        MyNode<Integer> mySecondNode = new MyNode<>(a2);
        
        MyNode<Integer> myThirdNode = new MyNode<>(a1);
        
        Mylinkedlist myLinkedList = new Mylinkedlist();
        
        myLinkedList.add((INode) myFirstNode);
        myLinkedList.add((INode) mySecondNode);
        myLinkedList.add((INode) myThirdNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myThirdNode) && 
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode) ;
        System.out.println("linked list with Mynodes "+ a1+" , "+
                a2+" and "+ a3+ " has been created: "+ result);
    }

	public static void main(String []args) {
		
		System.out.println("Print my Linked list Nodes");
		
		createLinkedListAddingHead(56,30,70);
		
	}

}
