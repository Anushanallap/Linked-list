package linklist;

public class Mylinkedlist {
	 public INode head;
	    public INode tail;
	    
	    public Mylinkedlist(){
	        this.head = null;
	        this.tail = null;
	    }
	    
	    public void add(INode newNode){
	        if (this.tail == null){
	            this.tail = newNode;
	        }
	        if (this.head == null){
	            this.head = newNode;
	        } else {
	            INode tempNode = this.head;
	            this.head = newNode;
	            this.head.setNext(tempNode);    //30 points to 70 (Tail)//  
	        }
	    }
	        
	        public void append(INode newNode){
	            if (this.head == null){
	                this.head = newNode;
	            } 
	            if (this.tail == null){
	                this.tail = newNode;
	            }else {
	                this.tail.setNext(newNode);
	                this.tail = newNode;        // 56 points to 30 (Tail)  
	            }
	        }
	        // New node inserted after previous node
	        public void insert(INode prevNode,INode newNode){
	           {
	            INode tempNode = prevNode.getNext(); // get pointer to next
	            prevNode.setNext(newNode);
	            newNode.setNext(tempNode); // newnode should point to element which was 
	                                        // pointed to by prevnode earlier.
	           }     
	        }
	        // Pop the first element of the linked list 
	        public INode pop1(){
	            INode tempNode = this.head;
	            this.head  = head.getNext();//
	            return tempNode;
	           } 

	        // Pop the last element of the linked list 
	        public INode popLast1(){
	            INode tempNode2 = this.head;
	            // get the element just before the last element
	            while (!tempNode2.getNext().equals(tail)){
	                tempNode2 = tempNode2.getNext();
	            }
	            this.tail = tempNode2;
	            tempNode2 = tempNode2.getNext();
	            return tempNode2;
	           } 
	        // Search for a given element in the linked list
	        public int search(INode srchNode){
	            INode tempNode = this.head;
	            int count = 0 ;
	            Boolean elem_found = false;
	            while (tempNode.getNext()!=null && (elem_found.equals(false))){
	                if (tempNode.getKey().equals(srchNode.getKey())){
	                    elem_found = true;
	                }
	                tempNode = tempNode.getNext();
	                count++;
	                System.out.println("elem_found"+elem_found+"count"+count);
	            }
	            if (elem_found.equals(false)){
	                count = -1;
	            }
	            return count;
	    }  
	     
	    public void printMyNodes(){
	        StringBuffer myNodes = new StringBuffer("My Nodes: ");
	        INode tempNode = head;
	        while (tempNode.getNext() != null) {
	            myNodes.append(tempNode.getKey());
	            if (!tempNode.equals(tail)) myNodes.append("->");
	            tempNode = tempNode.getNext();
	        }
	        myNodes.append(tempNode.getKey());
	        System.out.println(myNodes);
	    }


 void append(MyNode<Integer> myFirstNode) {
			// TODO Auto-generated method stub
			
		}

public void insert(MyNode<Integer> myFirstNode, MyNode<Integer> mySecondNode) {
	// TODO Auto-generated method stub
	
}

public void pop() {
	// TODO Auto-generated method stub
	
}

public char[] popLast() {
	// TODO Auto-generated method stub
	return null;
}
	}


