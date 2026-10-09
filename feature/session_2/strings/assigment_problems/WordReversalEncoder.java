package strings.assigment_problems;

public class WordReversalEncoder { static String reverseEachWord(String s){String[] words=s.split(" ");StringBuilder out=new StringBuilder();for(int i=0;i<words.length;i++){if(i>0)out.append(' ');out.append(new StringBuilder(words[i]).reverse());}return out.toString();} public static void main(String[] x){System.out.println(reverseEachWord("hello club"));}}
