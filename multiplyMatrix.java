// Write a program in Java to multiply two matrix


public class multiplyMatrix {
    public static void main(String[] args) {
        // Declare all varibles
        int row1, col1;
        int row2, col2;
        row1 = 3; // Assign row value is 3
        col1 = 2; // Assign column value is 2
        row2 = 2; // Assign row value is 2
        col2 = 3; // Assign column value is 3
        
        // Initailize two matrix arr1 & arr2
        int arr1[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int result[][] = new int[row1][col2];

        // If first matrix column's value is equal to second matrix's row value then matrix multiplication possible.
        if (col1 == row2) {
            for (int i = 0; i < row1; i++) {

                for (int j = 0; j < col2; j++) {
                    result[i][j] = 0; // assign zero value first.

                    for (int k = 0; k < col1; k++) {
                        // Doing here addition assignment
                        result[i][j] += arr1[i][k] * arr2[k][j];

                    }
                }
            }
            System.out.println("Display the result matrix ");
            for (int i = 0; i < row1; i++) {
                System.out.print("|");
                for (int j = 0; j < col2; j++) {

                    System.out.printf(" %4d ", result[i][j]);
                }
                System.out.println("|");
            }
        } else {
            System.out.println("Matrix multiplication of these two matrix are not possible. ");
        }

    }

}
