package Part1;

public class VariablesReview {

    public static void main(String[] args) {
        //primitive data types (8 types)
        int a = 1234567890; //4 byte
        long d = 1234567890123456789L; //8 byte
        short c = 12345; //2 byte
        byte b = 127; //1 byte
        //primitive never capitalized
        
        //decimal
        double dbl = 45.78; //8
        float flt = 45.75F; //4
        
        //2 other
        char chr = 'x';
        boolean bool = true; //or false
        
        //strings -> NOT primitive
        String s = "I went to school today";
        //          0123456789
        //Sring is capital (like all objects)
        //"s" has abilities (a.k.a methods)
        
        int len = s.length();
        char lett = s.charAt(7);
        String str1 = s.substring(3,8);
        String str2 = s.substring(4);
        //note on all methods
        //1 - all methods have a return type (send back something), except void methods
        //2 - methods may or may NOT require paramters - data sent in
        //3 - some methods have more than one version
        
        System.out.println("Length of \"s\" is: " +len);
        System.out.println("7th character is " + lett);
        System.out.println("Location 3 to 8: " + str1);
        System.out.println("Location 4 to end: " + str2);
        
        //escape codes: \"  \\      \t(tab)     \n(newline)
        System.out.println("First\t\tLast\t\tEmail Adress");
        System.out.println("C:\\Documents\\Users");
        System.out.println("He went \n\nto the store");
        
    }
    
}
