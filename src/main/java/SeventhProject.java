public class SeventhProject {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int sum=0;

        for (int i=2; i<12;i++ ){
            sum=a+b;
            System.out.println(" "+ sum);
            a=b;
            b=sum;
        }
    }
}
