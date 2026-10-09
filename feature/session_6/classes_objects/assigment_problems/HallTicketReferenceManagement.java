package classes_objects.assigment_problems;

public class HallTicketReferenceManagement {static class HallTicket{String studentName;int seatNumber;HallTicket(String n,int s){studentName=n;seatNumber=s;}}public static void main(String[] x){HallTicket priya=new HallTicket("Priya",0);HallTicket copy=priya;copy.seatNumber=45;System.out.println("Priya's seatNumber (via first variable): "+priya.seatNumber);System.out.println("copy == priya: "+(copy==priya));HallTicket separate=new HallTicket("Priya",45);System.out.println("separate == priya: "+(separate==priya));}}
