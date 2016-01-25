
public class Day24 {

	static Node removeDuplicates(Node head) {
        Node current = head;
        
        while (current != null && current.next != null) {
            while (current.next != null && current.data == current.next.data){
                current.next = current.next.next;
            }
            current = current.next;
        }

        return head;
    }
	
}
