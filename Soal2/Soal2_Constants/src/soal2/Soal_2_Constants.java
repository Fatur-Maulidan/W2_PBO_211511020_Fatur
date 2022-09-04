package soal2;
public class Soal_2_Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth
                * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/*
     Hasil program yang Soal_2 hasilnya sama yaitu 21.59 untuk width 27.94 untuk height
 */

/*
     - Kalau yang soal_2_constant variabel hanya bisa dikenali pada procedure main
     - Tetapi kalau soal_2_constant2 bisa dikenali secara global/ bisa digunakan pada fungsi/procedure lain
*/
