public class Person {
    String name;
    int age;
    int height;
    double weight;
    private int money;

    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void getInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Лет: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Вес: " + weight);
        System.out.println("Сумма денег: " + money+"\n");
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println(name+": Йехуууу!!!!Oтдыхаю дома");
        } else {
            System.out.println(name+": Работаю");
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
