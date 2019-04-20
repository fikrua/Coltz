package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        boolean contu=false;
        while(!contu){ // first while loop checks if the want contnue
            System.out.println("enter a number ");
            num=scan.nextInt();
            System.out.print(num+" ");
            while(num!=1){
                if (num%2==0)
                    num=num/2;
                else
                    num =3*num+1;
                System.out.print(num+" ");

            }
            System.out.println("");
            System.out.println("do you want contnue y/n");
            String yes = scan.next();
            if(yes=="y")
                contu=true;
            else
                contu =false;

        }

	// write your code here
    }
}
