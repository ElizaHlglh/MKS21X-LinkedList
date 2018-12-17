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
      String ans = "{";
      Node current = start;
      while(current != null){
        ans += current.getData() + ", ";
        current = current.next();
      }
      return ans+"}";
    }

    private Node getNode(int index){
      Node current = start;
      for (int i = 0; i < index && current != null; i++){
        current = current.next();
      }
      return current;
    }

    public Integer get(int index){
      if (index >= length || index < 0){
        throw new IndexOutOfBoundsException("Invalid index!!!");
      }
      else{
        Node current = getNode(index);
        if (current != null){
          return current.getData();
        }
        else{
          return null;
        }
      }
    }

    public Integer set(int index, Integer value){
      if (index >= length || index < 0){
        throw new IndexOutOfBoundsException("Invalid index!!!");
      }
      else{
        Node ToChange = getNode(index);
        return ToChange.setData(value);
      }
    }

    public boolean contains(Integer value){
      Node current = start;
      while (current != null){
        if (current.getData() == value){
          return true;
        }
        current = current.next();
      }
      return false;
    }

    public int indexOf(Integer value){
      Node current = start;
      int count = 0;
      while (current != null){
        if (current.getData() == value){
          return count;
        }
        current = current.next();
        count++;
      }
      return -1;
    }

    public void add(int index, Integer value){
      if (index > length || index < 0){
        throw new IndexOutOfBoundsException("Invalid index!!!");
      }
      else{
        
        Node before = getNode(index-1);
        Node ToAdd = new Node(value);
        Node After = getNode(index);
        before.setNext(ToAdd);
        ToAdd.setPrev(before);
        ToAdd.setNext(After);
        After.setPrev(ToAdd);
        length++;
      }
    }

    public Integer remove(int index){
      if (index >= length || index < 0){
        throw new IndexOutOfBoundsException("Invalid index!!!");
      }
      else{
        Node toRemove = getNode(index);
        if (end == toRemove){
          Node Before = toRemove.prev();
          Before.setNext(null);
          toRemove.setPrev(null);
          toRemove.setNext(null);
          end = Before;
          length--;
          return toRemove.getData();
        }
        else if(start == toRemove){
          Node After = toRemove.next();
          start = After;
          After.setPrev(null);
          toRemove.setPrev(null);
          toRemove.setNext(null);
          length--;
          return toRemove.getData();
        }
        else{
          Node Before = toRemove.prev();
          Node After = toRemove.next();
          Before.setNext(After);
          After.setPrev(Before);
          toRemove.setPrev(null);
          toRemove.setNext(null);
          length--;
          return toRemove.getData();
        }
      }
    }

    public boolean remove(Integer value){
      if (contains(value)){
        int index = indexOf(value);
        Node toRemove = getNode(index);
        if (end == toRemove){
          Node Before = toRemove.prev();
          Before.setNext(null);
          toRemove.setPrev(null);
          toRemove.setNext(null);
          end = Before;
          length--;
          return true;
        }
        else if(start == toRemove){
          Node After = toRemove.next();
          start = After;
          After.setPrev(null);
          toRemove.setPrev(null);
          toRemove.setNext(null);
          length--;
          return true;
        }
        else{
          Node Before = toRemove.prev();
          Node After = toRemove.next();
          Before.setNext(After);
          After.setPrev(Before);
          toRemove.setPrev(null);
          toRemove.setNext(null);
          length--;
          return true;
        }
      }
      else{
        return false;
      }
    }

}
