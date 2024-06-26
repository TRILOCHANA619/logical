package com.dsa.bitmanupulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int updateTo = scn.nextInt();
        int n = 5;
        int position = 1;
        int bitMask = 1 << position;
        if (updateTo == 1) {
            System.out.println(n | bitMask);
        } else {
            int newBitMask = ~bitMask;
            System.out.println(newBitMask & n);
        }
    }
}
