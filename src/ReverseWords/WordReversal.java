package ReverseWords;

public class WordReversal {

    public static void main(String[] args) {
        String input = "This is a test";
        String[] words=input.split( " ");

        StringBuilder sb = new StringBuilder();
        for(String word:words)
        {

            sb.append(new StringBuilder(word).reverse()).append(" ");

        }
        System.out.println(sb.toString().trim());


    }
}