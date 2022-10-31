package StateDesignPattern;

public class TestStateDesign {
	public static void main(String[] args) {
		int arr[] = {-1,-100, 1, 3,99, 2, 4};
		int k = 3;
		rotate(arr, k);
	}
	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int curr = 0;
        int start = n-k;
        int temp = 0;
        for(int i = n-k;i<n;i++){
            temp = nums[i];
            shiftRight(nums, i, curr);
            nums[curr] = temp;
            System.out.println(nums[i]+" "+nums[curr]);
            curr++;
            start++;
            printArray(nums);
        }
    }
    
    static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    static void shiftRight(int nums[], int start, int curr){
        for(int i=start-1;i>=curr;i--){
            nums[i+1] = nums[i];
        }
    }
}
