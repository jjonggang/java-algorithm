package datastructure_3;

import java.io.*;
import java.util.Stack;

public class P17298_오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[]A = new int[n];
        int[]ans = new int[n];
        String[] str = bf.readLine().split(" ");
        System.out.println(str.length);
        for(int i=0;i<n;i++){
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0); // 처음에는 항상 스택이 비어 있으므로 최초 값을 push하여 초기화
        for(int i=1;i<n;i++){
            // 스택이 비어있지 않고 현재 수열이 스택 top인덱스가 가리키는 수열보다 클 경우
            while(!myStack.isEmpty() && A[myStack.peek()]<A[i]){
                ans[myStack.pop()]=A[i];
            }
            myStack.push(i);
        }
        while(!myStack.empty()){
            // 반복문을 다 돌고 나왔는데 스택이 비어있지 않다면 빌 때까지
            ans[myStack.pop()] = -1;
            // 스택에 쌓인 index에 -1을 넣고
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n;i++){
            bw.write(ans[i]+" ");
            //출력한다
        }
        bw.write("\n");
        bw.flush();
    }
}
