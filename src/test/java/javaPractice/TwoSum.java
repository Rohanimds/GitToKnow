package javaPractice;

public class TwoSum {

	public static void main(String[] args) {

		TwoSum s=new TwoSum();
	        int[] nums={1,5,3,9};
	        int target=4;
	        int[] numbers = solution(nums, target);

	        for(int n:numbers) {
	        	System.out.println(n);
	        }
	}
	

	public static int[] solution(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				int s = nums[i]+nums[j];
				if(s==target) {
					 System.out.println(i+" "+j);
//					 int[] c= {i,j};
					 return new int[] {i,j};
				}
			}
		}
		return null;
	}
}
