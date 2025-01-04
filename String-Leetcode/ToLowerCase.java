// https://leetcode.com/problems/to-lower-case/description/

public class ToLowerCase 
{
    public static void main(String[] args) 
    {
        String s = "Hello";
        System.out.println(tolowercase(s));

        String s1 = "LOVELY";
        System.out.println(tolowercase(s1));
    }

    public static String tolowercase(String s)
    {
        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i++)
        {
            int asci = (int)ch[i];

            if(asci>64 && asci<91)
            {
                ch[i] = (char)(asci+32);
            }
        }
        return String.valueOf(ch);
    }
}
