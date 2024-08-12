package Pcph;
import java.util.*;
public class Anagram {
        public static void main(String[] args) {
            String s1 = "heart";
            String s2 = "earth";
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            java.util.Arrays.sort(a1);
            java.util.Arrays.sort(a2);
            if (java.util.Arrays.equals(a1, a2)) {
                System.out.println("true");
            } else
                System.out.println("false");
        }
    }


