public class Class {
    public static void main(String[] args) {
        int amount = 500;
        boolean isRegistered = true;

        //условный оператор
        int percent;
        if (isRegistered) {
            percent =3;
        } else {
            percent =1;
        }

        //тернарный оператор
        int percent1 = isRegistered ? 3 : 1;
    }

    /* условный и тернарный оператор равны, условия совпадают, вид записи разный.
    тернарный оператор содержит три части (условие isRegistered получая ответ на это условие, переменной percent присваивается одно значение
    если true это 3, если false это 1).
     */
}
