package medium;

import java.util.Arrays;

public class RotateImage48 {

    public static void main(String[] args) {
        int [] [] matrix ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void rotate(int[][] matrix) {
        int l=0;
        int r=matrix.length-1;
        while(l<r){
            for(int i=0;i<r-l;i++){
                int top = l;
                int bottom = r;
                int temp = matrix[top][l+i];
                matrix[top][l+i] = matrix[bottom-i][l];
                matrix[bottom-i][l] = matrix[bottom][r-i];
                matrix[bottom][r-i] = matrix[top+i][r];
                matrix[top+i][r] = temp;
            }
            ++l;
            --r;
        }
    }

}
