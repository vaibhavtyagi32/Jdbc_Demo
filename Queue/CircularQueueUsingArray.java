package Queue;

public class CircularQueueUsingArray {
    static class CircularQueue{
        static int rear;
        static int size;
        static int []arr;
        static int front;
        CircularQueue(int size){
            arr=new int[size];
            this.size=size;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }if(front==-1){
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
            }else{
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
        CircularQueue cq=new CircularQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        cq.add(4);
        cq.add(5);
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
    }
}
