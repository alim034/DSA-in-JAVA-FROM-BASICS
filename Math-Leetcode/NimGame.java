// https://leetcode.com/problems/nim-game/description/
public class NimGame 
{
    public static void main(String[] args) 
    {
        int n = 4;
        System.out.println(canWinNim(n));

        int n1 = 1;
        System.out.println(canWinNim(n1));

        int n2 = 2;
        System.out.println(canWinNim(n2));
    }

    public static boolean canWinNim(int n)
    {
        return n%4 != 0;
    }
}
