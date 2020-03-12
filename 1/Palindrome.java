import java.util.Scanner;

public class Palindrome 
{
    public static String reverseString(String s)
    {
        String rez="";
        for (int i=s.length()-1;i>=0;i--)
        {
            rez+=s.charAt(i);
        }
        return rez;
    }
    public static boolean isPalindrome(String s)
    {
        if (s.equals(reverseString(s)))
        return true;
        return false;
    }
    public static void main(String[] args) 
    {

        for (int i = 0; i < args.length; i++) 
        {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }
}