class FindAllAnagramsInAString {
    public static boolean compare(int arr1[],int arr2[])
    {
        for (int i=0; i<arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
 
// This function search for all permutations of pat[] in txt[]
    public static List<Integer> findAnagrams(String s,String p)
    {
        List<Integer> ans=new ArrayList<>();
        if (s == null || p == null || s.length() < p.length())
            return ans;
        
        int m = p.length(), n = s.length();
        
        int[] count_pat=new int[26];
        int[] count_text=new int[26];
        for (int i = 0; i < m; i++)
        {
            (count_pat[p.charAt(i)-'a'])++;
            (count_text[s.charAt(i)-'a'])++;
        }

        // Traverse through remaining characters of pattern
        for (int i = m; i < n; i++)
        {
            // Compare counts of current window of text with
            // counts of pattern[]
            if (compare(count_pat, count_text))
                ans.add(i-m);

            // Add current character to current window
            (count_text[s.charAt(i)-'a'])++;

            // Remove the first character of previous window
            count_text[s.charAt(i-m)-'a']--;
        }

        // Check for the last window in text
        if (compare(count_pat, count_text))
            ans.add(n-m);

        return ans;
    }
}