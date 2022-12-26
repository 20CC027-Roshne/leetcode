   public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode sen = new ListNode(0);
        sen.next = head;
        ListNode slow = sen;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
