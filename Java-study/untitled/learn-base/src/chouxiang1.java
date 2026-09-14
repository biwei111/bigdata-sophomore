public abstract class chouxiang1 {
    private String name;
    private int age;
    public chouxiang1(){

    }
    public chouxiang1(String name,int age){
        this.name=name;
        this.age=age;
    }
    /*抽象类的学习，此乃父类（抽象类）
    抽象类的特点，不能被实例化，只能被继承
    抽象类可以有普通方法，也可以有抽象方法
    抽象方法必须在抽象类中，不能在普通类中
    抽象方法的格式，public abstract void 方法名();
    抽象方法的特征，没有方法体，只有方法名和参数列表
    抽象方法的特征，必须在抽象类中，不能在普通类中
    抽象方法的特征，必须在子类中被重写*/
    public abstract void method();

    public static void main(String[] args) {
        //抽象类没有办法创建对象
        //chouxiang1 p=new chouxiang1();
        chouxiang3 s = new chouxiang3("罗小黑",18);

    }
}
//子类的存在形式
//1。继承的子类是抽象类
abstract class  chouxiang2 extends  chouxiang1{

}
//2.继承的子类有复写父类的抽象方法
class chouxiang3 extends chouxiang1{
    public chouxiang3(){

    }
    public chouxiang3(String name,int age){
        super(name,age);
    }
    @Override
    public void method(){

    }
}