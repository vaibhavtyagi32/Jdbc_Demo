package Thread;

public class MyAnotherThreadClass extends  Thread{
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println("value of another thread = "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println();
            }
        }
    }
}
