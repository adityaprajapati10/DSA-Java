import java.math.BigInteger;

public class AddTwoNum {
    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int d) {
            val = d;
            next = null;
        }
    }

    public BigInteger ListToNum(ListNode l) {
        // String str = "";
        StringBuilder str = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            // str += temp.val;
            str.append(temp.val);
            temp = temp.next;
        }
        str.reverse();
        String st = str.toString();
        BigInteger num = new BigInteger(st);
        return num;
    }

    public ListNode NumtoList(BigInteger s) {
        ListNode head = null;
        ListNode current = null;

        if (s.equals(BigInteger.ZERO)) {
            head = new ListNode(0);
            return head;
        }

        BigInteger n = s;

        while (n.compareTo(BigInteger.ZERO) > 0) {
            int digit = n.mod(BigInteger.TEN).intValue();
            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }

            n = n.divide(BigInteger.TEN);
        }

        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger n1 = ListToNum(l1);
        BigInteger n2 = ListToNum(l2);

        BigInteger sum = n1.add(n2);
        return NumtoList(sum);
    }
}
