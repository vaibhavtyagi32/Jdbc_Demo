public class Pattern8 {
    public static void main(String[] args) {
        int h=1;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(h);
                h++;
            }
            System.out.println();
        }
    }
}
