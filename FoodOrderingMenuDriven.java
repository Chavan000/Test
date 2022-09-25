package array;

import java.util.Scanner;

public class FoodOrderingMenuDriven {

    int frenchFries = 50;
    int burger = 80;
    int maggi = 60;
    int pizza = 100;
    int coldCoffee = 40;
    int noodles = 50;
    int tea = 10;										
    int ch;											
    int quantity;
    static int total;
    String again;
    
    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println();
        System.out.println("**************** Welcome To style Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           1.French Fries          50/-");
        System.out.println("           2.Burger                80/-");
        System.out.println("           3.Maggi                 60/-");
        System.out.println("           4.Noodles               50/- ");
        System.out.println("           5.Cold Coffee           40/-");
        System.out.println("           6.Pizza                 100/-");
        System.out.println("           7.Tea                   10/- ");
        System.out.println("           8.Exit                       ");
        System.out.println("======================================================");
        System.out.println("           What Do you Want to Order Today??        ");
        System.out.println();
    }
    public void generateBill()
    {
        System.out.println();
        System.out.println("**************** Thankyou for ordering ******************");
        System.out.println();
        System.out.println("**************** Your Bill is : " +total+" *****************");
    }

    public void order() {
    	while (true) {
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();
            if(ch<=0 || ch>8)
    		{
    		System.out.println("Invalid Input");
    		}
    		else
    		{
    			System.out.println(ch);
    		}
            
      
            switch (ch) {
                case 1:
                    System.out.println("You have Selected French Fries");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * frenchFries;
                    break;

                case 2:
                    System.out.println("You have Selected  Burger");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * burger;
                    break;

                case 3:
                    System.out.println("You have Selected Maggi");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * maggi;
                    break;
                case 4: 
                    System.out.println("You have Selected Noodles");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * noodles;
                    break;
                case 5:
                    System.out.println("You have Selected Cold Coffee");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * coldCoffee;
                    break;

                case 6:
                    System.out.println("You have Selected Pizza");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * pizza;
                    break;

                case 7:
                    System.out.println("You have Selected Tea");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * tea;
                    break;

                case 8:
                    System.exit(1);
                    break;

                default:
                    break;
            }
            System.out.println();
            System.out.print("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            {order();}
            else if(again.equalsIgnoreCase("N"))
            {generateBill();
            System.exit(1);}
            else{System.out.println("Invalid Choice");}
        }
}

            
            public static void main(String[] args) {
        		// TODO Auto-generated method stub

            	 FoodOrderingMenuDriven fo = new  FoodOrderingMenuDriven ();

        	     fo.displayMenu();

        	     fo.order();
     }
 }




