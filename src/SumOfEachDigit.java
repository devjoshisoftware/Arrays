import java.util.Scanner;

public class SumOfEachDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter five Digit no");
    int n=scanner.nextInt();
    int sum=0;
    while (n>0) {
        int add = n % 10;
        sum = sum + add;
        n = n / 10;
    }
        System.out.println("Total inputed no " +sum);
    }
    }

