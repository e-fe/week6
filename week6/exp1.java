/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class exp1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("KAÇ YILDIZLA BAŞLASIN");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = x; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
