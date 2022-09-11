public class Main {
    public static void main(String[] args) {
       // Задача 1
       System.out.println("Задача 1");
       var dog = 8.0;
       System.out.println(dog);
       var cat = 3.6;
       System.out.println(cat);
       var paper = 763789;
       System.out.println(paper);

       // Задача 2
       System.out.println("Задача 2");
       dog = dog + 4;
       System.out.println(dog);
       cat = cat + 4;
       System.out.println(cat);
       paper = paper + 4;
       System.out.println(paper);

       // Задача 3
       System.out.println("Задача 3");
       dog = dog - 3.5;
       System.out.println(dog);
       cat = cat - 1.6;
       System.out.println(cat);
       paper = paper - 7639;
       System.out.println(paper);

       // Задание 4
       System.out.println("Задание 4");
       var friend = 19;
       System.out.println(friend);
       friend = friend + 2;
       System.out.println(friend);
       friend = friend / 7;
       System.out.println(friend);


       // Задание 5
       System.out.println("Задание 5");
       var frog = 3.5;
       System.out.println(frog);
       frog = frog * 10;
       System.out.println(frog);
       frog = frog / 3.5;
       System.out.println(frog);
       frog = frog + 4;
       System.out.println(frog);

       // Задание 6
       System.out.println("Задание 6");
       var firstBoxerWeight = 78.2;
       var secondBoxerWeight = 82.7;
       var boxersWeight = firstBoxerWeight + secondBoxerWeight;
       System.out.println("Общий вес двух бойцов " + boxersWeight + " кг");
       var diffrence1InWeight = secondBoxerWeight - firstBoxerWeight;
       System.out.println("Разница в весе боцов " + diffrence1InWeight + " кг");

       // Задание 7
       System.out.println("Задание 7");
       var diffrence2InWeight = secondBoxerWeight - firstBoxerWeight;
       System.out.println("Разница в весе бойцов (1 способ) " + diffrence2InWeight + " кг");
       var diffrence3InWeight = secondBoxerWeight % firstBoxerWeight;
       System.out.println("Разница в весе бойцов (2 способ) " + diffrence2InWeight + " кг");

       // Задача 8
       System.out.println("Задание 8");
       var totalTimeWork = 640;
       var timeOneWork = 8;
       var totalWorkers = totalTimeWork / timeOneWork;
       System.out.println("Всего работников в компании - " + totalWorkers + " человек");

       var total2Workers = totalWorkers + 94;
       var total2TimeWork = total2Workers * 8;
       System.out.println("Если в компании работает " + total2Workers + " человека, то всего " + total2TimeWork + " часа работы может быть поделено между сотрудниками");
    }
}