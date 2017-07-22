/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> current=new ArrayList<>();
                List<Integer> previous=new ArrayList<>();

                
		for (int i = 0; i < numRows; i++) 
                {
			current = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++)
				if (j == 0 || j == i)
					current.add(1);
				else
					current.add(previous.get(j - 1) + previous.get(j));
			previous = current;
			res.add(current);
		}
		return res;
	}
}