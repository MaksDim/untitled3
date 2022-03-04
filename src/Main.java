public class Main {
    public static void main(String[] args) {
        int amount = 1250;
        boolean yes = true;
        int percent;
        if (amount > 1000) {
            percent = 10;
        } else {
            percent = 0;
        }
        int bonus = amount * percent / 1000;
        int fullAmount = bonus + amount;

        System.out.println("Cумма средств на счете " + fullAmount + " Количество бонусов " + bonus);

    }
}

