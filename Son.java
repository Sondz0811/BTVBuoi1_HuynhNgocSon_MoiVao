/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package son;

import java.util.Scanner;

/**
 *
 * @author sonhuynh081104
 */
public class Son {

    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ban can nhap a:");
//        int a = Integer.parseInt(sc.nextLine());
//
//        System.out.println("ten cua ban la:");
//        String name = sc.nextLine();
//                System.out.println("ten cua ban la:"+ name);
//        System.out.println("so ban vua nhap la:"+ a);
//    }
//    
    static Boolean checkprime (int a){
        if(a<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0){
                return true;
            }
        }
        return false;
    }
    static Boolean sole (int b){
        if (b%2==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        if(checkprime(a)== true)
            System.out.println("is a prime:"+ a);
        else 
            System.out.println("is not a prime:"+ a);
        if(sole(b)==true)
            System.out.println("is a ollnum :"+ b);
        else
            System.out.println("is not a ollnum:"+ b);
    }
}
