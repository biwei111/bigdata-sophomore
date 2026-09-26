public class Animal3 {
    //练习：人饲养动物.两者分开定义
    private int age;
    private String color;
    public Animal3(){

    }
    public Animal3(int age,String color){
        this.age=age;
        this.color=color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something){
        System.out.println("动物在吃"+something);
    }
}

class Dog2 extends Animal3{
    //属性父类已经有了
    //构造函数
    public Dog2(int age, String color) {
        super(age, color);
    }

    public Dog2() {
    }

    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"的狗的两条前腿" +
                "死死地抱着"+something+"猛吃。");
    }
    public void lookhome(){
        System.out.println("狗在看家。");
    }
}
class Cat2 extends Animal3{
    public Cat2() {
    }

    public Cat2(int age, String color) {
        super(age, color);
    }
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"的猫咪着眼睛吃着"+something+"。");
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠。");
    }
}

class Duck extends Animal3{
    public Duck(){

    }
    public Duck(int age, String color) {
        super(age, color);
    }
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在水里吃着"+something+"。");
    }
    public void swimming(){
        System.out.println("鸭子在水里游泳！");
    }
}

class test{
    public static void main(String[] args) {
//        Person3 p1=new Person3("张三",25);
//        Dog2 d=new Dog2(3,"黄色");
//        p1.keepPet(d,"骨头");
//        d.lookhome();
//        Person3 p2=new Person3("李四",29);
//        Cat2 c=new Cat2(3,"白色");
//        p2.keepPet(c,"鱼");
//        c.catchMouse();
        Person3 p=new Person3("杰",25);
        Dog2 d=new Dog2(3,"黄色");
        p.keepPet(d,"骨头");
        d.lookhome();
        Cat2 c=new Cat2(3,"白色");
        p.keepPet(c,"鱼");
        c.catchMouse();
        Duck d1=new Duck(4,"黄色");
        p.keepPet(d1,"虾米");
        d1.swimming();
    }
}


