package com.mycompany.arrayexploration1;

import java.util.Scanner;

public class AABBCC2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();
        int i = 0;
        int count = 1;
        int max=0;
        int text=0;
        while (true) {
            if (i == length) {
                break;
            }
            int value = (int) str.charAt(i);
            if (i + 1 < length) {
                int value2 = (int) str.charAt(i + 1);
                if (value == value2-1 || value== value2) {
                    count++;
                    if(count>=max){
                        if(count>max){
                            text=i+2;
                        }
                        max = count;
                    }
                }
                else {
                    count=1;
                }
            }
            i++;
        }
        System.out.print(max);
        System.out.println();
        for(int j=text-max; j<text; j++){
            System.out.print(str.charAt(j));
        }
    }
}
