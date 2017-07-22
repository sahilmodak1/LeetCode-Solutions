/*
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:

Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".

Example 2:

Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
*/
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        String[] ans;
        int index=Integer.MAX_VALUE;
    
        List<String> a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        List<String> c=new ArrayList<>();
        
        for(String x:list1)
            a.add(x);
        for(String x:list2)
            b.add(x);
        
        for(String x:a)
            if(b.contains(x))
            {
                if(a.indexOf(x)+b.indexOf(x)<index)
                {
                    c=new ArrayList<>();
                    c.add(x);
                    index=a.indexOf(x)+b.indexOf(x);
                }
                else if(a.indexOf(x)+b.indexOf(x)==index)
                    c.add(x);
            }
        
        ans=new String[c.size()];
        for(int i=0;i<c.size();i++)
            ans[i]=c.get(i);
        
        return ans;
    }
}