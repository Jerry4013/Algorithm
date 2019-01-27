public class M_82_RemoveDuplicates {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;}
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        while (head.next != null && head.val == head.next.val){
            int temp = head.val;
            while (head !=null && head.val == temp){
                head = head.next;
            }
            if (head == null){
                return null;
            }
        }
        ListNode position = head;
        while (position.next != null && position.next.next!= null){
            if (position.next.val == position.next.next.val){
                int temp = position.next.val;
                while (position.next != null && position.next.val == temp){
                    position.next = position.next.next;
                }
            } else {
                position = position.next;
            }

        }
        return head;
    }
}
