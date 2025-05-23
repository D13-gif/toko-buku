package model;

/**
 *
 * @author adivi123
 */
public final class alattulis {
    private String itemName;
    private double itemPrice;
    private final int itemQuantity;
    private double totalPrice;
    
    public alattulis(String itName, int iQtty){ 
        setItemName(itName);
        setPrice(itName);
        itemQuantity = iQtty;
        totalPrice = calculateTotalPrice();
    }
    
    public String getItemName() {
        return itemName;
    }
    
    private void setItemName(String itName) {
        
        switch (itName){
            case "pen": 
                itemName = "Pen";
                break;
            case "pencil": 
                itemName = "Pencil";
                break;
            case "eraser": 
                itemName = "Eraser";
                break;
        }
    }
    
    private void setPrice(String itName) {
        switch (itName){
        case "pen": 
            itemPrice = 2.000; 
            break;
        case "pencil": 
            itemPrice = 1.500; 
            break;
        case "eraser": 
            itemPrice = 0.500; 
            break;
        }
    }
    
    public int getItemQuantity() {
        return itemQuantity;
    }
    
    public double getItemPrice() {
        return itemPrice;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public double calculateTotalPrice(){
        totalPrice = itemPrice * itemQuantity;
        return totalPrice;
    }
}
