package Part2;

public class LoopReview {

    public static void main(String[] args) {
        //for loop example
        for (int i = 0; i < 10; i++) {
            System.out.format("i is now %d\n", i);
        }
        for (double temp = 20; temp >= 10; temp -= 0.5) {
            System.out.print("Temperature is " + temp);
            String weather = temp >= 15 ? "WARM" : "COLD";
            System.out.println("\t\tThe weathre is " + weather);
        }
        /*
        while loop: keep repeating until condition is met
        3 ways
        */
        
        //1 do-while loop | exit condition is at the botom
        int rnum;
        int tries = 0;
        System.out.println("GAME 1\n==========\n");
        do{
            rnum = (int)(Math.random() * 20 + 1);
            tries++;
            System.out.format("Try %d -> Number picked %d\n", tries, rnum);
        }while(rnum != 7);
        
        
        //while loop | exit condition is at the top
        rnum = 0;
        tries=0;
        System.out.println("GAME 2\n==========\n");
        while(rnum !=7){
            rnum = (int)(Math.random() * 20 + 1);
            tries++;
            System.out.format("Try %d -> Number picked %d\n", tries, rnum);
        }
        
        //while true | exit condition is in the middle with an if statement
        rnum = 0;
        tries=0;
        System.out.println("GAME 3\n==========\n");
        while(true){
            rnum = (int)(Math.random() * 20 + 1);
            tries++;
            if(rnum==7) break;
            System.out.format("Try %d -> Number picked %d\n", tries, rnum);
            
        }
        System.out.println("Game Over you got it in " + tries + " tries.");
    }
    
}
