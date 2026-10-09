package arrays_strings.assigment_problems;

public class WarehouseInventoryBalancer {
 static void analyzeInventory(int[] a,int[] b){int sa=0,sb=0,max=Integer.MIN_VALUE;String where="";for(int i=0;i<a.length;i++){sa+=a[i];if(a[i]>max){max=a[i];where="Section A index "+i;}}for(int i=0;i<b.length;i++){sb+=b[i];if(b[i]>max){max=b[i];where="Section B index "+i;}}System.out.println("Section A Total: "+sa+" | Section B Total: "+sb+" | Status: "+(sa==sb?"Balanced":"Not Balanced")+" | Highest: "+max+" at "+where);}
 public static void main(String[] x){analyzeInventory(new int[]{20,15,30},new int[]{25,10,30});}
}
