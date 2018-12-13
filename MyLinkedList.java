public class MyLinkedList{
    private int length;
    private Node start,end;

    public MyLinkedList(){
      size = 0;
      start = null;
      end = null;
    }

    public int size(){
      return length;
    }

    public boolean add(Integer value){
      if (size == 0){
        create = new Node(value);
        start = create;
        end = create;
      }
      else{
        create = new Node(value);
        create.setPrev(end);
        end.setNext(create);
        end = create;
	size++;
      }
    }

    public String toString(){
      String ans = "";
      Node current = start;
      while(current != null){
	ans += current.getData();
	current = current.next();
      }
      return ans; 
    }
}
