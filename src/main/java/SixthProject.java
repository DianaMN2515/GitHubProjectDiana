import java.util.Scanner;

public class SixthProject {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            boolean isprime=true;
            System.out.println("Enter the number");
            int primeNumber=sc.nextInt();

            for (int i=0; i<primeNumber; i++){
                if (primeNumber%2==0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(primeNumber + " is prime number.");
            } else {
                System.out.println(primeNumber + " is composite number.");
            }
        }
    }

