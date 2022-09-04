package soal1;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        double input_angka;
        
        System.out.print("Input 1 angka : ");
        input_angka = obj.nextDouble();
        
        if((input_angka <= Short.MAX_VALUE && input_angka >= Short.MIN_VALUE) || (input_angka <= Integer.MAX_VALUE && input_angka >= Integer.MIN_VALUE) || (input_angka <= Long.MAX_VALUE && input_angka >= Long.MIN_VALUE)) {
            System.out.println(input_angka + " can be fitted in : ");
        
            if(input_angka <= Short.MAX_VALUE && input_angka >= Short.MIN_VALUE)
                System.out.println("Short");

            if(input_angka <= Integer.MAX_VALUE && input_angka >= Integer.MIN_VALUE)
                System.out.println("Int");

            if(input_angka <= Long.MAX_VALUE && input_angka >= Long.MIN_VALUE)
                System.out.println("Long");
        }
        else
            System.out.println(input_angka + " can't be fitted anywhere");
    }
    
}