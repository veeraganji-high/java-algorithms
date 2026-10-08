package slidingwindow;

public class AverageOfAllSubArrays {
    public static void main(String[] args){
        int[] a={1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k =3;
        float[] b = new float[a.length-k+1];

        int subArraySum = 0;
        int totalSubArraysSum=0;
        for(int i=0;i<k;i++){
            subArraySum = subArraySum+a[i];
        }
        int j=0;
        int l=k-j-1;
        totalSubArraysSum = subArraySum;
        b[j]= (float) subArraySum /k;
        while(true){

            subArraySum = subArraySum-a[j++]+a[++l];
            b[j]= (float) subArraySum /k;
            if(l==a.length-1){
                break;
            }
        }
        for(float n:b)
            System.out.println(n);
    }
}
