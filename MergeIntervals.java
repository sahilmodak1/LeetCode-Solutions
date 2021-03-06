/*
Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
*/

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
    int n=intervals.size();
        
    int[] start = new int[n];
	int[] end = new int[n];
	
    for (int i = 0; i < n; i++) 
    {
		start[i]=intervals.get(i).start;
		end[i]=intervals.get(i).end;
	}
        
	Arrays.sort(start);
	Arrays.sort(end);
    List<Interval> ans=new ArrayList<>();
        
    for(int i=0;i<n;i++)
    {
        int j=i;
        while((i+1)<n && end[i]>=start[i+1])
            i++;

        ans.add(new Interval(start[j],end[i]));        
    }
        
    return ans;
        
        
 }
}