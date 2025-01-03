//https://leetcode.com/problems/defanging-an-ip-address/description/

public class DefangingIP 
{
    public static void main(String[] args) 
    {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));

        String address1 = "255.100.50.0";
        System.out.println(defangIPaddr(address1));
    }

    public static String defangIPaddr(String address) 
    {
        StringBuilder sb = new StringBuilder();
        char[] chars = address.toCharArray();

        for(char ch: chars)
        {
            if(ch == '.')
                sb.append("[.]");
            else
                sb.append(ch);
        }

        return sb.toString();
    }
}
