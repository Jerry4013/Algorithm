public class E_83_RemoveDuplicate {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode position = head;
        while (position !=null && position.next != null ){
            if (position.val == position.next.val){
                position.next = position.next.next;
            } else {
                position = position.next;
            }
        }
        return head;
    }
}
