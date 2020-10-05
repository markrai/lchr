package leetcode.AddTwoNumbers;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result1 = new ListNode();
        ListNode result2 = new ListNode();
        ListNode result3 = new ListNode();

        String firstString = "" + l1.next.next.val + l1.next.val + l1.val;
        String secondString = "" + l2.next.next.val + l2.next.val + l2.val;

        int firstInt = Integer.parseInt(firstString);
        int secondInt = Integer.parseInt(secondString);

        String resultString = firstInt + secondInt + "";

        result1.val = Character.getNumericValue(resultString.charAt(3));
        result2.val = Character.getNumericValue(resultString.charAt(2));
        result3.val = Character.getNumericValue(resultString.charAt(1));

        result1.next = result2;
        result2.next = result3;

        return result1;
    }


    public static void main(String[] args) {

        ListNode l1a = new ListNode();
        ListNode l1b = new ListNode();
        ListNode l1c = new ListNode();
        ListNode l2a = new ListNode();
        ListNode l2b = new ListNode();
        ListNode l2c = new ListNode();


        l1a.val = 2;
        l1b.val = 4;
        l1c.val = 3;

        l1a.next = l1b;
        l1b.next = l1c;


        l2a.val = 5;
        l2b.val = 6;
        l2c.val = 4;

        l2a.next = l2b;
        l2b.next = l2c;


        Solution s = new Solution();

        s.addTwoNumbers(l1a, l2a);

    }
}