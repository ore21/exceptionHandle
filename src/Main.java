import java.io.IOException;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Customer cust1 = new Customer("Joe", "567-566-3456", "jii 34 road",
//                878.0);
//        Commercial cust2 = new Commercial("dsjh", "hel", "432833",
//                "2364 road", 43953.0, true);
//        Residential cust3 = new Residential("Brian", "566-465-6789", "406 w road",
//                3456.0, true);

        //cust1.customerInfo();
        //cust2.commercialweeklyCharges();


      //  Reader reader = new Reader() {

        int input = 1;
//        boolean erroC = true;
        int choice = 1;
        Scanner scanner = new Scanner(System.in);

        while (choice != 1 || choice != 2) {

            //int choice;
            try {
                System.out.println("1. Commercial");
                System.out.println("2. Residential");
                System.out.println("Enter a number between 1-2");
                choice = scanner.nextInt();
//                if (erroC) {
//                    throw new Exception("Enter a number between 1 - 2.");
//                    try {
//                        System.out.println(choice);
//                    }catch (InputMismatchException e) {
//                        System.out.println("is not a valid input.");
//
//                        } catch (InputMismatchException e) {
//                        switch (e.getMessage()){
//                            case "Not Valid.":
//                                System.out.println((e.getMessage()));
//                                break;
//                        }
//                        e.printStackTrace();
//                    }
//
//                }

            } catch (InputMismatchException e) {
                System.out.println("You did not enter an Integer or your integer was out of bounds");
                choice = 0;
                scanner.nextLine(); //clears scanner
               continue;
//                                break;

            } catch (NoSuchElementException e) {
                System.out.println("Not the right input");
                choice = 0;
                scanner.nextLine();
                continue;

            } catch (IllegalStateException e) {
                choice = 0;
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    //System.out.println(cust2);
                    Commercial();
                    break;
                case 2:
                    //System.out.println(cust3);
                    Residential();
                default:
                    System.out.println("Enter a number between 1-2");


//    private static void Commercial() {
//        boolean multiProperty;
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Commercial Customer");
//        System.out.println("Enter a property name: ");
//        String propertyName = scanner.nextLine();
//        System.out.println("Enter a customer name: ");
//        String customerName = scanner.nextLine();
//        System.out.println("Enter a customer phone number: ");
//        String customerPhone = scanner.nextLine();
//        System.out.println("Enter a customer address: ");
//        String customerAddress = scanner.nextLine();
//        System.out.println("Enter the square footage property: ");
//        String foot = scanner.nextLine();
//        Double squareFootage = Double.parseDouble(foot);
//        System.out.println("Type true if there is a multi-property discount: ");
//        String discount = scanner.nextLine();
//        if (discount.substring(0, 1).equals("t") || discount.substring(0, 1).equals("T")) {
//            multiProperty = true;
//        } else {
//            multiProperty = false;
//        }
//
//        Commercial customer = new Commercial(propertyName, customerName, customerPhone, customerAddress, squareFootage, multiProperty);
//        customer.commercialweeklyCharges();
//
//    }
//
//    private static void Residential(){
//        Scanner scanner = new Scanner(System.in);
//        boolean seniorField;
//
//        //Scanner scanner = new Scanner(System.in);
//        System.out.println("Residential Customer");
//        System.out.println("Enter a customer name: ");
//        String customerName = scanner.nextLine();
//        System.out.println("Enter a customer phone number: ");
//        String customerPhone = scanner.nextLine();
//        System.out.println("Enter a customer address: ");
//        String customerAddress = scanner.nextLine();
//        System.out.println("Enter the square footage property: ");
//        String foot = scanner.nextLine();
//        Double squareFootage = Double.parseDouble(foot);
//        System.out.println("Type true if there is a senior field discount: ");
//        String discount = scanner.nextLine();
//        if (discount.substring(0, 1).equals("t") || discount.substring(0, 1).equals("T")) {
//            seniorField = true;
//        } else {
//            seniorField = false;
//        }
//
//        Residential customer = new Residential(customerName, customerPhone, customerAddress, squareFootage, seniorField);
//        customer.residentialweeklyCharges();
//    }


            }
        }


    }

    public static void Commercial() {
        boolean multiProperty;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Commercial Customer");
        System.out.println("Enter a property name: ");
        String propertyName = scanner.nextLine();
        System.out.println("Enter a customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter a customer phone number: ");
        String customerPhone = scanner.nextLine();
        System.out.println("Enter a customer address: ");
        String customerAddress = scanner.nextLine();
        System.out.println("Enter the square footage property: ");
        String foot = scanner.nextLine();
        Double squareFootage = Double.parseDouble(foot);
        System.out.println("Type true if there is a multi-property discount: ");
        String discount = scanner.nextLine();
        if (discount.substring(0, 1).equals("t") || discount.substring(0, 1).equals("T")) {
            multiProperty = true;
        } else {
            multiProperty = false;
        }

        Commercial customer = new Commercial(propertyName, customerName, customerPhone, customerAddress, squareFootage, multiProperty);
        customer.commercialweeklyCharges();


    }

    public static void Residential() {
        Scanner scanner = new Scanner(System.in);
        boolean seniorField;

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Residential Customer");
//        try {
        System.out.println("Enter a customer name: ");
        String customerName = scanner.nextLine();
//        }catch ( InputMismatchException e) {
//            System.out.println("Not available");
//        }
        System.out.println("Enter a customer phone number: ");
        String customerPhone = scanner.nextLine();
        System.out.println("Enter a customer address: ");
        String customerAddress = scanner.nextLine();
        System.out.println("Enter the square footage property: ");
        String foot = scanner.nextLine();
        Double squareFootage = Double.parseDouble(foot);
        System.out.println("Type true if there is a senior field discount: ");
        String discount = scanner.nextLine();
        if (discount.substring(0, 1).equals("t") || discount.substring(0, 1).equals("T")) {
            seniorField = true;
        } else {
            seniorField = false;
        }

        Residential customer = new Residential(customerName, customerPhone, customerAddress, squareFootage, seniorField);
        customer.residentialweeklyCharges();
    }
}
