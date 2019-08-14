import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number=scanner.nextInt();


            int reversedNumber = 0;
            int temp = 0;
            while(number > 0){
                temp = number%10;
                reversedNumber = reversedNumber * 10 + temp;
                number = number/10;
            }
            System.out.println("Reversed Number is: " + reversedNumber);

        }
    }

