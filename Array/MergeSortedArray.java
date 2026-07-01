class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1; //nums1 ka last element
        int p2=n-1; //nums2 ka last element

        int p=m+n-1; //nums1 ka last slot(jaha pe value dalna hai)

        while(p2>=0){                   //jabtak nums2 khatam na ho
            if(p1>=0 && nums1[p1]>nums2[p2]){  //agar nums1 wala bada hai 
                nums1[p]=nums1[p1];
                p1--;
            }else{               //warna nums2 wala bada (ya p1 khatam)
                nums1[p]=nums2[p2];
                p2--;
            }
            p--;//ek position peeche
        }
    }
}
