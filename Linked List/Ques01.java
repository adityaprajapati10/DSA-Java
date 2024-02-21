// Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
// Examples:
// Input : 14->21->11->30->10, X = 14
// Output : Yes

import java.util.*;
public class Ques01 {
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

    public boolean FindTarget(int t){
      
        Node temp = head ;
        while (temp != null) {
            if(temp.data == t){
                return true ;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Ques01 ll = new Ques01();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Nodes in LinkedList : ");
        int n = sc.nextInt();
        ll.CreateList(n, sc);
        ll.printList();
        System.out.print("Enter Target : " );
        int t = sc.nextInt();
        System.out.println(ll.FindTarget(t));
        sc.close();
    }
}
