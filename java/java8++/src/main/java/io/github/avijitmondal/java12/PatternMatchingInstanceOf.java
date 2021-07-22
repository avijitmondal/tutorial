package io.github.avijitmondal.java12;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) {

        // before java 12
        String obj = new String();
        if (obj instanceof String) {
            String s = (String) obj;
            // use s in your code from here
        }

        // after java 12
//        if (obj instanceof String s) {
//             can use s directly here
//        }

    }
}
