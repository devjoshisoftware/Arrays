public class CommonElements {
    public static void main(String[]args){
        String arr1[]={"London","Delhi","Surat","Bombay","Goa"};
        String arr2[]={"Goa","Daman","Anand","Surat","Diu"};
        System.out.println("Common String Elements are");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }

    }

}
