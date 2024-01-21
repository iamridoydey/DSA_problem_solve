import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,4,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        int N = nums.length - 1;
        // Select the first two and last two item for get the maximum product difference
        int result = (nums[N] * nums[N-1]) - (nums[0] * nums[1]);
        System.out.println(result);
        Arrays.sort(new String[]{"2", "3", "30", "5"}, (a,b)->(b+a).compareTo(a+b));

    }


    static void sort(int[] arr){
        int N = arr.length;
        boolean isSwapped = false;
        for (int i = 0; i < N; i++){
            // Start comparison from 1 to before sorted
            for (int j = 1; j < N - i; j++){

                if (arr[j] < arr[j - 1]){
                    // Swap the value
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped){
                break;
            }

        }
    }
}