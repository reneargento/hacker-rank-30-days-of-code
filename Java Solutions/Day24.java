
public class Day24 {

public static Node removeDuplicates(Node head) {
      //Write your code here
  if(head == null){
      return head;
  }
	else{
		if(head.next != null){
          		while( head.data == head.next.data){
              			if(head.next.next != null){
                  			head.next = head.next.next;
              			}
				else{
                  			head.next = null;
                  			break;
              		}

          	}
      	}
      removeDuplicates(head.next);
  }
  return head;
}

