package LinkedList;

import java.util.List;
import java.util.Stack;

public class ListOperations {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode tail = head;
        int total=1;
        while(tail.next != null){
            total++;
            tail=tail.next;
        }
        System.out.print(total);
        int mod = total % k;
        int diff = total -k;

        if(mod == 0) return head;
        tail.next=head; // 5 1 2 3 4 5
        ListNode new_tail = tail;
        while (diff > 0){
            new_tail = new_tail.next;
            diff --;
        }
        ListNode new_head = new_tail.next;
        new_tail.next = null;
        return new_head;
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        ListNode head = root;
        int total=0;
        int rem=0;
        int div=0;
        while(head != null){
            total++;
            head = head.next;
        }
        div = total/k;
        rem = total % k;
        head = root;
        for(int i=0;i<k;i++){
            ListNode arr = new ListNode(0);
            ListNode tmp = arr;
            for(int m=0;m<div+ (i < rem ? 1 : 0) ;m++){
                tmp = tmp.next = new ListNode(head.val);;
                if(head != null){
                    head=head.next;
                }
            }
            res[i] = arr.next;
        }
        return res;
    }

    /**
     * 1-2-3-4-5 => head
     * prev = null, next = 2 3 4 5
     * head =1 prev = 1 head = 2 3 4 5
     *
     * head = 2 3 4 5
     * next = 3 4 5 prev = 1
     * head 2 1 prev 2 1
     * head = 3 4 5
     *
     *
     */

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

public ListNode add(ListNode head,int[] a){
    for(int i : a){
        if (head == null){
            head = new ListNode(i);
        }else{
            ListNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            ListNode tmp = new ListNode(i);
            tmp.next = null;
            last.next = tmp;
        }
    }
    return head;
}


public boolean search(ListNode head,int input){
        boolean result = false;
        while(head != null){
            if(head.val == input) return true;
            head = head.next;
        }
        return result;
}


    public ListNode remove(ListNode head,int a){
        if (head == null){
            return null;
        }else{
            if(head !=null){
                if(head.val == a) {
                    if(head.next != null) {
                        ListNode last = head.next;
                        head = last;
                        return head;
                    }
                }
            }
            ListNode last = head;
            while (last.next != null) {
                if(last.next.val == a) {
                    if(last.next.next != null) {
                        ListNode curr = last.next.next;
                        last.next = curr;
                    }else{
                        last.next=null;
                    }
                    return head;
                }
                last = last.next;
            }
        }
        return head;
}



    public int find(ListNode head,int a){
        int pos =0;
            if (head == null){
                return 0;
            }else{
                if(head !=null){
                    pos++;
                    if(head.val == a) {
                        return pos;
                    }
                }
                ListNode last = head;
                while (last.next != null) {
                    pos++;
                    if(last.next.val == a) {
                        return pos;
                    }
                    last = last.next;
                }
            }
            return pos;
        }


    public ListNode reverseWithStack(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            ListNode curr = new ListNode(head.val);
            stack.push(curr);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        head = dummy;

        while (!stack.isEmpty()) {
            ListNode curr = stack.pop();
            head.next = new ListNode(curr.val);
            head = head.next;
        }
        return dummy.next;
    }

    public boolean isPalindrome(ListNode head) {
        // fast pointer 2 jump
        // slow pointer
        //reverse the list
        //iterate slow till end
        // incre fast too
        // if fast & slow matches return true falsee;
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow =slow.next;
        }
        slow =  reverse(slow);
        fast = head;
        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = splitMid(head);
        first = sortList(first);
        second = sortList(second);
        return merge(first, second);
    }

    private ListNode merge(ListNode first, ListNode second) {
        ListNode temp = null;
        ListNode result = null;
        while(first!=null && second!=null) {
            if(first.val < second.val) {
                if(temp == null) {
                    temp = first;
                    result = temp;
                }
                else {
                    temp.next = first;
                    temp = temp.next;
                }
                first = first.next;
            } else {
                if(temp == null) {
                    temp = second;
                    result = temp;
                }
                else {
                    temp.next = second;
                    temp = temp.next;
                }
                second = second.next;
            }
        }
        while(first != null) {
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }
        while(second != null) {
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }
        return result;
    }

    private ListNode splitMid(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while(fast!=null && fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }



    public static void main(String args[]){
        ListOperations o = new ListOperations();
        int[] a = {1,2,3,4,5};
        ListNode n = o.add(null,a);
        int i = o.find(n,4);
        System.out.println(i);
        ListNode n2 = o.remove(n,3);
        ListNode a2 = o.reverse(n);

        int[] a1 = {1,2};
        ListNode n1 = o.add(null,a1);
        System.out.println(o.isPalindrome(n1));

        int[] a3 = {1,2,7,3};
        ListNode n3 = o.add(null,a3);

        ListNode sort = o.sortList(n3);
        System.out.println("------------------");

        int[] a4 = {1,2,7,3,8,9,11,12,13,14,15};
        ListNode n4 = o.add(null,a4);
//        ListNode n4_rev = o.reverseWithStack(n4);

 //       System.out.println("------------------"+o.search(n4,17));
        //ListNode[] res = o.splitListToParts(n4,3);
        int[] a6 = {1,2,3,4,5};
        ListNode n6 = o.add(null,a6);

        ListNode res = o.rotateRight(n6,2);
        System.out.println("-");

    }
}
