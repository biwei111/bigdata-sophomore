package 接口练习;
//保护最初类
public abstract class Person {
    private String name;
    private int age;
    public Person() {

    }

    public Person(String name, int age) {
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
}
//运动员
abstract class athlete extends Person{
    public athlete() {
    }

    public athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
//教练员
abstract class coach extends Person{
    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
//乒乓球运动员
class ttathlete extends athlete implements teachen{
    public ttathlete() {
    }

    public ttathlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("乒乓球运动员在打乒乓球。");
    }
    @Override
    public void English(){
        System.out.println("乒乓球运动员在说英语。");
    }
}
//乒乓球教练员
class ttcoach extends coach implements teachen{
    public ttcoach() {
    }

    public ttcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("乒乓球教练员在教乒乓球。");
    }
    @Override
    public void English(){
        System.out.println("乒乓球教练员在说英语。");
    }
}
//篮球运动员
class bathlete extends athlete{
    public bathlete() {
    }

    public bathlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("篮球运动员在打篮球。");
    }
}
//篮球教练员
class bcoach extends coach{
    public bcoach() {
    }

    public bcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("篮球教练员在教篮球。");
    }
}
