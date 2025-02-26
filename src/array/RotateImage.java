package array;
/*
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 *  - Input:        matrix = [[1,2,3],[4,5,6],[7,8,9]]
 *  - Output:                [[7,4,1],[8,5,2],[9,6,3]]
 * Example 2:
 *  - Input:        matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 *  - Output:                [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 *
 * Topics: [Array, Math, Matrix]
 */
class RotateImage {

    public void rotate(int[][] matrix) {

        if (matrix == null || matrix[0].length == 1) {
            return;
        }

        int len = matrix[0].length;

        // Transpose Op (Max Swap: n * (n-1) / 2)
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse rows
        for (int i = 0; i < len; i++) {
            reverse(matrix[i]);
        }
    }

    public void reverse(int[] arr) {
        for (int i = 0, len = arr.length; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }

}
