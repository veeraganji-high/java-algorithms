package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubArray {
    public static void main(String[] args){
        int[] a={4,1,2,2,1,2,3,1};
        int k=2;
        int left=0;
        int right=left;
        Map<Integer,Integer> hm=new HashMap<>();
        int bestStart=0;
        int bestEnd=0;
        int maxSize=0;
        while(right<a.length){
            if(hm.size()<=k) {
                if (hm.containsKey(a[right])) {
                    hm.put(a[right], hm.get(a[right]) + 1);
                } else {
                    hm.put(a[right], 1);
                }
                if(hm.size()==k){
                     if(maxSize<right-left){
                         maxSize=right-left;
                         bestStart=left;
                         bestEnd=right;
                     }
                }
                right++;

            } else{

                hm.put(a[left], hm.get(a[left]) - 1);
                if(hm.get(a[left])==0){
                    hm.remove(a[left]);
                }
                left++;
            }
        }
        System.out.println("bestStart= "+bestStart+" bestEnd= "+bestEnd);
        for(int i=bestStart;i<=bestEnd;i++){
            System.out.println(a[i]);
        }

    }
}
