public class Conditioner {
    public int maxTemperature = 30;
    public int minTemperature = 10;
    public int currentTemperature = minTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

//    public Conditioner (int maxTemperature, int minTemperature){
//        this.minTemperature = minTemperature;
//        his.currentTemperature = minTemperature;
//    }
    //Конструктор позволяет делать объект параметризорованным.

    public void setCurrentTemperature(int newCurrentTemperature) {

        if (newCurrentTemperature < minTemperature) {
            return;
        }
        if (newCurrentTemperature > maxTemperature) {
            return;
        }
        currentTemperature = newCurrentTemperature;
    }

    public void setMaxTemp () {
        currentTemperature = maxTemperature;
    }
}
