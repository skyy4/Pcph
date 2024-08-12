package Pcph;
import java.util.*;
public class MaximumThree_Desc {
    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 30, 5, 25, 35};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.println(arr[i]);
        }
    }}