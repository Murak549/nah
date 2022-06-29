package com.waterk;

public class Main {
    public static void main(String[] args) {
        double a = 32.43;
        double b = 34.3;
        if(a+b!=b+a) {
            System.out.println("제작 및 공개 ≠ 공개 및 제작");
        } else if(a+b==b+a) {
            System.out.println("제작 및 공개 = 공개 및 제작");
        }
    }
}
