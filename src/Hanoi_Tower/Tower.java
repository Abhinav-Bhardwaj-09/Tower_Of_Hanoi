package Hanoi_Tower;

/*
        Created by Abhinav Bhardwaj on IntelliJ IDEA
                on   22-01-2020 ,  Time :-    19 : 12
 */

public class Tower {
    static int steps = 0;
    public int method(int n, char s, char a,char d){
        steps = steps+1;
        if (n == 1){
            System.out.println("Source : "+ s + "   Destination  :  "+ d);
        }
        else{
            method(n-1,s,d,a);
            System.out.println("Source : "+ s + "   Destination  :  "+ d);
            method(n-1,a,s,d);
        }
        return steps;
    }
}