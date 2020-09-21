package com.exercises.test2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String solution (String[] A, String[] B, String P){
        ArrayList<String> namesContainingP = new ArrayList<String>();
        for (int i=0; i < B.length; i++) {
            if (B[i].contains(P)){
                namesContainingP.add(A[i]);
            }
        }
        if (namesContainingP.size() == 0){
            return "NO CONTACT";
        } else {
            Collections.sort(namesContainingP);
            return namesContainingP.get(0);
        }
    }

    public static void main(String[] args) {
        String[] a0 = {"pim", "pom"};
        String[] b0 = {"99999999999", "777888999"};
        String a = "88999";
        Solution sol = new Solution();
        System.out.println(sol.solution(a0, b0, a));
    }
}
