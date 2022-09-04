package soal4;
public class Soal4 {
    static short methodOne(long l) { // long l = 10
        int i = (int) l; //int l = 10
        return (short) i; // i = 10
    }
    
    public static void main(String[] args) {
        double d = 10.25;  //10.25
        
        /*
            byte a = (byte) 10.25; //byte,int,long
            System.out.println(a);
        */
        
        float f = (float) d; //10.25
        byte b = (byte) methodOne((long)f); //(long) f artinya f = 10
                                            // Karena long byte dan int tidak bisa
                                            // menginisiasi nilai desimal      
        System.out.println(b);
    }
    
    
    /*
    
        1. Outputnya bernilai 10
        2. pada saat pemanggilan methodOne ada sebuah cast
           terhadap f sehingga pada saat memberikan nilai
           pada parameter di methodOne hasilnya sudah bukan
           desimal.
           dan byte tidak menerima nilai desimal sehingga
           pada b tidak ada nilai desimal
           
        10 menit
    */
}
