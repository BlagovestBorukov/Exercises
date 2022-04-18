package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int b, s, d, ch;
    	b = scanner.nextInt();
    	s = scanner.nextInt();
    	d = scanner.nextInt();
    	
    	ch = (b/s)/d;
    	System.out.print("ch= " + ch);
    	
    	scanner.close();
    }
}
