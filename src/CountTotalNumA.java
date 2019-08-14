import java.util.Scanner;

public class CountTotalNumA {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the String");
        String Str=scanner.nextLine();
        char c='a';
        char c1='A';
        System.out.println("The Total a in this string is");
        int a=0;
        for(int i=0;i<Str.length();i++){
            if((c==Str.charAt(i)) || (c1==Str.charAt(i))){
                a++;
            }
        }
        System.out.println(a);
    }
}
