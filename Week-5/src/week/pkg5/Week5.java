/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author LARTEK
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Package p1 = new Package(
            "Ali", "Street 1", "Kayseri", "Kayseri", "38000",
            "Mehmet", "Street 2", "Ankara", "Ankara", "06000",
            10, 2.0
        );

        TwoDayPackage p2 = new TwoDayPackage(
            "Ali", "Street 1", "Kayseri", "Kayseri", "38000",
            "Ayse", "Street 3", "Istanbul", "Istanbul", "34000",
            10, 2.0, 5.0
        );

        OvernightPackage p3 = new OvernightPackage(
            "Mehmet", "Street 4", "Ankara", "Ankara", "06000",
            "Ali", "Street 1", "Kayseri", "Kayseri", "38000",
            10, 2.0, 0.5
        );

        System.out.println("----------------------------------------");
        
                    System.out.println("Normal Package");
                    
                    System.out.println(p1.toString());
            
            
            
       System.out.println("----------------------------------------");
                    System.out.println("2 Days Package");
                    
                    System.out.println(p2.toString());
            
       
       
       
       System.out.println("----------------------------------------");
        
                    System.out.println("Overnight Package");
                    System.out.println(p3.toString());
            
            
        
    
    }
    
}
