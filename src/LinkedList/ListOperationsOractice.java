package LinkedList;

import java.util.Stack;

public class ListOperationsOractice {

    ListNode head;

    public ListNode getNodeByIndex(int index,int SIZE) {
        if(index == 0) {
            return head;
        } else {
            ListNode temp = head.next;
            for(int i=1; i<SIZE; i++) {
                if(index == i) {
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(head == null) return -1;
        int total=1;
        ListNode total_node = head;
        while(total_node.next != null){
            total++;
            total_node =  total_node.next;
        }
        if(index == 1){
            return head.val;
        }
        int counter=1;
        ListNode search_node = head;
        while(counter < total){
            ListNode current = search_node.next;
            if(index == counter) return current.val;
            counter++;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head == null){
            head = new ListNode (val);
            return;
        }
        ListNode new_head = new ListNode(val);
        new_head.next = head;
        head = new_head;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head == null){
            head = new ListNode (val);
        }
        ListNode new_head = head;
        while(new_head.next !=null){
            new_head = new_head.next;
        }
        ListNode new_node = new ListNode(val);
        new_head.next = new_node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(head == null){
            head = new ListNode (val);
            return;
        }
        ListNode newNode = new ListNode(val);
        int total=1;
        ListNode total_node = head;
        while(total_node.next != null){
            total++;
            total_node =  total_node.next;
        }

//        ListNode prev = getNodeByIndex(index-1,total);
        index=index-1;
        ListNode prev = head;
        if (index == 0){
            prev = head;
        }else {
            prev = head.next;
            for (int i = 1; i < total; i++) {
                if (index  == i) {
                    break;
                }
                prev = prev.next;
            }
        }
        if(prev == null) {
            return;
        }
        ListNode nextNode = prev.next;
        newNode.next = nextNode;
        prev.next = newNode;
    }


    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(head == null) return;
        if(head.next == null && index == 1) return;
        int total=1;
        ListNode total_node = head;
        while(total_node.next != null){
            total++;
            total_node =  total_node.next;
        }
        int counter=1;
        ListNode del_node = head;
        while(counter <= total){
            ListNode curr = del_node.next;
            if(index == counter){
                if(index != total){
                    del_node=del_node.next.next;
                    return;
                }else{
                    del_node.next = null;
                }
            }
            del_node=del_node.next;
            counter++;
        }
    }


    public static void main(String args[]){
        ListOperationsOractice o = new ListOperationsOractice();
        o.addAtHead(1);
        o.addAtTail(3);
        o.addAtIndex(1,2);

        System.out.println("-");

    }
}
