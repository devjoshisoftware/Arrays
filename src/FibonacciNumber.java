import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,d;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci no" );
        d=scanner.nextInt();
        System.out.println(n1+ " " +n2);
        for(i=2;i<d;++i){
            n3=n1+n2;
            System.out.println(" " + n3);
            n1=n2;
            n2=n3;

        }
    }
}
