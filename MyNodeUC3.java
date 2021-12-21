package linklist;



public class MyNodeUC3 <K> implements INode<K>{
    private K key;
    private INode next;
    
    public MyNodeUC3(K key){
        this.key = key;
        this.next = null;
    }
    // Getter and setter
    @Override
    public K getKey(){
        return key;
    }
    @Override
    public void setKey(K key){
        this.key = key;
    }
    @Override
    public INode<K> getNext(){
        return next;
    }
    @Override
    public void setNext(INode next){
        this.next = (MyNodeUC3<K>) next;
    }
}
