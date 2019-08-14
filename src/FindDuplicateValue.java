public class FindDuplicateValue {
    public static void main(String[]args){
int a[]={10,20,40,20,50,70,70};
System.out.println("The Duplicate Elements are");
for(int i=0;i<a.length;i++){
    for (int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
            System.out.println(a[j]);
        }
    }
}
    }
}
