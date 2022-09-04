package soal5;
import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String kata1, kata2, status;
//        int jumlah_kata1,jumlah_kata2,jumlah;
//        
//        System.out.println("Program menghitung apakah banyak huruf ke-1 lebih banyak dari huruf ke-2");
//        System.out.print("Masukkan ke - 1 : ");
//        kata1 = obj.nextLine();
//        System.out.print("Masukkan ke - 1 : ");
//        kata2 = obj.nextLine();
//        
//        jumlah_kata1 = kata1.length();
//        jumlah_kata2 = kata2.length();
//        
//        jumlah = jumlah_kata1 + jumlah_kata2;
//        System.out.println(jumlah);
//        if(kata1.compareTo(kata2) == -1)
//            status = "Yes";
//        else if(kata1.compareTo(kata2) == 0)
//            status = "Jumlah hurufnya sama";
//        else
//            status = "No";
//        
//        System.out.println(status);
//        System.out.println(kata1.substring(0, 1).toUpperCase() + kata1.substring(1) + " " + kata2.substring(0, 1).toUpperCase() + kata2.substring(1)); 

        kata1 = obj.nextLine();
        kata2 = obj.nextLine();
        
        System.out.println(kata1.length() + kata2.length());
        System.out.println((kata1.compareTo(kata2) == 0) ? "Jumlahnya sama" : (kata1.compareTo(kata2) == 1) ? "Yes" : "No");
        System.out.println(kata1.substring(0, 1).toUpperCase() + kata1.substring(1) + " " + kata2.substring(0, 1).toUpperCase() + kata2.substring(1));
          
    }
}

/*
    20 menit
    https://www.w3schools.com/java/java_conditions_shorthand.asp
    https://www.javatpoint.com/string-comparison-in-java
    https://stackoverflow.com/questions/11464890/first-char-to-upper-case#:~:text=What%20you%20want%20to%20do%20is%20convert%20the,%28userIdea.charAt%20%280%29%29%3B%20betterIdea%20%3D%20first%20%2B%20userIdea.substring%20%281%29%3B
*/
