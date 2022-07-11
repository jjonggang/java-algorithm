package datastructure_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2164_카드 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queue<Integer> myQueue = new LinkedList<>();
            int N = sc.nextInt();
            for(int i=1;i<N+1;i++){
                myQueue.add(i);
            }
            while(myQueue.size()>1){
                myQueue.poll();
                myQueue.add(myQueue.poll());
            }
            System.out.println(myQueue.poll());
        }
}
