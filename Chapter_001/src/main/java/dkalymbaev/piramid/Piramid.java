package dkalymbaev.piramid;

/**
 * Created by User on 11.01.2017.
 */
public class Piramid {
    public static void main(Object o) {
        Piramid piramid = new Piramid();
        int h = 3;
        piramid.paintPiramid(h);
    }

    String paintPiramid(int h) {
        String s = "^";
        for(int i = 1; i <= h; i++) {
            for (int j = 1; j <= h * 2 - 1; j++) {
                if((j > h - i) && (j < i + h)) {
                    System.out.print(s);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return s;
    }
}