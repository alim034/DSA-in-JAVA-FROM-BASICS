//https://leetcode.com/problems/word-subsets/description/

import java.util.ArrayList;
import java.util.List;

public class WordsSubsets 
{
    public static void main(String[] args) 
    {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        System.out.println(wordSubsets(words1, words2));
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) 
    {
        int[] maxFreq = new int[26];
        
        
        for (String word : words2) 
        {
            int[] freq = getFreq(word);
            for (int i = 0; i < 26; i++) 
            {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        
       
        for (String word : words1) 
        {
            int[] freq = getFreq(word);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) 
            {
                if (freq[i] < maxFreq[i]) 
                {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) 
            {
                result.add(word);
            }
        }
        
        return result;
    }
    
    
    private int[] getFreq(String word) 
    {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) 
        {
            freq[c - 'a']++;
        }
        return freq;
    }
}
