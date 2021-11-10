package HW2;

import java.util.Scanner;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.

    public static void pythagoreanThm(double a, double b, int selection){
        double baseLength = Math.sqrt((Math.pow(b, 2))-(Math.pow(a,2)));
        double perpendicularLength = Math.sqrt((Math.pow(b, 2))-(Math.pow(a,2)));
        double hypotenuseLength = Math.sqrt((Math.pow(a, 2))+(Math.pow(b,2)));
    
        // If statement
        if (selection == 1){
            System.out.println("Base length: "+ baseLength);
        }else if (selection == 2){
            System.out.println("Perpendicular length: "+ perpendicularLength);
        }else if (selection == 3){
            System.out.println("Hypotenuse length: "+ hypotenuseLength);
        // Use of string concatenation
        }
    }
    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 

    public static void calcGrade(int intanswer){
        // If statement
        if (intanswer <= 60 && intanswer >= 0){
            System.out.println("Your grade: F");
        } else if (intanswer <= 69 && intanswer >= 60){
            System.out.println("Your grade: D");
        } else if (intanswer <= 79 && intanswer >= 70){
            System.out.println("Your grade: C");
        } else if (intanswer <= 89 && intanswer >= 80){
            System.out.println("Your grade: B");
        } else if (intanswer <= 100 && intanswer >= 90){
            System.out.println("Your grade: A");
        } else {
            System.out.println("Invalid input");
        }
    }

    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    public static void calcTip(double b, double t, int p){
        double calculateTip = t/100;
        double totalTip = b*calculateTip;
        // This is total amount of tip

        double calculateBill = totalTip+b;
        // This is the total bill

        // Casting the double tip to an int
        double tipPerPerson = totalTip/p;
        double roundup = Math.ceil(tipPerPerson);
        int intTipPerPerson = (int) roundup;

        // Casting the double bill to an int
        double billPerPerson = calculateBill/p;
        double roundup2 = Math.ceil(billPerPerson);
        int intBillPerPerson = (int) roundup2;

        // Use of string concatenation
        System.out.println("Each person will pay a tip of: "+intTipPerPerson);
        System.out.println("Total bill including tip per person: "+intBillPerPerson);
    }
    
 


    // you do not need this main if you want to make a tester class

    // Part 1:
    public static void main(String[] args){
        int selection;
        Scanner input = new Scanner(System.in);
        // Initiated Scanner

        System.out.println("Please select the side you are trying to find:");
        System.out.println("----------\n");
        System.out.println("1: Base");
        System.out.println("2: Perpendicular");
        System.out.println("3: Hypotenuse");
        System.out.println("----------\n");

        selection = input.nextInt();
        
        // Use of if statement
        if (selection == 3){
            System.out.println("Enter the value of the Base");
            double input2 = input.nextDouble();
            System.out.println("Enter the value of the Perpendicular");
            double input3 = input.nextDouble();
        pythagoreanThm(input2, input3, selection);
        // These parameters (input2, input3, selection) are ran in the method pythagoreanThm
        } else if (selection == 1){
            System.out.println("Enter the value of the Perpendicular");
            double input4 = input.nextDouble();
            System.out.println("Enter the value of the Hypotenuse");
            double input5 = input.nextDouble();
        pythagoreanThm(input4, input5, selection);
        // These parameters (input4, input5, selection) are ran in the method pythagoreanThm
        } else if (selection == 2){
            System.out.println("Enter the value of the Base");
            double input6 = input.nextDouble();
            System.out.println("Enter the value of the Hypotenuse");
            double input7 = input.nextDouble();
        pythagoreanThm(input6, input7, selection);
        // These parameters (input6, input7, selection) are ran in the method pythagoreanThm
        }

        // Part 2:
            Scanner keyboard = new Scanner(System.in);
            // Initiated Scanner
            System.out.println("Enter your numerical grade for the class");
            double answer = keyboard.nextDouble();
            // Casting the double answer to an int
            double roundup = Math.ceil(answer);
            int intanswer = (int) roundup;
            System.out.println(intanswer);
        calcGrade(intanswer);
        // The parameter (intanswer) is ran in the calcGrade method
        

        // Part 3:
            Scanner keyboard2 = new Scanner(System.in);
            // Initiated Scanner
            System.out.println("Enter the total of the bill before tip");
            double bill = keyboard.nextDouble();
            System.out.println("Enter the percent you would like to tip as a whole number");
            double tip = keyboard.nextInt();
            System.out.println("Enter the amount of people splitting the bill");
            int people = keyboard.nextInt();
            calcTip(bill, tip, people);
            // The parameters (bill, tip, people) are ran in the method calcTip
    } 
}
