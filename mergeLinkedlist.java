public class mergeLinkedlist {
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode st = list1;
        ListNode end = list1;
        ListNode temp = list2;
        while (a > 1) {
            st = st.next;
            a--;
        }
        while (b > -1) {
            end = end.next;
            b--;
        }
        st.next = temp;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = end;

        return list1;
    }
    
}
