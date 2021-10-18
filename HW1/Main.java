package HW1;



public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        //Pyramid p = new Pyramid();
        //p.Output();
        //Object name (name for object) = new Object name
        Pyramid.Output();


        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Adlibs a = new Adlibs();
        //a.story("Cailyn", 18, "pink");
        System.out.println(a.story("Cailyn", 18, "pink"));
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
       
        Replace r = new Replace();
        System.out.println(r.charReplace("Cailyn", 3, 'n'));
        System.out.println(r.charReplace("I MAKE BREAD", 2, 'T'));
        //Replace.charReplace();
        //System.out.println(s1.replace("l", "n"));
        

    }
}
