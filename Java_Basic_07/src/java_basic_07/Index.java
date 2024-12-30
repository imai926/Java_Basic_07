package java_basic_07;

public class Index{
    public static void main(String[] args) {
        ShoppingCart shopcart = new ShoppingCart();
        shopcart.addItem(new Product("商品A", 50.0));
        shopcart.addItem(new Product("商品B", 30.0));
        shopcart.addItem(new Product("商品C", 20.0));

        System.out.println("ショッピングカートの合計金額: $" + shopcart.getTotalPrice());
    }
}

class Product{
    private String name;
    private double price;

    public Product(String name , double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

class ShoppingCart{
    private Product[] items;
    int itemCount;

    public ShoppingCart(){
        this.items = new Product[5];
        this.itemCount = 0;
    }

    public void addItem(Product product){
        if (itemCount < items.length){
            items[itemCount] = product;
            itemCount++;
        }else {
            System.out.println("カートがいっぱいです。商品を追加できません。");
        }
    }

    public double getTotalPrice(){
        double total = 0.0;
        for(int i = 0; i < itemCount; i++){
            total += items[i].getPrice();
        }
        return total;
    }
}