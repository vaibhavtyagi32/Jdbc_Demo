package Thread;

public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Program started....");
        int sum=90+98;
        System.out.println("sum is "+sum);
        Thread t=Thread.currentThread();
        //getname
        String tName=t.getName();
        System.out.println("current running thread is "+tName);
        //setname
        t.setName("MyThread");
        System.out.println("new name of thread is "+t.getName());
        System.out.println("Program ended.....");
    }
}
