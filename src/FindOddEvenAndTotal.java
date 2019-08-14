import java.util.Scanner;

public class FindOddEvenAndTotal {
    public static void main(String[] args) {
        int n , i , sumEven = 0, sumOdd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of Elements in an Array");
        n = scanner.nextInt();
        int[]a=new int [n];
        System.out.println("Enter" + n + "Elements of array");
        for(i=0;i<n;i++)
        {
            if(a[i]%2 == 0){
                sumEven = sumEven + a[i];
            }
            a[i]=scanner.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2 == 0)
            {
            sumEven=sumEven + a[i];
            }
            else{
                sumOdd=sumOdd + a[i];
            }
        }
        System.out.println("Total of Even no : " + sumEven);
        System.out.println("Total of Odd no : " +sumOdd);
    }

}
