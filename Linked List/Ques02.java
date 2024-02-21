// Insert a node at the given position in a linked list. We are given a pointer to a node, and the new node is inserted after the given node.
// Input : - LL = 1 -> 2 -> 4 -> 5 -> 6 pointer = 2 value = 3.
// Output : - 1 -> 2 -> 3 -> 4 -> 5 -> 6

import java.util.*;
public class Ques02 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void CreateList(int n, Scanner sc) {
        System.out.print("Enter Node Data: ");
        for (int i = 0; i < n; i++) {
            int Data = sc.nextInt();
            Node newDataNode = new Node(Data);
            if (head == null) {
                head = newDataNode;

            } else {
                newDataNode.next = null;
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newDataNode;
            }
        }
    }

    public void InsertNode(int newData, int pointer) {

        Node newDataNode = new Node(newData);
        int count = 0;
        Node temp = head;
        while (count < pointer-1 && temp != null) {
            temp = temp.next;
            count++;
        }
        newDataNode.next = temp.next;
        temp.next = newDataNode;
    }

    public void printList() {
        System.out.print("Linked List elements are: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ques02 ll = new Ques02();

        System.out.print("Enter number of Nodes in LinkedList : ");
        int n = sc.nextInt();
        ll.CreateList(n, sc);

        System.out.print("Enter the element to insert: ");
        int m = sc.nextInt();
        System.out.print("Enter position where insert: ");
        int position = sc.nextInt();
        ll.InsertNode(m, position);
        System.out.println();

        ll.printList();

        sc.close();
    }

}
