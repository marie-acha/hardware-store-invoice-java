/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acha.marie
 */

import java.util.Scanner;

public class InvoiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create one Invoice object
        Invoice invoice1 = new Invoice("ABC123","Testing",-2,20);
        
        //display initial data in object invoice1
        System.out.printf("Initial hardware store invoice: %n Part number: %s%n Part Description: %s%n Quantity: %d%n Price: $%.2f%n%n",
                invoice1.getPartNumber(),invoice1.getPartDescription(),
                invoice1.getNumberOfPurchase(),invoice1.getPrice());
        
        //create a Scanner to obtain inputs from the user
        Scanner input = new Scanner(System.in);
       
        //obtain user input for part number
        System.out.print("Enter part number for invoice1: ");
        String partNum = input.nextLine();
        System.out.printf("adding %s to invoice1 part number...%n%n",
                partNum);
        invoice1.setPartNumber(partNum);
        
        //obtain user input for part description
        System.out.print("Enter part description for invoice1: ");
        String partDesc = input.nextLine();
        System.out.printf("adding %s to invoice1 part description...%n%n",
                partDesc);
        invoice1.setPartDescription(partDesc);
        
        //obtain user input for quantity of item purchased
        System.out.print("Enter quantity of item to purchase for invoice1: ");
        int quantity = input.nextInt();
        System.out.printf("adding %d to invoice1 quantity...%n%n",
                quantity);
        invoice1.setNumberOfPurchase(quantity);
        
        //obtain user input for price per item
        System.out.print("Enter the price per item for invoice1: ");
        double price = input.nextDouble();
        System.out.printf("adding $%.2f to invoice1 quantity...%n%n",
                price);
        invoice1.setPrice(price);
        
        //display current details of invoice1 including the invoice amount
        System.out.printf("*****Invoice1 has been added***** %n Part number: %s%n Part Description: %s%n Quantity: %d%n Price: $%.2f%n Invoice amount: $%.2f%n",
                invoice1.getPartNumber(),invoice1.getPartDescription(),
                invoice1.getNumberOfPurchase(),invoice1.getPrice(),
                invoice1.getInvoiceAmount(quantity, price)); //get the invoice amount   
    }
    
}
