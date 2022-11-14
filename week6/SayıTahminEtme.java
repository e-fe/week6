
import java.util.Scanner;
import java.util.Random;

public class SayıTahminEtme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random inputt = new Random();
        int rs = inputt.nextInt(99)+1;
        System.out.println("10 HAKKIN VAR \n BİR İLE YÜZ ARASINDA SAYI GİR ");
        int x ;
        int hak = 0;
        while (true) {
            if (hak == 100) {
                System.out.println("HAKKINIZ BİTTİ \n sayı : " + rs);
                break;
            } else {
                x = input.nextInt();
                if (rs == x) {
                    System.out.println("SAYIYI BİLDİNİZ");
                    break;
                } else {
                    System.out.println("TEKRAR DENE");
                    hak++;

                }
            }
            if (rs < x) {
                System.out.println("SAYINIZ BÜYÜK");

            } else {
                System.out.println("SAYINIZ KÜÇÜK");
            }

        }

    }
}
/*if (x<rs){
              System.out.println("SAYI DAHA BÜYÜK");
              break;
          }else if (x>rs){
              System.out.println("SAYI DAHA KÜÇÜK");
              break;
          }else if (x==rs){
              System.out.println("BİLDİNİZ");
              break;
          }*/
