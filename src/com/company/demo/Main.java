package com.company.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be converted to int");
        String num = scanner.nextLine();
        stringToInt(num);
    }

    public static void stringToInt(String number)
    {
        int result = 0;
        int i =0;
        boolean isNegative = false;

        if(number.charAt(i)=='-')
        {
            i=1;
            isNegative = true;
        }

        while (i<number.length())
        {
            if(number.charAt(i)!='-')
            {
                if(number.charAt(i)=='.')
                {
                    if((number.charAt(i+1) -'0')>=5)
                    {
                        result = result+1;
                    }
                    break;
                }
                else
                {
                    result = (result*10) + number.charAt(i) -'0';
                }
            }

            i++;
        }

        if (isNegative)
        {
            result = -result;
        }

        System.out.println(result);
    }
}
