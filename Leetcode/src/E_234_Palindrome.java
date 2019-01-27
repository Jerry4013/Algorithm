import java.util.Stack;

public class E_234_Palindrome {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode head;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode position = head;
        while (position != null){
            stringBuilder.append(position.val + ", ");
            position = position.next;
        }
        return stringBuilder.toString();
    }

    public E_234_Palindrome(int x){
        head = new ListNode(x);
    }
    public void isPalindrome() {
//        if (head == null || head.next == null){
//            return true;
//        }
//        int length = 0;
//        ListNode position = head;
//        while (position != null){
//            position = position.next;
//            length++;
//        }
        ListNode next;
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.head = prev;
//        return true;
    }

    public static void main(String[] args) {
        new E_234_Palindrome(0).run();
    }

    private void run() {
        E_234_Palindrome list = new E_234_Palindrome(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(list);
        isPalindrome();
        System.out.println(list);
    }
}
