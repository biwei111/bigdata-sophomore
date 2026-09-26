public class duotaitest {
    public static void main(String[] args) {
        //原先的调用模式
        duotai d2=new duotai2();
        d2.setName("罗小黑");
        d2.setAge(10);
        //d2.show();
        register(d2);
        duotai3 d3=new duotai3();
        d3.setName("无限");
        d3.setAge(344);
        //d3.show();
        register(d3);
        duotai4 d4=new duotai4();
        d4.setName("老君");
        d4.setAge(2400);
        //d4.show();
        register(d4);
        System.out.println("-----------------");
        //多态的体现
        duotai p=new duotai2();
        /*以下比较特殊的情况，方法属于父类，setName(Age)也确实在父类那，
        但被子类的方法调用了getName(Age)方法
        故最终运行的是子类的show方法被调用时，会出现被赋予的姓名和年龄显示在控制台
        所以调用成员方法的编译看左边，运行看右边不适用于这里*/
        p.setName("罗根");
        p.setAge(10);
        register(p);
        p=new duotai3();
        p.setName("玄离");
        p.setAge(408);
        register(p);
        p=new duotai4();
        p.setName("炎帝");
        p.setAge(3000);
        register(p);

    }
    public static void register(duotai e){
        e.show();//调用指定子类的show方法
        //调用哪一个子类的show方法，取决于其在其对象被那个子类调用
    }
}
