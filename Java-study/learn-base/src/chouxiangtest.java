public class chouxiangtest {
    public static void main(String[] args) {
        frog f=new frog("小绿",1);
        System.out.println(f.getName()+f.getAge());
        f.drink();
        f.eat();
    }
}
abstract class ani{
    private String name;
    private int age;
    public ani(){

    }
    public ani(String name,int age){
        this.name=name;
        this.age=age;
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
    public void drink(){
        System.out.println("动物在喝水。");
    }
    public abstract void eat();
}
class frog extends ani{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子。");
    }
}
class DO extends ani{
    public DO() {
    }

    public DO(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头。");
    }
}
