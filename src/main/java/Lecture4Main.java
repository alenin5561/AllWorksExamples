public class Lecture4Main {
    public static void main(String[] args) {
        //обозначили точку входа, для выполнения программы
        Lecture4CalcService service = new Lecture4CalcService();
        //Создали переменную в которой лежат объекты класса,теперь мы можем обращаться к функциям которые лежат внутри этого класса через переменную
        int myMax = service.max(40,50);
        //завели переменную, чтобы сохранить результат выполнения функции.
        System.out.println(myMax);
        //Вывели результат на экран.

        //Так же мы можем не кладя функцию в переменную, вывести значение функции на экран.
        System.out.println(service.max(30,40));
    }
}
