import java.util.Locale;

public class StringNames {
    public static void main(String[] args) {
        String name = "Ksusha";
        int x = name.length();

        System.out.println(x);
        System.out.println(name.charAt(5));
        //Первое значение длины строки это 0,а последнее значение это длинна строки -1 : length -1
        // (т.е. если длина строки 6 то последнее значение равно 5)
    }
}
