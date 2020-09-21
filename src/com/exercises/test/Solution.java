package com.exercises.test;

import java.util.ArrayList;

class Solution {
    public int solution(int N, int K) {
        // write your code in Java SE 8
        int sum = 0;
        ArrayList<Integer> glasses = new ArrayList<Integer>();
        while (N > 0) {
            if (N + sum == K){
                glasses.add(N);
                return glasses.size();
            }
            if (N + sum > K) {
                N--;
                continue;
            } else {
                sum += N;
                glasses.add(N);
                N--;
                continue;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5,8));
        System.out.println(sol.solution(4,10));
        System.out.println(sol.solution(1,2));
        System.out.println(sol.solution(10,5));
    }
}

