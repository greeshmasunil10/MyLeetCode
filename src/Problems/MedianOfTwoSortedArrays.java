package Problems;

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {
    public MedianOfTwoSortedArrays(){
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2,4}));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                res.add(nums1[i]);
                i++;
            } else {
                res.add(nums2[j]);
                j++;
            }
        };
        while (i < n) {
            res.add(nums1[i]);
            i++;
        };
        while (j < m) {
            res.add(nums2[j]);
            j++;
        };

//        for(int c:res){
//            System.out.println("element:"+c);
//        }
        int k = res.size();
        System.out.println("k:"+k);
        if(k%2==0){
            return (float)(res.get(k/2) + res.get(k/2 - 1) )/ 2;
        } else{
            return res.get(k/2);
        }
    }
}
