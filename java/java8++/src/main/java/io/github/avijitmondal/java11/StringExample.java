package io.github.avijitmondal.java11;

import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {

        // isBlank
        System.out.println(" ".isBlank()); //true
        String s = "Avijit";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true


        String str = "Avijit\nAvijit\nAvijit";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));


        // strip
        String str1 = " JD ";
        System.out.print("Start");
        System.out.print(str1.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str1.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str1.stripTrailing());
        System.out.println("End");

        // repeat
        String str2 = "=".repeat(2);
        System.out.println(str2);

    }
}
