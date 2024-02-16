package CarManagment;

import java.util.*;
import java.sql.SQLOutput;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employess;
    int total_cars_in_stocks = 0;
    String manager_name;

    
    public void get_details(){
        System.out.println("Showroom Name: " + showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Employess: "+total_employess);
        System.out.println("Total Cars In Stock: "+total_cars_in_stocks);        
    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========================== ***ENTER SHOROOM DETAIL*** ============================");
        System.out.println();
        System.out.print("SHOWRROM NAME: ");
        showroom_name = sc.nextLine();
        System.out.print("SHOWRROM ADDRESS: ");
        showroom_address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.print("TOTAL NO. OF EMPLOYEE: ");
        total_employess = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_cars_in_stocks = sc.nextInt();
    }
}
