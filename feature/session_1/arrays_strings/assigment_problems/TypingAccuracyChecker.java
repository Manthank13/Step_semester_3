package arrays_strings.assigment_problems;

public class TypingAccuracyChecker {
 static void checkTypingAccuracy(String original,String typed){int n=Math.min(original.length(),typed.length()),matched=0,first=-1; for(int i=0;i<n;i++)if(original.charAt(i)==typed.charAt(i))matched++;else if(first<0)first=i; double pct=100.0*matched/Math.max(original.length(),typed.length()); System.out.printf("Matched: %d/%d | Accuracy: %.2f%%",matched,Math.max(original.length(),typed.length()),pct); if(first<0&&original.length()==typed.length())System.out.println(" | No Mismatches"); else {if(first<0)first=n; System.out.printf(" | First Mismatch at position %d",first+1); if(first<original.length()&&first<typed.length())System.out.printf(" ('%c' vs '%c')",original.charAt(first),typed.charAt(first));System.out.println();}}
 public static void main(String[] x){checkTypingAccuracy("hello world","hello worlt");}
}
