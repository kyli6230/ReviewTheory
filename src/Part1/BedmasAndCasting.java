
package Part1;

public class BedmasAndCasting {

    public static void main(String[] args) {
        int x = 22;
        int y = x*2; //44
        double z = (double)y/7; //must cast y to double
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        System.out.println("z is: " + z);
        
        //mod -> % = remainder of a calculation
        //44 / 7, remainder = 2
        int leftover = 44 % 7;
        System.out.format("I have %d candy left over\n", leftover);
        
        //BEDMAS
        System.out.println("\n\nBEDMAS\n======");
        int e, f,g;
        e=f=g=5; //assign all to the same thing at once
        int ans;
        ans = e + f * g; //30
        System.out.println("answer should be 30 -> " + ans);
        
        ans = (e + f) * g; //50
        System.out.println("answer should be 50 -> " + ans);
        
        ans = e + f % g; //5 + 5 % 5 -> 5 + 0 = 5
        System.out.println("answer should be 5 -> " + ans);
        
        ans = (e + f) % g; //0
        System.out.println("answer should be 30 -> " + ans);
    }
    
}
