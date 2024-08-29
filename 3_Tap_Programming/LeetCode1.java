//FInd Medain for two sorted arrays
import java.util.Scanner;
public class LeetCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int nums1[] = new int[n1];
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int nums2[] = new int[n2];
        for(int i=0;i<nums2.length;i++){
            nums2[i]=sc.nextInt();
        }
        double ans = findMedianSortedArrays(nums1 , nums2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int target[] = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                target[k]=nums1[i];
                k++;
                i++;
            }
            else{
                target[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            target[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            target[k]=nums2[j];
            k++;
            j++;
        }
        double result = 0;
        int mid = target.length/2;
        if(target.length % 2 == 0){
            result = (target[mid]+target[mid-1])/2.0;
        }
        else{
            result = target[mid];
        }
        return result;
    }
}
