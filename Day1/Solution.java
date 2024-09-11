package Day1;

import java.util.PriorityQueue;

class Solution {
    public static void main(String[] args) {
        System.out.println("Day 1 of 21DaysStreak-GFGxDeutscheBank");
    }
    public long minCost(long[] arr) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        long totalCost = 0;

        for (long num : arr) {
            minHeap.add(num);
        }

        while (minHeap.size() > 1) {
            long first = minHeap.poll();
            long second = minHeap.poll();
            long cost = first + second;
            totalCost += cost;
            minHeap.add(cost);
        }

        return totalCost;
    }
}
