//created by 21343034_Rani Nabilla Putri

import java.util.Scanner;

public class UTS2 {
    public static void main(String[] args){
        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris : ");
        int jlh = in.nextInt();

        for (x = jlh; x >= 1; x--) {
            for (y = jlh; y > x; y--) {
                System.out.print(" ");
            }
            for (z = 1; z < (2 * x); z++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (x = 1; x <= jlh; x++) {
            for (y = jlh; y > x; y--) {
                System.out.print(" ");
            }
            for (z = 1; z < (2 * x); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}