package encapsulation.assigment_problems;

public class TrafficLight {private final String id;private String color="RED";public TrafficLight(String id){this.id=id;}public String getId(){return id;}public String getColor(){return color;}public void next(){if(color.equals("RED"))color="GREEN";else if(color.equals("GREEN"))color="YELLOW";else color="RED";}public static void main(String[] x){TrafficLight t=new TrafficLight("TL-9");System.out.println(t.getColor());t.next();System.out.println(t.getColor());t.next();System.out.println(t.getColor());t.next();System.out.println(t.getColor());}}
