package arrays_strings.assigment_problems;

public class TrafficSignalStreakAnalyzer {
 static void findLongestStreak(String s){if(s.isEmpty()){System.out.println("Empty signal log");return;} char best=s.charAt(0),cur=best; int run=1,max=1; for(int i=1;i<s.length();i++){if(s.charAt(i)==cur)run++;else{cur=s.charAt(i);run=1;}if(run>max){max=run;best=cur;}}System.out.println("Longest Streak: '"+best+"' repeated "+max+" times");}
 public static void main(String[] x){findLongestStreak("RRGGGYRR");}
}
