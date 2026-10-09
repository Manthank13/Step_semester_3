package arrays_methods.assigment_problems;

public class MatchDayGridAnalyzer {private static double rowAverage(int[] row){int sum=0;for(int v:row)sum+=v;return row.length==0?0:(double)sum/row.length;}static String classifyMatches(int[][] a,int threshold){StringBuilder s=new StringBuilder();for(int i=0;i<a.length;i++){if(i>0)s.append(" | ");s.append("Match ").append(i).append(": ").append(rowAverage(a[i])>=threshold?"Power Surge":"Normal");}return s.toString();}public static void main(String[] x){System.out.println(classifyMatches(new int[][]{{4,6,8},{10,12,14},{2,3,1}},8));}}
