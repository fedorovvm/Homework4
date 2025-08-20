
public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age+", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " +age+", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задание 2
        int degrees=6;
        if (degrees < 5) {
            System.out.println("На улице "+degrees+" градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице "+degrees+" градусов, можно идти без шапки.");
        }
        //Задание 3
        int speed=60;
        if (speed > 60) {
            System.out.println("Если скорость "+speed+", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно.");
        }
        //Задание 4
        int ageMan = 25;
        if (ageMan >= 2 && ageMan <= 6 ) {
            System.out.println("Если возраст человека равен " +ageMan+", то ему нужно ходить в детский сад.");
        }
        if (ageMan >= 7 && ageMan <= 17 ) {
            System.out.println("Если возраст человека равен " +ageMan+", то ему нужно ходить в школу.");
        }
        if (ageMan >= 18 && ageMan <= 24 ) {
            System.out.println("Если возраст человека равен " +ageMan+", то ему нужно ходить в университет.");
        }
        if (ageMan > 24 ) {
            System.out.println("Если возраст человека равен " +ageMan+", то ему нужно ходить на работу.");
        }
        //Задание 5
        int ageChild = 5;
        if (ageChild < 5 ) {
            System.out.println("Если возраст ребенка равен " +ageChild+", то ему нельзя кататься на аттракционе.");
        }
        if (ageChild >= 5 && ageChild < 14 ) {
            System.out.println("Если возраст ребенка равен " +ageChild+", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageChild > 14 ) {
            System.out.println("Если возраст ребенка равен " +ageChild+", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        //Задание 6
        int peoplesInVan = 59;
        if (peoplesInVan < 60 ) {
            System.out.println("В вагоне есть сидячее место.");
        }
        else if (peoplesInVan >= 60 && peoplesInVan < 102 ) {
            System.out.println("В вагоне есть стоячее место.");
        }
        else {
            System.out.println("В вагоне нет мест.");
        }
        //Задание 7
        int one=1;
        int two=2;
        int three=3;
        if (one>two && one>three) {
            System.out.println(one);
        }
        else if (two>one && two>three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
      }
}