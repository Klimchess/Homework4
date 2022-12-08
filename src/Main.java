public class Main {
    public static void main(String[] args) {
        // первая задача
        int ageMen = 11;
        if (ageMen >= 18) {System.out.println( "Если возраст человека равен " + ageMen + " то он совершеннолетний" );}
        else  {System.out.println( "Если возраст человека равен " + ageMen + " то он не достиг совершеннолетия нужно немного подождать");}
        // вторая задача
        int temperature = 5;
        if (temperature < 5) {System.out.println("На улице " + temperature + " градусов нужно надеть шапку");}
        else {System.out.println( "На улице " + temperature + " градусов можно идти без шапки");}
        // третья задача
        int speed = 75;
        if (speed > 60) {System.out.println( "Если скорость " + speed + "км/ч придется заплатить штраф");}
        else {System.out.println("Если скорость " + speed + "км/ч можно ездить спокойно");}
        // четвертая задача
        int age = 45;
        if (age > 2 && age < 6) {System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");}
        if (age > 6 && age < 18) {System.out.println("Усли возраст человека равен " + age + " то ему нужно ходить в школу");}
        if (age > 18 && age < 24) {System.out.println("Если возраст человека равен " + age + " то его место в университете " );}
        else {System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");}
        // пятая задача
        int ageKid = 15;
        if (ageKid == 4 && ageKid < 4) {System.out.println ("Если возраст ребенка " + ageKid + " то ему нельзя кататься на атракционе ");}
        if (ageKid >= 5 && ageKid < 14){System.out.println("Если возраст ребенка равен " + ageKid + " можно кататься на атракционе в сопровождении взрослого");}
        else {System.out.println("Если возраст ребенка равен " + ageKid + " то ему можно кататься на атракционе без сопровождения взрослого");}
        // шестая задача
        int trainCarCapacity = 102;
        //System.out.println(trainCarCapacity  + " человека вместимость вагона");
        int seating = 60;
        //System.out.println(seating + " сидячие места");
        int numberOfPassengers = 98;
        int freeSpaceForSitting = seating - numberOfPassengers;
        //System.out.println(freeSpaceForSitting);
        int freeSpaceStanding = trainCarCapacity - numberOfPassengers;
        //System.out.println(freeSpaceStanding);
        if (numberOfPassengers < 60) {System.out.println("В вагоне есть сидячие места = " + freeSpaceForSitting);}
        if (numberOfPassengers >60 && numberOfPassengers < 102) {System.out.println("В вагоне есть стоячие места = " +freeSpaceStanding);}
        else {System.out.println("Вагон уже полностью забит");}
        // седьмая задача
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){System.out.println(one + " наибольшее число");}
        else {
        if (two > three){System.out.println( two + " наибольшее число");}
        else {System.out.println(three + " наибольшее число");}}







    }
}