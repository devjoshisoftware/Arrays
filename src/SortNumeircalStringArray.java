import java.util.Arrays;

public class SortNumeircalStringArray {
    public static void main(String[] args) {
        int a[]={7,98,34,67,107,47,34};
        System.out.println("original order for numbers" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting the numbers" + Arrays.toString(a));

        System.out.println();

        String c[]={"Bombay","Calcutta","Ahmedabad","Surat","Delhi","Nagpur"};
        System.out.println("original order for Cities" + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("after sorting the Cities" + Arrays.toString(c));



    }
}
