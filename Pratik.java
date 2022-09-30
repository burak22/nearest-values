import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = sc.nextInt();
        int[] holderArray = {5,-2,-65,10,54,68,12};
        int[] values = findNearest(number, holderArray);
        System.out.printf("Girdiğiniz sayıya en yakın sayılar: \nGirdiğiniz Sayıdan küçük: %d\nGirdiğiniz Sayıdan büyük: %d",values[0],values[1]);
        sc.close();
    }


    static int gapMin = Integer.MAX_VALUE;
    static int gapMax = Integer.MAX_VALUE;
    public static int[] findNearest(int n,int[]scanarray){
        int minNearestValue = 0;
        int maxNearestValue = 0;
        for (int i = 0; i < scanarray.length; i++) {
            if(scanarray[i]<n){
                if(n-scanarray[i]<gapMin){
                    gapMin = n-scanarray[i];
                    minNearestValue = scanarray[i];
                }
                else{
                    continue;
                }
            }
            else{
                if(scanarray[i]-n<gapMax){
                    gapMax = scanarray[i]-n;
                    maxNearestValue = scanarray[i];
                }
                else{
                    continue;
                }
            }
        }
        int[] values = {minNearestValue,maxNearestValue}; //min first
        return values;
    }
}
