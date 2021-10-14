import java.util.Scanner;
public class JavaBasic2 {
    //Nilai A B C D E
    // 0-25 = E
    // 26-50 = D
    // 51-75 = C
    // 76-90 = B
    // 91-100 = A

    
    public static void main(String[] args){
        int nilai;

        Scanner score = new Scanner(System.in);

        System.out.print("masukkan skor anda:");
        nilai = score.nextInt();

        if(nilai>=100) {
            System.out.println("Nilai salah");
        } else if(nilai>=91) {
            System.out.println("Nilai anda; A");
        }else if(nilai>=76) {
            System.out.println("Nilai anda; B");    
        }else if(nilai>=51) {
            System.out.println("Nilai anda; C");  
        }else if(nilai>=26) {
            System.out.println("Nilai anda; D");    
        }else if(nilai>=0) {
            System.out.println("Nilai anda; E");
        }
        System.out.println("Selesai"); 
        

    }

}
        
