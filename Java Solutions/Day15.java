import java.util.Scanner;

public class Day15 {
	
	class Node{
		int data;
		Node next;
		Node(int data){
	        this.data = data;
	        next = null;
	    }
		
	}

	public static  Node insert(Node head,int data)
	{
        Node current = head;
        Node newNode = new Node(data);
        
        if (current == null){
            head = newNode;
        } else{
            while (current.next != null) {
            current = current.next;
        }
            current.next = newNode;
        }

        return head;
	}
	
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner scanner = new Scanner(System.in);
          Node head=null;
          int total = scanner.nextInt();
          while(total-- > 0){
              int element = scanner.nextInt();
              head=insert(head, element);
          }
          scanner.close();
          display(head);
   }
	
}
