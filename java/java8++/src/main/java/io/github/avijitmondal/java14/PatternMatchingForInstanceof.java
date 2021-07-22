package io.github.avijitmondal.java14;

public class PatternMatchingForInstanceof {
    public static void main(String[] args) {
        // before java 14
        var obj = "ABCD";
        if (obj instanceof String) {
            String str = (String) obj; // need to declare and cast again the object
            if (str.contains("A")) {
                System.out.println("str = " + str);
            }
        } else {
            System.out.println("String does not have A in it");
        }


        // changes on java 14
        var obj1 = "ABCD";

        if (obj1 instanceof String str1) {
            if(str1.contains("A")) {// no need to declare str object again with casting
                System.out.println("str1 = " + str1);
            }
        } else {
            System.out.println("String does not have A in it");
        }
    }
}
