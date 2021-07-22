package io.github.avijitmondal.java13;

public class StringNewMethods {
    public static void main(String[] args) {
        String output = """
                Name: %s
                Phone: %d
                Salary: $%.2f
                """.formatted("Avijit", 12345, 10000.10000);

        System.out.println(output);

        String htmlTextBlock = "<html>   \n" +
                "\t<body>\t\t \n" +
                "\t\t<p>Hello</p>  \t \n" +
                "\t</body> \n" +
                "</html>";
        System.out.println(htmlTextBlock.replace(" ", "*"));
        System.out.println(htmlTextBlock.stripIndent().replace(" ", "*"));
        String str1 = "Hi\t\nHello' \" /u0022 Avijit\r";

        System.out.println(str1);
        System.out.println(str1.translateEscapes());
    }
}
