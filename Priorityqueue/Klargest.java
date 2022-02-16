package Priorityqueue;
import java.util.*;
    import java.lang.*;
    import java.io.*;
public class Klargest {
    
    class Main
     {
         public static void main (String[] args) throws IOException
          {
              Scanner scn= new Scanner(System.in);
                 int n = scn.nextInt();
              int[] num = new int[n];
              for (int i = 0; i < n; i++) {
                        num[i] = scn.nextInt();
                   }
              int k = scn.nextInt();
              solve(n,num,k);
          }
         
          public static void solve(int n,int[] arr,int k){
             PriorityQueue<Integer> pq = new PriorityQueue<>();
             for(int i = 0;i<n;i++){
                 if(i<k) 
                   pq.add(arr[i]);
                   else{
                       if(pq.peek()<arr[i]){
                           pq.remove();
                           pq.add(arr[i]);
                       }
                   }
             }
             while(pq.size()!=0){
                 System.out.println(pq.remove());
                 
             }

        }
    }
}
