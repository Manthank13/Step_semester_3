package polymorphism.assigment_problems;
import java.time.LocalDate;
import java.util.Scanner;
public class StreamingPlanRenewalReminder {
    interface Plan { int validityDays(); }
    static class Basic implements Plan { public int validityDays(){ return 30; } }
    static class Standard implements Plan { public int validityDays(){ return 90; } }
    static class Premium implements Plan { public int validityDays(){ return 365; } }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String type = s.next(), name = s.next();
            LocalDate start = LocalDate.parse(s.next());
            Plan plan = type.equals("BASIC") ? new Basic() : type.equals("STANDARD") ? new Standard() : new Premium();
            System.out.println(name + ": " + start.plusDays(plan.validityDays()));
        }
    }
}
