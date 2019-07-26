//The purpose of this program is to allow a customer to view the menu and prices of each item and place their order.
//Scanner is needed to collect items they want
    import java.util.Scanner;
    public class Restaurant {
    
//Variables that are going to needed throughout the entirety of the program
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    static Scanner request = new Scanner(System.in);
    static double j = 0.0;
   
    public static void main(String[] args) {
    
    int menuOption;
    int foodItem = 0;
    input = new Scanner(System.in);
    double runningTotal=0;
    while(ordering) 
    {
    //A menu to show the items the restaraunt sells along with their prices
    menu();
    menuOption = input.nextInt();
    switch(menuOption){
    case 1:
    foodItem = 1;
    runningTotal += ItemPrice(foodItem);
    break;
    case 2:
    foodItem = 2;
    runningTotal += ItemPrice(foodItem);
    break;
    case 3:
    foodItem = 3;
    runningTotal += ItemPrice(foodItem);
    break;
    case 4:
    done(runningTotal);
    break;
    default:
    System.out.println("Invalid option.");
        }
    } 
    //Show them their total
    System.out.println("Total amount: $" + runningTotal);
    
    }
      
    public static void menu() {
    System.out.println("Welcome to Todd's Burgers! \n1. Burger ($3.00) \n2. Fries ($2.00)\n3. Soda ($1.00) \n4. Done");
      
    }

    public static double ItemPrice(int foodItem) {
    if (foodItem == 1) {
        // burger= $3.00
        System.out.println("You've ordered a burger");
        itemPrice = 3.00;
    }
    if (foodItem == 2) {
        // fries = $2.00
        System.out.println("You've ordered fries");
        itemPrice = 2.00;
    }
    if (foodItem == 3) {
        // soda = $1.00
        System.out.println("You've ordered a soda");
        itemPrice = 1.00;
    }
    quantity();
    return j;
}

public static double quantity() {
    System.out.println("Enter quantity");
    double quantity = input.nextDouble();
    subTotal(quantity, itemPrice);
    return quantity;
}

public static double subTotal(double quantity, double itemPrice) {
    double subTotal = quantity * itemPrice;
    System.out.println("Subtotal: $" + subTotal);
    j=subTotal;
    return subTotal;
}

//Finish program and thank customer
public static void done(double runningTotal) {
    ordering = false;
    System.out.println("Thank you for your business!");
}
}
