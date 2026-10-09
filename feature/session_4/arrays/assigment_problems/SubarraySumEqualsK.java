package arrays.assigment_problems;

import java.util.*; public class SubarraySumEqualsK {static int subarraySum(int[] a,int k){Map<Integer,Integer> f=new HashMap<>();f.put(0,1);int sum=0,count=0;for(int v:a){sum+=v;count+=f.getOrDefault(sum-k,0);f.put(sum,f.getOrDefault(sum,0)+1);}return count;}public static void main(String[] x){System.out.println(subarraySum(new int[]{1,1,1},2));}}
