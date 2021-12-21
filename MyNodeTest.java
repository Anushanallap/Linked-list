package linklist;

public class MyNodeTest {
	
	
	public static void given3NumberswhenLinkedshouldpassedLinkedlistTest(Integer a1,Integer b1,Integer c1) {
		
		MyNode<Integer>MyFirstNode = new MyNode<>(56);
		
		MyNode<Integer>MySecondNode = new MyNode<>(30);
		
		MyNode<Integer>MyThirdNode = new MyNode<>(70);
		
		MyFirstNode.setNext(MySecondNode);
       
		MySecondNode.setNext(MyThirdNode);
        
        boolean result = MyFirstNode.getNext().equals(MySecondNode) && 
                         MySecondNode.getNext().equals(MyThirdNode);
        
        System.out.println("Linkedlist MyNode test "+ a1+" , "+ b1+" and "+ c1+ " has been created: "+ result);
    }
	
public static void main(String []args) {
	
	System.out.println("Print my Linked list Nodes");
	
	given3NumberswhenLinkedshouldpassedLinkedlistTest(56,30,70);
	
}


}


