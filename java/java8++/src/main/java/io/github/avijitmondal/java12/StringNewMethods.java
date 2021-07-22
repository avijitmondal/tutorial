package io.github.avijitmondal.java12;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringNewMethods {
    public static void main(String[] args) {

        String str = "*****\n  Hi\n  \tHello Pankaj\rHow are you?\n*****";

        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));

        String s = "Hi,Hello,Howdy";
        List strList = s.transform(s1 -> {
            return Arrays.asList(s1.split(","));
        });
        System.out.println(strList);

        String so = "Hello";
        Optional os = so.describeConstable();
        System.out.println(os);
        System.out.println(os.get());

        String so1 = "Hello";

        so1.resolveConstantDesc(MethodHandles.lookup());
    }
}
