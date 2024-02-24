// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

import java.util.*;

public class Ques04 {
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

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) { // if length is odd
            slow = slow.next;
        }

        Node mid = slow;

        Node nextPtr = null, previPtr = null;
        while (mid != null) {  // reversing second half 
            nextPtr = mid.next;
            mid.next = previPtr;
            previPtr = mid;
            mid = nextPtr;
        }
        Node secondHalf = previPtr;
        Node firstHalf = head;

        while (secondHalf != null) {  // COMPAIRING first half and second half
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        Ques04 list = new Ques04();
        list.CreateList(n, sc);

        boolean isPalindrome = list.isPalindrome();
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
