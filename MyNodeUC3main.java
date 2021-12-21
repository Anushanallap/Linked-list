package linklist;

public class MyNodeUC3main {
	public static void createLinkedListAppending(Integer a1,Integer a2,Integer a3){
        MyNode<Integer> myFirstNode = new MyNode<>(a1);
        MyNode<Integer> mySecondNode = new MyNode<>(a2);
        MyNode<Integer> myThirdNode = new MyNode<>(a3);
        Mylinkedlist myLinkedList = new Mylinkedlist();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();

        
        boolean result = myLinkedList.head.equals(myFirstNode) && 
                         myLinkedList.tail.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode) ;
        System.out.println("The linked list with nodes "+ a1+" , "+
                a2+" and "+ a3+ " has been created: "+ result);
    }
    
    public static void main(String []args){
        System.out.println("print basic nodes"
                + "related to linked list.");
        
        createLinkedListAppending(56,30,70);
    }

}
