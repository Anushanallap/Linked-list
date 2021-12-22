package linklist;

public class MyNodeUC7main {
	
	public static void searchElementLinkedList(Integer search_key,Integer ...args){
        Mylinkedlist myLinkedList = new Mylinkedlist();
        for (Integer i:args){
          MyNode<Integer> myNode = new MyNode<>(i); 
          myLinkedList.add(myNode);
        }
        MyNode<Integer> mysearchNode = new MyNode<>(search_key);

        System.out.print("Linked List: ");
        myLinkedList.printMyNodes();
        int node_pos = myLinkedList.search(mysearchNode);
        System.out.println("The given element occurs at the following node: "+ node_pos);        
    }
    
    public static void main(String []args){
        System.out.println(" perform basic operations"
                + "related to linked list.");
        
        searchElementLinkedList(65,30,70,88,99,65,56,88);
    }
	

}
