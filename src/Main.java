public class Main {
    public static void main(String[] args) {

        //Задание №1
        System.out.println("Задание №1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!!!");
        }
        if (age <= 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил!!!");
        }
        //Задание №2
        System.out.println("Задание №2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек ходит в универ");
        }
        if (age >= 24) {
            System.out.println("Человек ходит на работу");
        }
        int capaciti = 102;
        int seatsCount = 60;
        int otherCount = capaciti - seatsCount; // стоячие места

        int seatsUsed=60;
        int otherUsed=42;
        if (seatsUsed<seatsCount){
            System.out.println("Есть ещё "+(seatsCount-seatsUsed)+ " сидячих мест!");
        }
        if(seatsUsed==seatsCount){
            System.out.println("Сидячих мест нет!");
        }

        if (otherUsed<otherCount){
            System.out.println("Есть ещё "+(otherCount-otherUsed)+ " стоячих мест!");
        }
        if(otherUsed==otherCount){
            System.out.println("Стоячих мест нет!");
        }



    }
}