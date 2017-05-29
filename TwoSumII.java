public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        
    int index1 = 0;
	int index2 = numbers.length - 1;
 
	while (index1 < index2) {
		int x = numbers[index1] + numbers[index2];
		if (x < target) {
			index1++;
		} else if (x > target) {
			index2--;
		} else {
			return new int[] { index1 + 1, index2 + 1 };
		}
	}
	
	return null;
}
}