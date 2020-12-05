package pkg_task2;

public class Main {
    public static void main(String[] args) {

        Animals animal1 = Animals.DOG;
        Animals animal2 = Animals.CAT;
        Animals animal3 = Animals.COW;
        Animals animal4 = Animals.WOLF;
        Animals animal5 = Animals.HORSE;

        animal2.setAge(1);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal5);
    }
}
