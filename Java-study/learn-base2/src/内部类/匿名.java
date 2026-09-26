package 内部类;

public class 匿名 {
    /*隐藏了名字的内部类
    new 类名或接口名(){
        重写方法
    }     */
    public static void main(String[] args) {
        //public class Student implements swim{}
        new swim(){
            @Override
            public void swim(){
                System.out.println("重写的游泳方法");
            }
        };
        method(
            new animal(){
                @Override
                public void eat(){
                    System.out.println("重写的吃饭方法");
                }
            }
        );
    }
    public static void method(animal a){
        a.eat();
    }
}
abstract class animal{
    public abstract void eat();
}
//本人建议不使用，实在不方便