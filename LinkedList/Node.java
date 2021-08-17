package LinkedList;
/* constructor class for node */
public class Node {
  int data;
  Node next;
  Node (int data){
      this.data=data;
      this.next=next;
  }

}


class Main{
    public static void main(String[] args) {
      Node first=new Node(1);

        Node second=new Node(2);
        first.next=second;
        Node third=new Node(3);
        second.next=third;
        Node fourth=new Node(4);
        third.next=fourth;

        Node temp=first;
        while (temp!=null){
            if (temp.next!=null)
            System.out.print(temp.data+"->");
            else
                System.out.print(temp.data);

            temp=temp.next;
        }



    }
}