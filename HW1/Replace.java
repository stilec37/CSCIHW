package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,T)
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace 
{
    public String charReplace(String s, int x, char z)
    {
        String answer = s.substring(0,x)+z+s.substring(x+1);
        // 2 substrings are needed
        // Use of string concatenation
        // The first substring accounts for the first part of the String parameter, and the second substring accounts for the second half after the given integer
        return answer;
    }
}
