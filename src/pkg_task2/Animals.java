package pkg_task2;

enum Animals {
    CAT(2),DOG(3),TIGER(3),WOLF(4),COW(2),HORSE(5);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + name() + ", age: " + age;
    }
}
