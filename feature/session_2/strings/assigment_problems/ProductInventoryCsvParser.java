package strings.assigment_problems;

public class ProductInventoryCsvParser { static void parseInventoryRecord(String s){String[] p=s.split(",",-1);if(p.length!=3){System.out.println("Invalid Record");return;}System.out.println("Product: "+p[0].trim()+" | SKU: "+p[1].trim()+" | Qty: "+p[2].trim());} public static void main(String[] x){parseInventoryRecord("Wireless Mouse,WM-2201,150");}}
