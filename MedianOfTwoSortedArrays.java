import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num3 =  new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, num3, 0, nums1.length);
        System.arraycopy(nums2, 0, num3, nums1.length, nums2.length);

        Arrays.sort(num3);

        if(num3.length % 2 == 0){
            return (num3[num3.length/2] + num3[num3.length/2 - 1]) / 2.0;
        }else{
            return num3[num3.length / 2];
        }
    }
    public static void main(String[] args) {

        int[] a = { -5, 3, 6, 12, 15 };
        int[] b = { -12, -10, -6, -3, 4, 10 };

        System.out.println(findMedianSortedArrays(a, b));

    }
}
