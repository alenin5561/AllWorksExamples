public class Main14 {

    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        PurchaseItem item = new PurchaseItem(1,12,"конфета",20,1);

        //Мы хотим удалить несуществующий объект с id 13.
        try {
            repo.removeById(13);
            //выполняемая часть кода в которой есть ошибка, если ошибки в этой части нет вторая часть не будет исполнена.
        } catch (NegativeArraySizeException e) {
            //ловим ошибку, необходимо указать ячейку с именем(е) где будет храниться отчет
            System.out.println("Error");
            //при поимке ошибки, выводим на экран сообщение
        }
        //этот блок кода не дает программе умереть и завершиться после ошибки, мы ловим ошибку и после поимки, программа
        //сможет продолжать выполнять другие инструкции кода.

        System.out.println("Code");
        repo.save(item);
        System.out.println(repo.getItems());
    }
}
