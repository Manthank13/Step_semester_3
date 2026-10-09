package arrays.assigment_problems;

import java.util.*; public class ThreeSum {static List<List<Integer>> threeSum(int[] a){Arrays.sort(a);List<List<Integer>> out=new ArrayList<>();for(int i=0;i<a.length-2;i++){if(i>0&&a[i]==a[i-1])continue;int l=i+1,r=a.length-1;while(l<r){int s=a[i]+a[l]+a[r];if(s==0){out.add(Arrays.asList(a[i],a[l],a[r]));int lv=a[l],rv=a[r];while(l<r&&a[l]==lv)l++;while(l<r&&a[r]==rv)r--;}else if(s<0)l++;else r--;}}return out;}public static void main(String[] x){System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));}}
