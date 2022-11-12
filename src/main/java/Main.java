public class Main {
    public static void main(String[] args) {

        //Добавление в массив
        String[] names = {
                "Petya",
                "Anya",
                "Olya",
                "Kolya",
                "Slava"
        };
        String newName = "Stanislav";
        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++){
            tmp[i] = names[i];
        }
        tmp[tmp.length -1] = newName;
        names = tmp;
    }
}
