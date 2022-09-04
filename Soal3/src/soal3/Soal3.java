package soal3;
public class Soal3 {
    public static void main(String[] args) {
        double x = 92.5;
        double nx = Math.round(x);
        
        System.out.println(nx);
    }
}

/*
        Math.round adalah sebuah fungsi yang digunakan untuk memberikan
        nilai bulatan ke atas sehingga yang awalnya bilangan desimal menjadi
        bilangan bulat
        Hasilnya adalah 93
*/

/*
        Jika misalkan tidak menggunakan int maka hasilnya akan berupa desimal yaitu 93.0
        oleh karena itu, diperlukan sebuah cast int supaya hasilnya bisa serupa dengan int yaitu bilangan bulat 93
*/
