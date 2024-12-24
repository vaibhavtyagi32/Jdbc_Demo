package Queue;

import java.util.Arrays;

public class Practice {
    static class Queue{
       static int rear;
       static int size;
       static int arr[];
       static int front;
       Queue(int n){
           this.size=n;
           arr=new int[n];
           rear=-1;
           front=-1;
       }
       public static boolean isEmpty(){
           return rear==-1 && front==-1;
       }
       public  static  boolean isFull(){
           return (rear+1)%size==front;
       }
       public static void add(int data){
           if(isFull()){
               System.out.println("queue is full");
               return;
           }
           if(front==-1){
               front=0;
           }
           rear=(rear+1)%size;
           arr[rear]=data;
       }
       public static int remove(){
           if(isEmpty()){
               System.out.println("queue is empty");
               return -1;
           }
           int res=arr[front];
           if(front==rear){
               front=rear=-1;
           }
           else{
               front=(front+1)%size;
           }
           return res;
       }
       public static int peek(){
           if(isEmpty()){
               System.out.println("queue is empty");
               return -1;
           }
           return arr[front];
       }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
