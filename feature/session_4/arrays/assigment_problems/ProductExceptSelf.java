package arrays.assigment_problems;

import java.util.*; public class ProductExceptSelf { static int[] productExceptSelf(int[] a){int n=a.length;int[] r=new int[n];int p=1;for(int i=0;i<n;i++){r[i]=p;p*=a[i];}p=1;for(int i=n-1;i>=0;i--){r[i]*=p;p*=a[i];}return r;}public static void main(String[] x){System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));}}
