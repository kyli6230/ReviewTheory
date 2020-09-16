package Part2;

import java.util.Scanner;

public class IfReview {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        
        if(num > 7){
            System.out.println("Too high");
            num--;
        }
        else if (num < 7){
            System.out.println("Too low");
            num++;
        }
        else
            System.out.println("7 is just right");
        System.out.println("The number is set to " + num);
        System.out.println("Enter another number");
        int num2 = s.nextInt();
        int max; 

        //which one is higher? 3 ways:
        //1
        max = Math.max(num, num2);
        System.out.println("The higher number is: " + max);
        
        //2
        if (num>num2) max = num;
        else max = num2;
        System.out.println("The higher number is: " + max);
        
        //3
        max = num>num2 ? num : num2;
        //  = ask question? pick this if true : pick this if false
        System.out.println("The higher number is: " + max);
        
        
    }
    
}
