import java.util.ArrayList;

public class DemoStack {
    public static class stackb{
        static ArrayList<Integer> st=new ArrayList<>();
        public static boolean isEmpty(){
            if(st.isEmpty()){
                return true;
            }
            return false;
        }
        public static void push(int n){
            st.add(n);
        }
        public static int pop(){
            if(st.isEmpty()){
                return -1;
            }
            int top=st.get(st.size()-1);
            st.remove(st.size()-1);
            return top;
        }
        public  static int peek(){
            if(st.isEmpty()){
                return -1;
            }
            return st.get(st.size()-1);
        }
    }

    public static void main(String[] args) {
        stackb.push(1);
        stackb.push(2);
        stackb.push(3);
        while(!stackb.isEmpty()){
            System.out.print(stackb.peek()+" ");
            stackb.pop();
        }

    }
}
