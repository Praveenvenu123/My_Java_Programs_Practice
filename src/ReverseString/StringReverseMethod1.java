package ReverseString;

public class StringReverseMethod1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        String str="This is a test";
        String reversed="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed+=str.charAt(i);
        }
        System.out.println("Reversed String is  " +reversed);
    }
}