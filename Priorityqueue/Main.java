package Priorityqueue;

import java.util.PriorityQueue;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 21, 57, 92, 13, 43, 22, 21, 6 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
        }

        while(pq.size() !=0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
