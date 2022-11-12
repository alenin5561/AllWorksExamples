public class Product {

    protected int id;
    protected int price;

    public boolean isTooExpensive() {
        if (price > 1000) {
            return true;
        } else {
            return false;
        }
    }

    public void use() {
        System.out.println("Product");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
