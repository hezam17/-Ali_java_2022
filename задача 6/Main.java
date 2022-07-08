

/*
Given the head of a sorted linked list,
delete all duplicates such that each element appears only once.
Return the linked list sorted as well.
 */
//Али Хезам 11-013

class LinkedList {
    ListNode head;


    static class ListNode {
        int data;
        ListNode next;
        ListNode(int d) {
            data = d;
            next = null;
        }
    }


    public static void main(String args[]) {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println(
                "List before removal of duplicates");
        llist.printList();

        llist.removeDuplicates();

        System.out.println(
                "List after removal of elements");
        llist.printList();
    }

    public void removeDuplicates() {
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr;
            while (temp != null &&
                    temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }

    public void push(int new_data) {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

