package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
	    String pattern = "[a-zA-Z1-9][\\d\\w\\.]{0,}[a-zA-Z-1-9]@[a-z][\\w\\.]+\\.[a-z]{2,3}";
        Arrays.stream(input.split("\\s+")).filter(i -> i.matches(pattern)).forEach(i -> System.out.println(i));

    }
}
