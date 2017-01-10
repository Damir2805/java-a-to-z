package dkalymbaev.matrix;

/**
 * Created by User on 09.01.2017.
 */
public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int h = 5;
        matrix.printMatrix(h);
    }

    private void printMatrix(int h) {
        String s = "^";
        int w = h * 2 - 1;
        for(int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
    }
}