package com.company;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class SolutionMergeTwoSortedLinkedLists{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){

        // if list one is empty, return list two
        // this rule also applies when list1 is
        // shorter than list2.
        if (list1 == null){
            return list2;
        }

        // same situation here. If list2 is shorter
        // then list1 will be returned to complete
        // the merged list
        if (list2 == null){
            return list1;
        }

        // compare list1 value to list2 value, if list1
        // is smaller it will be added to the sorted list
        //likewise for list2 value. If it is smaller
        //it will be added to the list

        if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

