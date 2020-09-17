package Part1;

import java.util.Scanner;

public class ErrorTypes {

    public static void main(String[] args) {
        /*
        # Types of Erros: Syntax, Runtime, Logix
        */
        //syntax: -> type error, program won't run
        //int x = 45
        
        //runtime -> program starts but crashes or throws error
        //can be avoided by using try catch
        
        Scanner s = new Scanner(System.in);
        int candy = 100;
        int howmany, eachgets;
        System.out.println("How many people are you giving candy to? > ");
        howmany = s.nextInt();
        try{
            eachgets = candy / howmany;
        }catch(Exception e) {
            System.out.println("You are too greedy - you lost all candies");
            return; //stop here
        }
        System.out.println("Each person gets " + eachgets);
        
        //logic error -> program runs, never crashes but does now do what it should
        //hardest type to detect because compiler never complains
        
        System.out.println("Enter wage / hr > ");
        double wage = s.nextDouble();
        System.out.println("Enter hours worked > ");
        double hours = s.nextDouble();
        double pay = wage + hours; //error, should be wage * hours
        System.out.println("Your pay is $" + pay);
    }
}
