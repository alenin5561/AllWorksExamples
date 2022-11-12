public class ProductRepository {

    private PurchaseItem[] items = new PurchaseItem[0];
    //Создан массив в который, мы сможем добавлять или удалять объекты.
    //Удаление, и добавление разобрать!
    public void save(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        //создаем новый массив длинною больше чем старый на один +1
        for (int i =0; i< items.length;i++){
            tmp[i] = items[i];
            //копируем элементы старого массива в новый
        }
        tmp[tmp.length -1] = item;
        //заполняем последнюю ячейку, указанным элементом, который указан в параметрах.
        items = tmp;
        //присваиваем новую ячейку старому массиву
    }

    public void removeById (int id) {
        PurchaseItem[] tmp = new PurchaseItem[items.length -1];
        int copyToIndex =0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                //если id не равен тому который му указали, то копируем его.
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public PurchaseItem[] getItems() {
        return items;
    }
}
