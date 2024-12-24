package Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

    }

    public static void main(String[] args) {

    }
}
