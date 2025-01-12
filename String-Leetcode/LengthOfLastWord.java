//https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord 
{
    public static void main(String[] args) 
    {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) 
    {
        s = s.trim();

        int last_space = s.lastIndexOf(' ');

        return s.length()-last_space-1;
    }
}
