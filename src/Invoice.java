/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acha.marie
 */
public class Invoice {
    
    //instance variables
    private String partNumber;
    private String partDescription;
    private int NumberOfPurchase;
    private double price;
    
    // constructor
    public Invoice(String partNumber, String partDescription, int NumberOfPurchase, double price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if(NumberOfPurchase > 0)
            this.NumberOfPurchase = NumberOfPurchase;
        if(price > 0)
            this.price = price;
    }
    
    // method that sets the part number
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    
    //method that gets the part number
    public String getPartNumber(){
        return partNumber; 
   } 
    
    // method that sets the part description
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    
    //method that gets the part number
    public String getPartDescription(){
        return partDescription; 
   } 
    
    // method that sets the number of items being purchased
    public void setNumberOfPurchase(int NumberOfPurchase){
        if(NumberOfPurchase > 0)
            this.NumberOfPurchase = NumberOfPurchase;
        else
            this.NumberOfPurchase = 0;
    }
    
    //method that gets the number of items being purchase
    public int getNumberOfPurchase(){       
        return NumberOfPurchase; 
   } 
    
    // method that sets the price per item
    public void setPrice(double price){
        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;
    }
    
    //method that gets the price per item
    public double getPrice(){   
        return price; 
   } 
    
    //method to calculate the invoice amount
    public double getInvoiceAmount(int NumberOfPurchase,double price){
        if(NumberOfPurchase < 0)
            NumberOfPurchase = 0;
        if(price < 0.0)
            price = 0;
        
        return NumberOfPurchase * price;
    }
}
