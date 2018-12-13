public class Node{
    private int data;
    private Node next,prev;

    public Node(int now) {
      data = now;
    }

    public Node(int now, int after){
      next = new Node(after);
      data = now;
    }

    public Node(int before, int now, int after){
      prev = new Node(before);
      next = new Node(after);
      data = now;
    }

}
