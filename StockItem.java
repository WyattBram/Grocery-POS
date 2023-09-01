public class StockItem {

    private String description;
    private int id;
    private double price;
    private int quantity;
    static int nextId;


    StockItem(){

    }

    //Use .this operator
    StockItem(double price, int quantity, String description){
        this.price= price;
        this.quantity= quantity;
        this.description= description;
        this.id = nextId;
        nextId++;

    }

    public int getId(){
        return id;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        if(p > 0){
            price = Math.round(p*100) /100.0;
        }
        else {
            System.out.println("Price can not be less than 0");
        }

    }

    public void setQuantityUp(int q){
        quantity += q;
    }

    public void setQuantityDown(int q){
        if(quantity - q < 0){
            System.out.println("Can not have less than 0 quantity");
        }
        else{
            quantity -= q;
        }

    }

    @Override
    public String toString() {
    return "Item number: " + getId() + " is " + getDescription() + " has price: $" + getPrice()
            + " we currently have " + getQuantity() + " in stock";




    }



}