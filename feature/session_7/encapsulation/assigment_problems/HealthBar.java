package encapsulation.assigment_problems;

public class HealthBar {static class Character{private int health;private final int maxHealth;Character(int max){maxHealth=Math.max(0,max);health=maxHealth;}void takeDamage(int n){if(n>0)health=Math.max(0,health-n);}void heal(int n){if(n>0)health=Math.min(maxHealth,health+n);}int getHealth(){return health;}}public static void main(String[] x){Character c=new Character(100);c.takeDamage(30);System.out.println(c.getHealth());c.heal(50);System.out.println(c.getHealth());c.takeDamage(150);System.out.println(c.getHealth());}}
