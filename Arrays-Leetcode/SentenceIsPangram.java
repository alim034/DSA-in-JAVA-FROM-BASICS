// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class SentenceIsPangram 
{
    public static void main(String[] args) 
    {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) 
    {
        int res = 0;
        for(int i=0; i<sentence.length(); i++)
        {
            res |= (1 << (sentence.charAt(i)-1));
            if(res==((1<<26)-1))
            {
                return true;
            }
        }
        return false;
    }
}
