import java.util.Scanner;

public class MultiplicationTableOfGivenInteger {
    public static void main(String[] args) {
        int i,j,t=20;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Value");
        i=scanner.nextInt();
        System.out.println("Enter the second Value");
        j=scanner.nextInt();
        do{
            System.out.println((i+"*"+ j + "=" + (i*j)));
     i++;
        }
        while (i<=t);
    }
}
