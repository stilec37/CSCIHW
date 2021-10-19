package HW1;



public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        Pyramid.Output();
        // This way of instantiating an object involves the name of the class file.main method name


        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        // This way of instantiating an object is the Object name (name for object) = new Object name
        Adlibs a = new Adlibs();
        // The parameters put in these parentheses are what is printed out in the terminal 
        System.out.println(a.story("Cailyn", 18, "pink"));


        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        // instantiating the object
        Replace r = new Replace();
        // This is what is printed out in the terminal -- name of object.main method name (parameters);
        System.out.println(r.charReplace("Cailyn", 3, 'n'));
        // This method is the test for the example given in the instructions
        System.out.println(r.charReplace("I MAKE BREAD", 2, 'T'));
    }
}
