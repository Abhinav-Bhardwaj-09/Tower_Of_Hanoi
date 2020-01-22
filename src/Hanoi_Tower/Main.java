package Hanoi_Tower;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   22-01-2020 ,  Time :-    19 : 14
 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks  :  ");
        int n = sc.nextInt();
        System.out.print(" Enter the source stack's name  :  ");
        char s = sc.next().charAt(0);
        System.out.print("  Enter the destination stack's name  :  ");
        char d = sc.next().charAt(0);
        System.out.print("   Enter   the   immediate  stacks's  name  :  ");
        char a = sc.next().charAt(0);
        System.out.println();
        Tower obj = new Tower();
        int steps = obj.method(n, s, a, d);
        System.out.println();
        System.out.println("Steps required to navigate all the disks  :  " + steps );
    }
}