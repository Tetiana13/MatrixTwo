package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Numnum.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please, tap some number of integers in row. ");
        Scanner sc = new Scanner(System.in);
        try {
            if (sc.hasNext()) {
                String[] nums = sc.nextLine().split("\\s+");
                ArrayList<Integer> argum = new ArrayList<Integer>();
                for(int i=0;i<nums.length;i++) {
                    argum.add(Integer.parseInt(nums[i]));
                }

                printShorter(argum);
                printLonger(argum);
                sortDesc(argum);
                sortAsc(argum);
                lessLength(argum);
                muchLength(argum);
                minDifDigit(argum);
                evenEvenOdd(argum);
                arifmProgr(argum);
                difDigit(argum);
                printMatrix(nums.length);
            }
        } catch (NumberFormatException ex) {
            System.out.println("You tap wrong arguments!");
            return;
        }
    }

}
