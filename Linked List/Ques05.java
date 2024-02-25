// Given two numbers represented by two lists, write a function that returns the sum list. The
// sum list is a list representation of the addition of two input numbers.
// Input : List1: 5->6->3 // represents number 563
//         List2: 8->4->2 // represents number 842

// Output : Resultant list: 1->4->0->5 // represents number 1405
//          Explanation: 563 + 842 = 1405

import java.util.Scanner;
public class Ques05 {
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
        System.out.print("Enter Nodes Data: ");
        for (int i = 0; i < n; i++) {
            int Data = sc.nextInt();
            Node newNodeData = new Node(Data);

            if (head == null) {
                head = newNodeData;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNodeData;
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

    public int ListToNum() {
        // StringBuilder sb = new StringBuilder();
        String str = "";
        Node temp = head;
        while (temp != null) {
            str += temp.data;
            // sb.append(temp.data);
            temp = temp.next;
        }
        int num1 = Integer.valueOf(str);
        return num1;
    }

    public void IntToList(int n) {
        head = null;

        if (n == 0) {
            head = new Node(0);
            return;
        }

        while (n > 0) {
            int digit = n % 10;
            Node newNode = new Node(digit);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

            n /= 10;
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes of List 01 : ");
        int n = sc.nextInt();

        Ques05 list01 = new Ques05();
        list01.CreateList(n, sc);
        int num1 = list01.ListToNum();

        System.out.print("Enter the number of nodes of List 02 : ");
        int m = sc.nextInt();
        Ques05 list02 = new Ques05();
        list02.CreateList(m, sc);
        int num2 = list02.ListToNum();

        int sum = num1 + num2;

        Ques05 list03 = new Ques05();
        list03.IntToList(sum);
        list03.printList();
    }

}
