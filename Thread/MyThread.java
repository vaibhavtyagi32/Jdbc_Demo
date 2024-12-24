package Thread;

public class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("value of i is "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("");
            }
        }

    }

    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread thread=new Thread(t);
        MyAnotherThreadClass t1=new MyAnotherThreadClass();

        thread.start();
        t1.start();
    }
}
