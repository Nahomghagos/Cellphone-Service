package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {

        Cellphone phone= new Cellphone();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("what is your serial number? ");
        phone.setSerialnumber(myScanner.nextInt());
        myScanner.nextLine();

        System.out.println("what is your model?");
        phone.setModel(myScanner.nextLine());

        System.out.println("what is your phone number?");
        phone.setPhoneNumber(myScanner.nextLine());

        System.out.println("write your carrer");
         phone.setCarrier(myScanner.nextLine()) ;

        System.out.println("who is the owner?");
        phone.setOwner(myScanner.nextLine());

        System.out.println(phone.getSerialnumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getOwner());




    }
}
