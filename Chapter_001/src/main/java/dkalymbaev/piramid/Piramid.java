package dkalymbaev.piramid;

/**
 * Created by User on 11.01.2017.
 */
public class Piramid {
    public static void main(String[] args) {
        Piramid piramid = new Piramid();
        int h = 5;
        piramid.paintPiramid(h);
    }

    private void paintPiramid(int h) {
        String s = "^";
        int w = h * 2 - 1;
        for(int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if((j > h - i) && (j < i + h)) {
                    System.out.print(s);
                }else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
