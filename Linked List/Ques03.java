// Given the head of a sorted linked list, delete all duplicates such that each element
// appears only once. Return the linked list sorted as well.
// Input: head = [1,1,2]
// Output: [1,2]

import java.util.Scanner;

public class Ques03 {
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

    public void printList() {
        System.out.print("Linked List elements are: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void DeleteAllDuplicates() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Ques03 LL = new Ques03();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes : ");
        int n = sc.nextInt();
        LL.CreateList(n, sc);
        LL.printList();
        LL.DeleteAllDuplicates();
        LL.printList();
    }

}
