public class BonusService {
    public int calcBonus (int amount, boolean isRegistered){
        int percent = isRegistered ? 3 : 1;
        //присваиваем переменной или 3 или 1 если зарегистрирован ,смотрим что указано в параметрах
        int bonus = amount * percent / 100;
        if (bonus >500){
            bonus = 500;
            //присваиваем количество бонусов
        }
        return bonus;
    }
}
