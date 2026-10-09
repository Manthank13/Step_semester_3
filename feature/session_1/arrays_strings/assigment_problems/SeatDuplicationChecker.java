package arrays_strings.assigment_problems;

import java.util.*;
public class SeatDuplicationChecker {
 static void checkDuplicateSeats(int[] a){ boolean found=false; for(int i=0;i<a.length;i++) for(int j=i+1;j<a.length;j++) if(a[i]==a[j]) { boolean earlier=false; for(int k=0;k<i;k++) if(a[k]==a[i]) earlier=true; if(!earlier){System.out.println("Duplicate Seat Number Found: "+a[i]);found=true;} } if(!found) System.out.println("No Duplicate Seats Found"); }
 public static void main(String[] x){checkDuplicateSeats(new int[]{101,102,103,102,105});}
}
