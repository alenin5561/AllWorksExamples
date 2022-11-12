public class TemperatureService {

    public int getMinDay(int[] temps) {
        int minDay = 0;
        //minDay будет всегда хранить день с минимальной температурой, (минимальная температура по массиву)
        for (int i = 0; i < temps.length; i++) {
            //мы проходим весь массив
            if (temps[i] < temps[minDay]) {
                //указав, что мы идем по всему массиву temps[i] и если он меньше чем то что там уже лежит.
                minDay = i;
                // Мы сохраняем номер дня с минимальной температурой которая лежит в массиве.
            }
        }
        return minDay;
    }

    public int getMinTemper(int[] temps) {
        int minTemper = temps[0];
        for (int t : temps){
            if (t < minTemper){
                minTemper =t;
            }
        }
        return minTemper;
    }
    
}