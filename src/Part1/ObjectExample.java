package Part1;
import TurtleGraphics.*;
import BreezySwing.*;

public class ObjectExample {

    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        
        /* multiline comment
        Objects are created from a CLASS
        p1 is an INSTANCE (Object)of the Pen Class
        Instantiating an onject = making an object
        */
        
        p1.move(25);
        p1.move(-30,50);;
        
        /*
        p1. -> brings up a list of methods (abilities) that p1 has
        Some methods are dound directly in the Pen
        Others are INHERITIED from the "Class of all Classes" -> Object Class
        examples -> toString; hashCode, compareTo,
        */
        
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);
        
        /*
        It is common to have more than 1 way to make an object
        Can make a pen with a custom window or default window
        */
        
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        
        /*
        Even though wp and rp are different TYPES of  pens
        They respond to the same commands as p1
        Since all 3 pens have the "Pen" class as their Parent
        Pen is where most of these methods are defined 
        and the 3 actual pens inherit these methods
        */
        
    }
    
}
