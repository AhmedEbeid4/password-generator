package com.mycompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getLength();
    }
    private static void getLength(){
        Scanner in = new Scanner(System.in);
        boolean ok=false;
        int length=-1;
        try {
            System.out.print("Enter the length that you want : " );
            length =in.nextInt();
            ok=true;
        }catch (Exception e){
            System.out.println("Invalid input");
        }
        if (ok){
            printGeneratedPass(length);
        }
        boolean r=false;
        do {

            System.out.println("Do you want to generate another? (y/n)");
            String qu=in.next().toLowerCase();
            if (qu.equals("y") || qu.equals("yes")){
                getLength();
            }else if (qu.equals("n") || qu.equals("no")){
                System.out.println("Ok ,Thank You");
                r=false;
            }else {
                System.out.println("Enter yes or no , Please");
                r=true;
            }
        }while (r);
    }
    private static void printGeneratedPass(int length){
        Password pass= new Password(length);
        System.out.println("The password : "+pass.getPassword());
    }
}
