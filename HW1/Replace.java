package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// EX I MAKE BREAD, 2, T
//    I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace 
{
    public String charReplace(String s, int x, char z)//s, x, z
    {

        // String s1 = "Cailyn";
        //System.out.println(s);
        //System.out.println(s.substring(0,x));
        String answer = s.substring(0,x)+z+s.substring(x+1);
        //System.out.println(s1.substring(3));
        // you need 2 substrings s.substring
        //System.out.println(s1.replace("l", "n"));
        return answer;
        
        //x = 3;
        //s = "Cailyn";
        //z = 'n';

    }
    
}
