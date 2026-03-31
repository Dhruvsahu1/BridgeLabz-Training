
class node {
    int val;
    node next;

    node(int value) {
        val = value;
        next = null;
    }
}

public class pallindroneLinkedList {


    public static node reverse(node head) {

        if (head == null || head.next == null) {
            return head;
        }

        node newHead = reverse(head.next);

        head.next.next = head;  
        head.next = null;       
        return newHead;
    }
    public static boolean isPalindrome(node head) {

        if (head == null || head.next == null) {
            return true;
        }

        node slow = head;
        node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node secondHalf = reverse(slow.next);
        node first = head;
        node second = secondHalf;

        boolean isPalin = true;

        while (second != null) {
            if (first.val != second.val) {
                isPalin = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        slow.next = reverse(secondHalf);

        return isPalin;
    }

    public static void main(String[] args) {

        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(2);
        head.next.next.next.next = new node(1);

        if (isPalindrome(head)) {
            System.out.println("Linked List is Palindrome");
        } else {
            System.out.println("Linked List is NOT Palindrome");
        }
    }
}
