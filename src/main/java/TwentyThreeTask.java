public class TwentyThreeTask {
    public static void main(String[] args) {
        int firstBucket = 30;
        int secondBucket = 0;
        for( ; firstBucket > 0; ){
            firstBucket = firstBucket - 1;
            if (firstBucket % 10 == 0) continue;
            System.out.println(firstBucket);
            secondBucket = secondBucket + 1;
            if (secondBucket % 10 == 0) continue;
            System.out.println(secondBucket);
            }
        }
    }
