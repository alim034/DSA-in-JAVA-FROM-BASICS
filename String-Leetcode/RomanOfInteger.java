//https://meet.google.com/bfz-cimy-tvv/

public class RomanOfInteger 
{
    public static void main(String[] args) 
    {
        String s = "III";
        System.out.println(romanToInt(s));

        String s1 = "LVIII";
        System.out.println(romanToInt(s1));

        String s2 = "MCMXCIV";
        System.out.println(romanToInt(s2));
    }

    public static int romanToInt(String s) 
    {
        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            int currentValue = getValue(s.charAt(i));

            if (currentValue < previousValue) 
            {
                result -= currentValue;
            } 
            else 
            {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }

    public static int getValue(char romanChar) 
    {
        switch (romanChar) 
        {
            case 'I': 
                return 1;
            case 'V': 
                return 5;
            case 'X': 
                return 10;
            case 'L': 
                return 50;
            case 'C': 
                return 100;
            case 'D': 
                return 500;
            case 'M': 
                return 1000;
            default: 
                return 0;
        }
    }
}
