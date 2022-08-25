package Exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        examEx(scanner.nextInt());
    }
    public static String examEx(int b ) {
        if (b % 4 == 0) {
            return"Leap year";
        } else {
            return "Not leap year";
        }
    }
}
