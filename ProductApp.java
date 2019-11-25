public class ProductApp {

public static void main(String args[]) {
    // display a welcome message
    System.out.println("Welcome to the Product Viewer");
    System.out.println();

    // create 1 or more line items
    Scanner sc = new Scanner(System.in);
    String choice = "y";
    while (choice.equalsIgnoreCase("y")) {
        // get input from user
        System.out.print("Enter product code: ");
        String productCode = sc.nextLine();

        // Use a ProductReader object to get the Product object
        ProductDB db = new ProductDB();            

             MyProduct myproduct = db.getProduct(productCode);

        // display the output
        String message = "\nPRODUCT\n" +
            "Code:        " + myproduct.getCode() + "\n" +
            "Description: " + myproduct.getDescription() + "\n" +
            "Price:       " + myproduct.getPrice()+ "\n";
        System.out.println(message);

        // see if the user wants to continue
        System.out.print("Continue? (y/n): ");
        choice = sc.nextLine();
        System.out.println();
    }
    System.out.println("Bye!");
