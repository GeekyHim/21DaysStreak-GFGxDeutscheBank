package Day2;

public class Solution {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Day 2 of 21DaysStreak-GFGxDeutscheBank");
    }
    public int getMiddle(Node head) {
        if (head == null || head.next == null) {
            return head.data;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}

