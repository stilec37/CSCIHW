package HW4;

import java.util.Arrays;
import java.util.Scanner;



public class ArraysTest {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // If you want to use an ArrayList for the inputs to be dynamic that is okay
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
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
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    public static void Arraysums(){
        int[] sumsArray; 
        sumsArray = new int[10];
        // created array with 10 elements

        Scanner keyboard = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me....");
        // created number variable which is inputted by Scanner
        int number = keyboard.nextInt();
        sumsArray[0] = number;
        // created total variable which is used to sum up the numbers given
        int total = 0;
        // created a while loop that runs if the number inputted is not equal to 0
        //while(number!=0){
        for(int i = 1; i<=sumsArray.length-1; i++){
            if(number!=0){
            // the total variable calculates the sum
            total = total + number;
            System.out.println("The total so far is " +total);
            number = keyboard.nextInt();
            sumsArray[i] = number;
            System.out.println("Number: " +number); 
        }
    }
            // this next line is outputted if the number inputted is 0
            System.out.println("TOTAL ENDED --- The total is " +total);
            for (int i : sumsArray) {
                System.out.print(i);
                // prints the array
            } 
    }

    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to
    // a char array as well
    // From there creating for and while loops to compare the values is trivial

    public static String bruteForce(String password){
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
    
        int index = 0;
        char currentChar = password.charAt(index);
        while (true) {
            for (char val : alphabet) {
                if (currentChar == val) {
                    answer = answer + val;
                    // for each value in the alphabet, if the current character equals that value, then the value is
                    // added to the answer
                }
            }
            if (index < (password.length()-1)) {
                index++;
            }
            currentChar = password.charAt(index);
            if (answer.length() == password.length()) {
                break;
            }
        }
        return answer;
    }

    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Array.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){
        int [] sortedArray = new int[nums.length];
        sortedArray.toString();

        int n = nums.length;
        int temp = 0;
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]>nums[j]){
                    // compares the values to see if they are out of order
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp; 
                }
            }
        } for(int i = 0; i<n; i++){
            sortedArray[i] = nums[i];
            // adds the values to the sortedArray
        }
        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }


    public static void main(String[] args) {
        Arraysums();
        System.out.println();
        System.out.println(bruteForce("abc"));
        int[] x = {3,2,6,1,9};
        sorter(x);
    }
}
