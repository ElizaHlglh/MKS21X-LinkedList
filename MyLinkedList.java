public class MyLinkedList{
    private int size;
    private Node start,end;

    public MyLinkedList{

    }

    public int size(){
	return size;
    }

    public boolean add(int value){
	end = new Node(value);
    }

    public String toString(){

    }
}
