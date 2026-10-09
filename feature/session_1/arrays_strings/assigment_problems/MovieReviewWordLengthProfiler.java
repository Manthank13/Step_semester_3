package arrays_strings.assigment_problems;

public class MovieReviewWordLengthProfiler {
 static void classifyWordLengths(String review){int s=0,m=0,l=0;for(String w:review.trim().split("\\s+")){String word=w.replaceAll("[^A-Za-z]","");if(word.isEmpty())continue;int n=word.length();if(n<=4)s++;else if(n<=8)m++;else l++;}System.out.println("Short: "+s+" | Medium: "+m+" | Long: "+l);}
 public static void main(String[] x){classifyWordLengths("This movie was absolutely fantastic and thrilling");}
}
