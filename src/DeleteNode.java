
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class DeleteNode {

        static class SinglyLinkedListNode {
            public int data;
            public SinglyLinkedListNode next;

            public SinglyLinkedListNode(int nodeData) {
                this.data = nodeData;
                this.next = null;
            }
        }

        static class SinglyLinkedList {
            public SinglyLinkedListNode head;
            public SinglyLinkedListNode tail;

            public SinglyLinkedList() {
                this.head = null;
                this.tail = null;
            }

            public void insertNode(int nodeData) {
                SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

                if (this.head == null) {
                    this.head = node;
                } else {
                    this.tail.next = node;
                }

                this.tail = node;
            }
        }

        public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
            while (node != null) {
                System.out.printf("-----"+node.data);

                node = node.next;

            }
        }

        // Complete the deleteNode function below.

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */
        static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
// create a new node called currentnode and assign it from head
// int i =0 and iterate till position-1 do currnode = head.next
// currentnode.next = current.next.next till head.tail is not null
//
//
            SinglyLinkedListNode currentnode = head;
            int i = 0;
            while (i < position-1) {
                currentnode = currentnode.next;
                i++;
            }
            SinglyLinkedListNode newnode = currentnode.next.next;
            currentnode.next = newnode;
            return head;
        }

        public static void main(String[] args) throws IOException {
            SinglyLinkedListNode obj = new SinglyLinkedListNode(1);
            SinglyLinkedListNode obj2 = new SinglyLinkedListNode(2);
            SinglyLinkedListNode obj3 = new SinglyLinkedListNode(3);
            obj2.next = obj3;
            obj.next=obj2;

            printSinglyLinkedList(obj, " ");
            SinglyLinkedListNode res = deleteNode(obj,2);

            printSinglyLinkedList(res, " ");
        }
    }