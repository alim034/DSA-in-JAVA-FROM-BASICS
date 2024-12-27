public class PalindromNumber 
{
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int reversenumber =0;
        int duplicate = x;

        while(x>0)
        {
            int lastdigit = x%10;
            reversenumber = (reversenumber*10)+lastdigit;
            x = x/10;
        }

        if(reversenumber==duplicate)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
