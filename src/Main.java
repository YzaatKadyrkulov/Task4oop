
public class Main {
    public static void main(String[] args) {
        /**
         * TASK 4 ГҮЛ ДЕГЕН КЛАСС ТҮЗҮҢҮЗ.
         * ПОЛЕЛЕРИ (FLOWERNAME, FRESHNESS, PRICE)
         * МЕЙНДЕН АНЫН БИР НЕЧЕ ОБЪЕКТТЕРИН ТҮЗҮҢҮЗ,
         * МААНИЛЕРИН БЕРИНИЗ.
         * 1) ГҮЛДҮН МАССИВИН ТҮЗОБУЗ, ГУЛДОРДУ ОШОЛ
         * МАССИВКЕ САЛЫБЫЗ.
         * МЕТОД ТУЗУНУЗ, ПАРАМЕТРИНЕ ГУЛДОЛДУН
         * МАССИВИН АЛСЫН, АНАН МЕТОД ЭН КЫМБАТ ГУЛДУН
         * БААСЫН КАЙТАРСЫН. МЕЙНДЕН ОШОЛ МЕТОДДУ
         * ЧАКЫРЫНЫЗ
         * ГҮЛДҮ АНЫН ЖАҢЫЛЫГЫНА (СВЕЖЕСТЬ) КАРАТА
         * СОРТТОЙБУЗ.
         * ГҮЛДҮ АТЫНА ЖАРАША СОРТТОЙБУЗ.
         */

        Flowers4[] flower = {new Flowers4("Daisy", 7,120 ),
                new Flowers4("Rose", 4, 100),
                new Flowers4("Lily", 3,112),
        };
        System.out.print("MaxPrice: ");
        Flowers4.method(flower);
        Flowers4.getFreshestFlowerName(flower);
        String freshestFlowerName =  Flowers4.getFreshestFlowerName(flower);
        System.out.println("\nThe freshest flower is: " + freshestFlowerName);


    }
}
