package Regex;

public class TryingRegex {
    public void exercitiu() {
        String test = "a";
        System.out.println(test.matches("[abc]"));
        test = "e";
        System.out.println(test.matches("[^abc]"));
        test = "c";
        System.out.println(test.matches("[a-z]"));
        test = "A";
        System.out.println(test.matches("[a-zA-Z]"));
        test = "cD";
        System.out.println(test.matches("[a-z][A-Z]"));
        test = "abccaaaca";
        System.out.println(test.matches("[abc]+"));
        test = "abcabc";
        System.out.println(test.matches("[abc]*"));
        test = "abcac";
        System.out.println(test.matches("[abc]{5}"));
        test = "abacacc";
        System.out.println(test.matches("[abc]{5,}"));
        test = "ababababc";
        System.out.println(test.matches("[abc]{5,10}"));

        String text = new String("Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.");

        System.out.println("Lungimea stringului: " + text.length());


        System.out.println(text.replaceAll("[ .]","").matches("[a-zA-Z]*"));

        String[] cuvinte = text.split(" ");
        int middle = cuvinte.length / 2;
        if (cuvinte.length % 2 == 0) {
            System.out.println("Cuvintele de la mijloc: " + cuvinte[middle - 1] + " " + cuvinte[middle]);
        } else {
            System.out.println("Cuvantul de la mijloc: " + cuvinte[middle]);
        }


        StringBuilder sb = new StringBuilder(text);
        System.out.println("Stringul inversat: " + sb.reverse());

    }
}