public class Animal {
    //继承所有动物的父类
    public Animal(){

    }
    //行为方法(private无法被其它类调用)
    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}
//class Cat extends Animal{
//    //继承所有猫的父类
//    public Cat(){
//
//    }
//    public void catchMouse(){
//        System.out.println("抓老鼠");
//    }
//}
class Dog extends Animal{
    //继承所有狗的父类
    public Dog(){

    }
    public void defendHouse(){
        System.out.println("保护家");
    }
}
class 哈士奇 extends Dog{
    public 哈士奇(){

    }
    public void eat(){
        System.out.println("吃饭,吃狗粮");
    }
    public void breakHouse(){
        System.out.println("哈士奇在拆家里的东西！");
    }
}
class 泰迪 extends Dog{
    public 泰迪(){

    }
    public void eat(){
        System.out.println("吃狗粮，吃骨头");
    }
}
