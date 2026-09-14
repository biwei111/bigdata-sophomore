public class Student2 extends Person {
    public Student2(){
        super();//不写也有（虚拟机），写就必须在第一行
        System.out.println("子类的无参构造");
    }
    public Student2(String name,int age){
        super(name,age);

    }
}
