package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner arrayInputs = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        String s = "123";
        convert(s);

        int n1 =0;
        int n2 =1;
        int n3 ;

        for (int i=1; i<10; i++){
            System.out.print(n1 + ","  );
            n3= n1+n2;
            n1=n2;
            n2=n3;
        }

        int [] myIntegers = getIntegers(5);
        System.out.println("The average is" + getAverage(myIntegers));
    }

    public static void convert(String s){

        int num = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            num= num *10 + ((int)s.charAt(i)-'0'/*48*/);
            System.out.println(num);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter the array of" + number+ " numbers you want to add");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++){
           values[i]= arrayInputs.nextInt();
        }
        return  values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double)sum / (double)array.length;
    }
}
