
import java.util.Scanner;

public class exp3 {
    
    
      public static void main(String[] args){
      Scanner input = new Scanner(System.in);
          System.out.println("KARE UZUNLUGU");
          int x = input.nextInt();
          for (int i = 1; i <=x; i++) {
              if (i==1 || i==x) {
                  for (int j = 1; j <=x; j++) {
                      System.out.print("*");
                      
                  }
                  
              }else{
                  System.out.print("*");
                  for (int j = 1; j <= x-2; j++) {
                      System.out.print(" ");
                  }
                  System.out.print("*");
              }
              System.out.println(" ");
              
          }

}
}
