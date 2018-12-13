public class MyLinkedList{
    private int size;
    private Node start,end;

    public MyLinkedList(int value, int begin, int last){
      size = value;
      start = new Node(begin);
      end = new Node(last);
      //considering something like subString: Node = (index in the list, data, index+1)
    }

    public int size(){
      return size;
    }

    public boolean add(int value){
      end = new Node(value);
      return true;
    }

    public String toString(){
      String ans = "";
      for (int i=0; i < size; i++){

      }
      return
    }
}
