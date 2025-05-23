package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author adivira123
 */
public class Receipt {
    private pelanggantetap mCust;
    private bukanpelanggantetap nmCust;
    private final ArrayList<alattulis>ItemList;

    private double discount;
    int i = 1;
    private final String receiptID;
    private final LocalDate receiptDate;
    
    public Receipt(bukanpelanggantetap pelanggan)
    {
        ItemList = new ArrayList<>();
        receiptID = "00" + i++;
        receiptDate = LocalDate.now();
        nmCust = pelanggan;
        discount = 0;
    }
    
    public Receipt(pelanggantetap pelanggan)
    {
        ItemList = new ArrayList<>();
        receiptID = "00" + i++;
        receiptDate = LocalDate.now();
        mCust = pelanggan;
        discount = 0.05;
    }
    
    public void addItems(alattulis Si){
        ItemList.add(Si);
    }
    
    public void clearItems() {
        ItemList.clear();
    }
    
    public ArrayList<String> displayStationaryItems(){
        ArrayList<String> items = new ArrayList<>();
        for(i=0;i<ItemList.size();i++) {
            if (ItemList.get(i).getItemQuantity() != 0 ) {
                items.add(ItemList.get(i).getItemName()+ "/" + ItemList.get(i).getItemQuantity()+ "/idr"
                + ItemList.get(i).getItemPrice()+ "/idr"
                + ItemList.get(i).getTotalPrice());
            }
        }
        return items;
    }
    
    public void displayBasicInformation() {
        System.out.println("STATIONARY ITEMS RECEIPT"); System.out.println(" Kedai Dobi Kita");
        System.out.println("Taman Seri Indah, Kuantan");
    }
    
    public double calculateSubTotal(){
        double total = 0;
        
        for (i=0;i<ItemList.size();i++){
            total = total + ItemList.get(i).calculateTotalPrice(); 
        }
        return total;
    }
    
    public double calculateGST() {
        double gst;
        return gst = this.calculateSubTotal()* 0.06;
    }
    
    public double calculateDiscount() {
        return (this.calculateGST() + this.calculateSubTotal()) * discount;
    }
    
    public double calculateTotal(){
        double total;
        return total = this.calculateGST() + this.calculateSubTotal() - this.calculateDiscount();
    }
}
