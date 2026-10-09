package arrays_methods.assigment_problems;

import java.util.*; public class FantasyTeamScoreMultiplier {static void applyMultipliers(double[] s,int c,int v){s[c]*=2;s[v]*=1.5;}public static void main(String[] x){double[] s={40,55,30,62};applyMultipliers(s,1,3);System.out.println(Arrays.toString(s));}}
