import java.util.*;
public class SinglyLL {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void CreateList(int n, Scanner sc) { // Creating LinkedList
        System.out.print("Enter Node Data: ");
        for (int i = 0; i < n; i++) {

            int Data = sc.nextInt();
            insertAtEnd(Data);
            // Data = 0;
        }
    }

    public void insertAtBeginning(int newData) { // Insert At Beginning
        Node newDataNode = new Node(newData);
        newDataNode.next = head;
        head = newDataNode;
    }

    public void insertAfterAnyNode(int newData, int position) { // Insert after any node

        if (position <= 0) {
            insertAtBeginning(newData);
            return;
        }

        Node newDataNode = new Node(newData);
        Node temp = head;
        for (int i = 0; i < position && temp != null; i++) {
            temp = temp.next;
        }

        newDataNode.next = temp.next;
        temp.next = newDataNode;

    }

    public void insertAtEnd(int newData) { // Insert At End
        Node newDataNode = new Node(newData);

        if (head == null) {
            head = newDataNode;
            return;
        }
        // if LinkedList is not empty

        newDataNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newDataNode;

    }

    public void DeleteBiginning() { // delete at biginnning
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        head = head.next;
    }

    public void DeleteAtEnd() { // delete at end
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void DeleteAfterAnyNode(int position) { // delete any position
        Node temp = head;
        // linkedlist is empty
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            return;
        }

        temp.next = temp.next.next;
    }

    public void ReverseIteratively() { // reverse a linked list iteratively
        Node current = head;
        Node nextptr = null;
        Node previous = null;

        while (current != null) {
            nextptr = current.next;
            current.next = previous;
            previous = current;
            current = nextptr;
        }
        head = previous;
    }

    public void ReverseRecursively(Node curr, Node prev) { // reverse a linked list recursively

        if (curr.next == null) { // Base Case condition
            head = curr;
            curr.next = prev;
            return;
        }

        Node Nextprt = curr.next;
        curr.next = prev;
        ReverseRecursively(Nextprt, curr); // Recursive call

    }

    // display all the nodes after the insertion
    public void printNode() {
        System.out.print("Linked list elements are : ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Count number of nodes
    public void CountNode() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Total  number of nodes is: " + count);
    }

    // Middle of Linked List
    public void MiddleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node of singly LL is: " + slow.data);

    }

    // Singly LL to Circular LL
    public void CircularLL() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
    }

    // Print Circular LL
    public void printCircularLL() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }
        System.out.print("Circular linked list elements are : ");
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Cycle Detection in a Linked List
    public void CycleDetection() {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("No Cycle Detected in a Linked List");
        }

        else {
            System.out.println("Cycle Detected in a Linked List");
        }

    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        int n; // for taking new node as a input in switch according to cases
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.println();
            System.out.println("PRESS 1 : Create a Singly Linked LIst");
            System.out.println("PRESS 2 : Insert node at Beginning");
            System.out.println("PRESS 3 : Insert node at End");
            System.out.println("PRESS 4 : Insert node at After any Node");
            System.out.println("PRESS 5 : Delete node at Beginning");
            System.out.println("PRESS 6 : Delete node at End");
            System.out.println("PRESS 7 : Delete node at any Position");
            System.out.println("PRESS 8 : Reverse a Linked List Iteatively");
            System.out.println("PRESS 9 : Reverse a Linked List Recursively");
            System.out.println("PRESS 10 : Print Singly LinkedList");
            System.out.println("PRESS 11 : Count number of nodes ");
            System.out.println("PRESS 12 : Middle Node of singly linkedList");
            System.out.println("PRESS 13 : Make Singly LL to Circular LL");
            System.out.println("PRESS 14 : Print Circular LL ");
            System.out.println("PRESS 15 : Cycle Detection in a Linked List");
            System.out.println("PRESS 0 : Exit");
            System.out.print("Enter Your Prefrence : ");
            int press = sc.nextInt();
            System.out.println();

            switch (press) {

                case 1:
                    System.out.print("Enter numbers of Nodes: ");
                    n = sc.nextInt();
                    ll.CreateList(n, sc);
                    ll.printNode();
                    break;

                case 2:
                    System.out.print("Enter the element to insert: ");
                    n = sc.nextInt();
                    ll.insertAtBeginning(n);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter the element to insert: ");
                    n = sc.nextInt();
                    ll.insertAtEnd(n);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter the element to insert: ");
                    n = sc.nextInt();
                    System.out.print("Enter position where insert: ");
                    int position = sc.nextInt();
                    ll.insertAfterAnyNode(n, position);
                    System.out.println();
                    break;

                case 5:
                    ll.DeleteBiginning();
                    ll.printNode();
                    break;

                case 6:
                    ll.DeleteAtEnd();
                    ll.printNode();
                    break;
                case 7:
                    System.out.print("Enter position where Delete : ");
                    position = sc.nextInt();
                    ll.DeleteAfterAnyNode(position);
                    ll.printNode();
                    break;

                case 8:
                    ll.ReverseIteratively();
                    System.out.println("After Reversing the List is : ");
                    ll.printNode();
                    break;

                case 9:
                    ll.ReverseRecursively(head, null);
                    System.out.println("After Reversing the List is : ");
                    ll.printNode();
                    break;

                case 10:
                    ll.printNode();
                    System.out.println();
                    break;

                case 11:
                    ll.CountNode();
                    break;

                case 12:
                    ll.printNode();
                    ll.MiddleNode();
                    break;

                case 13:
                    ll.CircularLL();
                    ll.printCircularLL();
                    break;

                case 14:
                    ll.printCircularLL();
                    break;

                case 15:
                    ll.CycleDetection();
                    break;

                case 0:
                    flag = true;
                    break;

                default:
                    System.out.println("Invalid input");

            }

        }

        sc.close();

    }

}