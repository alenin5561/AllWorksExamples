public class Book extends Product {

    public String author;
    public int pages;
    //поля класса

    @Override
    //переписанный метод класса Product
    public boolean isTooExpensive() {
        if (price > 100) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    //переписанный метод класса Product
        public void use() {
            System.out.println("Read");
        }
    }

