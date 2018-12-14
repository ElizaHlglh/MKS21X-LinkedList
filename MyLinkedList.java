public class MyLinkedList{
    private int length;
    private Node start,end;

    public MyLinkedList(){
      length = 0;
      start = null;
      end = null;
    }

    public int size(){
      return length;
    }

    public boolean add(Integer value){
      if (length == 0){
        Node create = new Node(value);
        start = create;
        end = create;
        length++;
      }
      else{
        Node create = new Node(value);
        create.setPrev(end);
        end.setNext(create);
        end = create;
        length++;
      }
      return true;
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

    private Integer get(int index){
      Node current = start;
      for (int i = 0; i < index && current != null; i++){
        current = current.next();
      }
      if (current != null){
        return current.getData();
      }
      else{
        return null;
      }
    }

    private Integer set(int index, Integer value){
      Node current = start;
      While (current.next() != null){
        if (current.getData() == )
      }
    }

    public boolean contains(Integer value){
      Node current = start;
      While (current.next() != null){
        if (current.getData() == )
      }
    }
}
