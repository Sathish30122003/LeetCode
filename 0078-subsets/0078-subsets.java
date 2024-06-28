import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        find(nums, arr, 0, temp);
        return arr;
    }

    void find(int[] nums, List<List<Integer>> arr, int i, List<Integer> temp) {
        if (i == nums.length) {
            arr.add(new ArrayList<>(temp)); 
            return;
        }
        find(nums, arr, i + 1, new ArrayList<>(temp));
        temp.add(nums[i]);
        find(nums, arr, i + 1, new ArrayList<>(temp));
        
        
        temp.remove(temp.size() - 1);
    }
}
