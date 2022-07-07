
/*
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 *
 */
//Али Хезам 11-013

public class Main {

   static class Node {
        int data;
        Node next;
    }
    public static void main(String[] args) {


        Node head = null;

        head = create(head, 1);
        head = create(head, 2);
        head = create(head, 3);
        head = create(head, 4);
        head = create(head, 5);

        int n = 2;

        System.out.print("Linked list before modification: \n");
        display(head);

        head = removeNthFromEnd(head, n);
        System.out.print("Linked list after modification: \n");
        display(head);
        head = removeNthFromEnd(head,3 );
        System.out.print("Linked list after modification: \n");
        display(head);
    }

    //insert node in a linked list
    public static Node create(Node head, int x) {
        Node temp, ptr = head;
        temp = new Node();
        temp.data = x;
        temp.next = null;
        if (head == null)
            head = temp;
        else {
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to remove nth node from last
    public static Node removeNthFromEnd(Node head, int B) {
        // To store length of the linked list
        int len = 0;
        Node tmp = head;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        // B > length, then we can't remove node
        if (B > len) {
            System.out.print("Length of the linked list is " + len);
            System.out.print(" we can't remove " + B +
                    "th node from the");
            System.out.print(" linked list\n");
            return head;
        }
        // We need to remove head node
        else if (B == len) {
            // Return head.next
            return head.next;
        } else {
            // Remove len - B th node from starting
            int diff = len - B;
            Node prev = null;
            Node curr = head;
            for (int i = 0; i < diff; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            return head;
        }
    }

}
