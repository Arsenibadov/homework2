public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
         friend = (21 / 7 );
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var sumWeight = oneBoxer + twoBoxer;
        System.out.println("Общий вес боксеров " + sumWeight + "кг!");
        var differenceWeight = oneBoxer - twoBoxer;
        System.out.println("Разница в вессе " + differenceWeight + "кг!");

        var weightSubtraction= twoBoxer - oneBoxer;
        System.out.println("Разница в весе " + weightSubtraction + "кг!");
        var divisionWeight = twoBoxer % oneBoxer;
        System.out.println("Разница в весе " + divisionWeight + "кг!");

        var totalHours = 640;
        var normHours = 8;
        var staff = totalHours / normHours;
        System.out.println("Всего работников в компании " + staff );
        staff = staff + 94;
        var newHours =  totalHours / staff;
        System.out.println("Если в компании работает " + staff + " человек,то всего " + newHours + " часа работы может быть поделено между сотрудниками ");





    }
}