package 内部类;

import org.w3c.dom.ls.LSOutput;

public class train2 {
    /*静态内部类(静态只有内部类)
    跟静态方法一样，只能访问外部类里的静态属性
    其他属性则需要创建对象
    非静态方法调用对象的格式为：外.内 对象名= new 外.内();*/
    String trainname="复兴号";
    int trainage=14;
    static String traincolor="白色";

    static class engine{
        int engineage=12;
        int enginewatt=100;
        //定义两个方法
        public void show1(){
            System.out.printf("engine的年龄为：%d,功率为：%d"
                    ,engineage,enginewatt);
            //静态变量直接调用
            System.out.println(traincolor);
            //非静态变量则需要在当前方法创建对象
            train2 t =new train2();
            System.out.println(t.trainage);
        }
        public static void show2(){
            //静态变量直接调用
            System.out.println(traincolor);
            //非静态变量则需要在当前方法创建对象
            train2 t =new train2();
            System.out.println(t.trainage);
        }
    }
}
class test1{
    public static void main(String[] args) {
        //静态方法调用外.内.方法名();
        train2.engine.show2();
        //非静态方法调用适用对象
        train2.engine e =new train2.engine();
        e.show1();
    }
}
