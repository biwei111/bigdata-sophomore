package 内部类;

public class 局部内部类 {
    /*是定义在方法中的，类似于局部变量(final private也能修饰)
    * 外界无法直接使用局部内部类，需要在方法内部创建对象并使用
    * 该类可以直接访问外部类的成员，也能访问方法内局部变量*/

    public void display(){
        int a=10;
        class inner{
            int a=5;
            String name;
            int age;
            public void me1(){
                System.out.println(this.a);
                System.out.println(a);
                System.out.println("非静态");
            }
            public static void me2(){
                System.out.println("静态");
            }
        }
        inner i = new inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.me1();
        inner.me2();
    }
}
class name{
    public static void main(String[] args) {
        局部内部类 o=new 局部内部类();
        o.display();
    }
}