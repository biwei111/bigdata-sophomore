public class jiekou{
    public static void main(String[] args) {
        rabbit rabbit = new rabbit("兔子", 1);
        System.out.println(rabbit.getName()+","+rabbit.getAge());
        rabbit.eat();
        fish fish = new fish("鱼", 1);
        System.out.println(fish.getName()+","+fish.getAge());
        fish.swim();
        fish.eat();
        dog dog = new dog("狗", 1);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.swim();
        dog.eat();
    }
}
abstract class animal{
    private String name;
    private int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();
    //由于子类中有的不会游泳，所以不能在父类里写
    //故我要创建一个接口，叫swim
}
class rabbit extends animal{
    public rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃");
    }
}
class fish extends animal implements swim{
    public fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("鱼在游泳");
    }

    @Override
    public void eat() {
        System.out.println("鱼在吃");
    }
}
class dog extends animal implements swim{
    public dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
    @Override
    public void eat() {
        System.out.println("狗在吃");
    }
}