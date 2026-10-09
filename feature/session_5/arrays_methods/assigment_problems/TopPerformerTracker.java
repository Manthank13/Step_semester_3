package arrays_methods.assigment_problems;

public class TopPerformerTracker {static String findMinMaxSpread(int[] a){int min=a[0],max=a[0];for(int v:a){if(v<min)min=v;if(v>max)max=v;}return "Min: "+min+" | Max: "+max+" | Spread: "+(max-min);}public static void main(String[] x){System.out.println(findMinMaxSpread(new int[]{45,82,79,90,33,90,61}));}}
