

/*
 * You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 */
//Али Хезам 11-013

public class Main {

    static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {


        Node head = null;
        Node head2 = null;

        head = create(head, 1);
        head = create(head, 3);
        head = create(head, 5);
        head = create(head, 7);
        head = create(head, 9);

        head2 = create(head2, 2);
        head2 = create(head2, 4);
        head2 = create(head2, 6);
        head2 = create(head2, 8);
        head2 = create(head2, 10);

        System.out.println("List 1 before merge");
        display(head);
        System.out.println("list 2 before merge");
        display(head2);
        System.out.println("after merge tow lists");
        display(mergeTwoLists(head, head2));
    }

    public static Node mergeTwoLists(Node l1, Node l2) {
        Node head = new Node();
        Node p = head;

        Node p1 = l1;
        Node p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return head.next;
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
    
}
