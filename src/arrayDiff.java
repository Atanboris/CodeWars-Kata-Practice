import java.util.Arrays;

public class arrayDiff {
    public static int[] arrayDiffs(int[] a, int[] b) {
        int[] newA;
        for(int num: b){
            if(Arrays.stream(a).anyMatch(currentNum -> currentNum != num)){


            }
        }
        return a;
    }
}
