public class E_21_MergeTwoSortedLists {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode last = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                last.next = l1;
                last = last.next;
                l1 = l1.next;
            } else {
                last.next = l2;
                last = last.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            last.next = l2;
        } else {
            last.next = l1;
        }
        return result.next;
    }
}
