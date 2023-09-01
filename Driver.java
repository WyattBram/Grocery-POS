import java.sql.SQLOutput;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        int choice;
        StockItem milk = new StockItem(3.60, 15, "1 Gallon of Milk" );
        StockItem bread = new StockItem(1.98, 30, "1 loaf of Bread" );



        do{
            System.out.println(
                    "1- Sold One Milk\n" +
                    "2- Sold One Bread\n" +
                    "3- Change price of Milk\n" +
                    "4- Change price of Bread\n" +
                    "5- Add Milk to Inventory\n" +
                    "6- Add Bread to Inventory\n"+
                    "7- See Inventory\n" +
                    "8- Quit"
                    );
            Scanner x = new Scanner (System.in);
            choice = x.nextInt();
            x.nextLine();

            if (choice == 1){
                milk.setQuantityDown(1);
            }

            else if (choice == 2){
                bread.setQuantityDown(1);
            }

            else if (choice == 3){
                System.out.println("Enter a new price: ");
                double choiceI = x.nextDouble();
                x.nextLine();
                milk.setPrice(choiceI);
            }

            else if (choice == 4){
                System.out.println("Enter a new price: ");
                double choiceI = x.nextDouble();
                x.nextLine();
                bread.setPrice(choiceI);
            }

            else if (choice == 5){
                milk.setQuantityUp(1);
            }

            else if (choice == 6){
                bread.setQuantityUp(1);
            }

            else if (choice == 7){
                System.out.println("Milk: " + milk.toString() + "\n");
                System.out.println("Bread: " + bread.toString());
            }






        }while (choice !=8);
    }
}
