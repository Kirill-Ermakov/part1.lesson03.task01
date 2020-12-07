//Умножение

    package VTB.ermakov;

public class Main {

    public static void main(String[] args) {
        double price = 42.50;
        int volume = 50;

        double money = price*volume;
        System.out.println(money);


    }
}


//Зарплата

        package VTB.ermakov;

public class Main {

    public static void main(String[] args) {
        int zp = 70000;
        int nalog1 = 13;
        int nalog2 = 100;
        int money1 = zp / nalog2;
        int money2 = money1 * nalog1;
        int zarplata = zp - money2;
        System.out.println(zarplata);


    }
}

//Час
        package VTB.ermakov;

public class Main {

    public static void main(String[] args) {
        int vvodnaia = 3600;
        int minuta = 60;
        int sekund = 60;
        int chas = minuta * sekund;
        int itog = vvodnaia / chas;

        System.out.println(itog);


    }
}
