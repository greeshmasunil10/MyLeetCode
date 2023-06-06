package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public TwoSums() {
        int[] nums = {3,3,4,11};
        int target = 7;
        int[] ans = twoSum(nums,target);
        System.out.print("nums:");
        Arrays.stream(nums).forEach(e -> System.out.print(e+", "));
        System.out.println("\ntarget:"+target);
        System.out.println("Answer:"+ans[0]+", "+ ans[1]);

    }
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
//        int comp[] = new int[100];
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
//                System.out.println("found!");
//                System.out.println("map:");
//                map.forEach((key, value) -> System.out.println(key + " = " + value));
//                System.out.println("get:"+map.get(complement));
//                System.out.println("i:"+i);
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {0,0};

    }
}
