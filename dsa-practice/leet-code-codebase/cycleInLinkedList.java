
class Node {

    int val;
    Node next;

    Node(int value) {
        val = value;
        next = null;
    }
}

public class cycleInLinkedList {

    public static boolean hasCycle(Node head) {

        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head.next.next.next.next.next = head.next.next;

        if (hasCycle(head)) {
            System.out.println("Cycle is present in the linked list");
        } else {
            System.out.println("No cycle in the linked list");
        }
    }
}
