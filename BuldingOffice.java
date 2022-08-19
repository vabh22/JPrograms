import java.util.*;
class Building {
    public void floors(){
        System.out.println("=======Number of Floors");
        System.out.println("floor Number-G");
        System.out.println("Floor Number-1");
        System.out.println("Floor Number-2");
        System.out.println("Floor Number-3");
        System.out.println("Floor Number-4");
    }
}
 class House extends Building{
    public void BedRooms(){
        System.out.println("=========Number of BedRoom======");
        System.out.println("Room Number-101");
        System.out.println("Room Number-102");
        System.out.println("Room Number-103");
        System.out.println("Room Number-104");
    }
}
 class Office extends House{
    public void TeleTab(){
        System.out.println("======Number of Telephone========");
        System.out.println("telephone in first floor-1");
        System.out.println("Telephone in second floor-2");
        System.out.println("Telephone in third floor-1");
        System.out.println("Telephone in Fourth floor-1");
        System.out.println("=============Number of Table========");
        System.out.println("Table in first floor-5");
        System.out.println("Table in second floor-2");
        System.out.println("Table in third floor-2");
        System.out.println("Table in fourth floor-8");
        }
}
public class BuldingOffice {
    public static void main(String args[]){
        Office of=new Office();
        of.floors();
        of.BedRooms();
        of.TeleTab();
    }
    
}

