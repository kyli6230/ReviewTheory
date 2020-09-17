package SampleProgram;

import java.util.Scanner;

public class CellPhoneBill {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String phone;
        double daymins, nmins;
        double standard, totalbill, daybill, nightbill;
        while (true) {
            System.out.println("Enter 'a' for Android or 'i' for Apple/IOS: ");
            phone = s.next().toLowerCase();
            if (phone.equals("a") || phone.equals("i")) {
                break;
            }
            System.out.println("Error, must be either a or i");
        }
        System.out.println("--------------");
        while (true) {
            System.out.println("Enter number of day time minutes: ");
            daymins = s.nextDouble();
            System.out.println("Enter number of night time minutes: ");
            nmins = s.nextDouble();
            if (daymins >= 1 && nmins >= 1) {
                break;
            }
            System.out.println("Error, both numbers must be positive");
            System.out.println("--------------");
        }
        System.out.println("--------------");
        if (phone.equals("a")) {
            standard = 15;
        } else {
            standard = 20;
        }

        daybill = daymins * 0.10;
        nightbill = nmins * 0.05;
        totalbill = daybill + nightbill + standard;
        System.out.format("Your total bill is $%.2f\n", totalbill);

    }

}
