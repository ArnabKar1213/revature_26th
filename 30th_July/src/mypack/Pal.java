package mypack;

import java.util.*;

import java.lang.*;

import java.io.*;

import java.lang.Math;



public class Pal {

    public static char lovePalindromes(String str) {

        //this is default OUTPUT. You can change it.

        String result = "-404";

       // String r,r1;

       // StringBuilder sb= new StringBuilder(str);

        StringBuilder sb1= new StringBuilder();

        StringBuilder sb2= new StringBuilder();

        //write your Logic here:

       sb1.append(str.charAt(str.length()-1)).append(str);

        sb2=sb1.reverse();

        sb2.toString();

        sb1.toString();

        //r=sb1.toString();

        //r1="sb1.charAt(0)";

        

        if(sb1.equals(sb2))

        

            return sb2.charAt(0);

        else

            return 'Z';

        

    }

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        //INPUT [uncomment & modify if required]   

        String str = sc.next();

        

        //OUTPUT [uncomment & modify if required]

        System.out.println(lovePalindromes(str));

    }

}
