public class multiplyMatrix {
    public static void main(String[] args) {
        int row1, col1;
        int row2, col2;
        row1 = 3;
        col1 = 2;
        row2 = 2;
        col2 = 3;
        int arr1[][] = { { 1, 2 }, { 3, 4 },{5,6} };
        int arr2[][] = { { 1,2,3},{4,5,6}};
        int result[][] = new int[row1][col2];

        if (col1 == row1 && row2 == col2 && row2 == col1) {
            for (int i = 0; i < col1; i++) {

                for (int j = 0; j < row2; j++) {
                    result[i][j] = 0;

                    for (int k = 0; k < row2; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];

                    }
                }
            }
        } 
        else if (col1 == row2) {

            for (int i = 0; i < row1; i++) {

                for (int j = 0; j < col2; j++) {
                    result[i][j] = 0;

                    for (int k = 0; k < col1; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];

                    }
                }
            }
        }

        System.out.println("Display the result matrix ");
        for (int i = 0; i < row1; i++) {
            System.out.print("|");
            for (int j = 0; j < col2; j++) {
                
                System.out.printf(" %4d ",result[i][j]);
            }
            System.out.println("|");
        }
    }

}
