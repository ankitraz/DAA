/**
 * strassen_matrix
 */
public class strassen_matrix {

    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4}};
        int [][] arr2 = {{1,2},{3,4}};

        int p =( arr1[0][0] + arr1[1][1]) * (arr2[0][0] + arr2[1][1]);
        int q =( arr1[1][0] + arr1[1][1]) * (arr2[0][0]);
        int r =( arr1[0][0]) * (arr2[0][1] - arr2[1][1]);
        int s =(arr1[1][1]) * (arr2[1][0] + arr2[0][0]);
        int t =( arr1[0][0] + arr1[0][1]) * (arr2[1][1]);
        int u =( arr1[1][0] - arr1[0][0]) * (arr2[0][0] + arr2[0][1]);
        int v =( arr1[0][1] - arr1[1][1]) * (arr2[1][0] + arr2[1][1]);

        int c00 = p+s-t+v;
        int c01 = r + t;
        int c10 = q + s;
        int c11 = p+r-q+u;
    
System.out.println("-----------------------------");
        int arr[][] = {{c00,c01},{c10,c11}};
        for ( int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
System.out.println("-------------------------------");
    }
}