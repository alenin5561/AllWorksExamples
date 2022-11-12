public class Arrays {
    public static void main(String[] args) {

        int[] arr = new int[10];
        //массив из 10 ячеек
        int[] arr1 ={
                11, 22, 33, 12
        };
        //массив с заданными в нем ячейками

        arr[4] = 14;
        arr[6] = 13;
        //задаем значения ячейкам

        System.out.println(arr[3]);
        System.out.println(arr[6]);
        //выводим значения ячеек

        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(arr1));
    }
}
