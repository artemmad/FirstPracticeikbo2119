package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner= new Scanner(System.in);

     //System.out.print("Hello world");

     // примитивные типы
     int a = 1;
     float b = 2.2f;
     char c = 'c';
     boolean d = false; // 1 байт  = 8 бит

     // ссылочные/объектьный тип
     String string = scanner.nextLine();
     int[] array = new int[10];
     String[] stringarray = string.split(" ");


     for(int i=0; i<stringarray.length; i++)
     {
     System.out.println(stringarray[i]);
     }

     for(String v : stringarray){
         System.out.println(v);
     }

     System.out.println();





    }


    }


