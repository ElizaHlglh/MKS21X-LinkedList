public class Node{
    private Integer data;
    private Node next,prev;

    public Node(Integer value) {//might not have constructor
      data = value;
      next = null;
      prev = null;
    }

    public Node next(){
      return next;
    }

    public Node prev(){
      return prev;
    }

    public void setNext(Node other){
      next = other;
    }

    public void setPrev(Node other){
      prev = other;
    }

    public Integer getData(){
      return data;
    }

    public Integer setData(Integer i){
      Integer old = data;
      data = i;
      return old;
    }

    public String toString(){
      return data + "";
    }

}
