package HW3;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        // created a counter variable
        int counter = 0;
        // created a for loop
        // i starts at 0 (the first index) and goes to the end of the string in increments of 1
        for(int i = 0; i<str.length(); i++)
        {
            // checks every index of the string to see if it contains an e
            if(str.charAt(i) == 'e')
            {
                counter ++;
            }
        } 
        // if there are between 1 and 3 e characters, then it will return true
        if(counter>0 && counter<=3){
            return true;
        } else{
            return false;
        }     
    }
      
    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        // created a variable called result
        String result = "";
        // created a for loop that starts at i = 0, and runs if the index is less than int n, and runs in increments of 1
        for(int i=0; i<n; i++){
            // result oututs the string a number of n times
            result = result + str;
        }
        return result; 
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){
        String result = "";
        // [1,2,3,4]
        // index Length 4
        // indices length 3
        // [0,1,2,3]
        for(int i=0; i<str.length(); i++){
            // check for first and last index
            // then reverse to check for everything BUT first and last index
            // then check if index is equal to z
            // !() this means everything but what's inside the parentheses
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("z"))){
                // result is every character but z
                result = result + str.charAt(i);
            }
        }
        return result; 
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){
        // initiated Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me....");
        // created number variable which is inputted by Scanner
        int number = keyboard.nextInt();
        // created total variable which is used to sum up the numbers given
        int total = 0;
        // created a while loop that runs if the number inputted is not equal to 0
        while(number!=0){
            // the total variable calculates the sum
            total = total + number;
            System.out.println("The total so far is " +total);
            number = keyboard.nextInt();
            System.out.println("Number: " +number);
        }
            // this next line is outputted if the number inputted is 0
            System.out.println("TOTAL ENDED --- The total is " +total);
    }

    public static void main(String[] args) {
        // Add code to help test your methods here
        System.out.println(loopE("hllo"));
        System.out.println(stringTimes("Hello", 3));
        System.out.println(stringZ("zhezoz"));
        sums();
    }
}
