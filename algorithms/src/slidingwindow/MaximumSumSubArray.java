package slidingwindow;

public class MaximumSumSubArray {
    public static void main(String[] args){
        //Given an integer array and an integer k. Find the maximum sum of a
        // sub array with the size k

        int[] a = {2, 4, 5, 3, 3, 2};
        int k = 3;
        int sum = 0;
        int maxSum = 0;

        for(int i=0;i<k;i++){
            sum=sum+a[i];
        }
        maxSum=sum;
        int x=0;
        int y=x+k-1;
        while(true){
            sum=sum-a[x++]+a[++y];
            maxSum=Math.max(sum,maxSum);

            if(y==a.length-1)
                break;



        }
        System.out.println(maxSum);
    }
}
