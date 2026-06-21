// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
// //         List<Integer> result = new Arrays.asList<>();
// //         Arrays.sort(nums1);
// //         Arrays.sort(nums2);

// //         for(int i= 0; i< nums1.length; i++){
// //             for(int j=0; j< nums2.length; j++){
// //                 if(nums1[i] == nums2[j]){
// //                     result.add(nums1[i]);
// //                 }else{
// //                     nums1[i]++;
// //                     nums2[j]++;
// //                 }
// //             }
// //         }
// //         return result;

// //     }
// // }
// import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) {
            res[i++] = num;
        }

        return res;
    }
}