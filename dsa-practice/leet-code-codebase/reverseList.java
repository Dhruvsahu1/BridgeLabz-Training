
class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        val = value;
        next = null;
    }
}

public class reverseList {

    public static ListNode reverseList(ListNode head) {

        ListNode previous = null;   
        ListNode current = head;    

        while (current != null) {

           
            ListNode nextNode = current.next;

            
            current.next = previous;

           
            previous = current;
            current = nextNode;
        }

       
        return previous;
    }

  
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   
    public static void main(String[] args) {

  
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed List: ");
        printList(head);
    }
}
