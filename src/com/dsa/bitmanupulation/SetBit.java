package com.dsa.bitmanupulation;

public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int position = 1;
        int bitMask = 1 << position;
        int newNumber = n | bitMask;
        System.out.println(newNumber);
    }
}
