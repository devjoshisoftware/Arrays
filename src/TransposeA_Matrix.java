public class TransposeA_Matrix {
    public static void main(String args[]) {



        int arr[][] = {{1, 2, 3,4}, {2, 4, 5,4}, {4, 4, 5,4},{5,6,8,2}};
        System.out.println("Original Matrix");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int trans[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                trans[i][j]=arr[j][i];
            }
        }

        System.out.println("Transpose Matrix");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                System.out.print(trans[i][j] + " ");
            }
                System.out.println();
            }
        }



    }





