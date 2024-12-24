public class Pattern14 {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            for(int sp=1;sp<=n-row;sp++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
        for(int row=n-1;row>=1;row--){
            for(int sp=1;sp<=n-row;sp++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
