package 内部类;

public class neibulei {
    //内部类（在类里面再建一个类）
    /*
    内部类是为了处理与外部类不同
     */
    //旧题：描述汽车
    String carname;
    String carcolor;//private
    int carage;
    boolean power;
    public void show1(){
        System.out.println(carage);
        //外部类需要创建内部类对象才能调用
        //且只能在包含内部类的外部类才能创建
        //System.out.println(engineage);
        car c = new car();
        System.out.println(c.engineage);
        c.show2();
    }
    public car get(){
        return new car();
    }
    //这是一个成员内部类
    public class car {
        //车的发动机
        String enginename = "lll";
        int engineage = 1;

        public void show2() {
            System.out.println(enginename);
            System.out.println(carname);
            System.out.println(carcolor);
            //私有也可访问
            System.out.println(power = true);
        }
    }

}
class test{
    public static void main(String[] args) {
        neibulei n = new neibulei();
        n.carage=1;
        n.carname="宾利";
        n.carcolor="black";
        n.show1();
        //public protected外可以这样写
//        neibulei.car c=new neibulei().new car();
        //如果是私有化内部类，可以public inner set/get()方法来调用
        //System.out.println(n.get());
    }
}