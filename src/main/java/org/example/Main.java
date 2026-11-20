package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int testgrade(int mark){
        if(mark>=50){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade mark: ");
        int mark = sc.nextInt();
        int result = testgrade(mark);
        if(result == 1){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}