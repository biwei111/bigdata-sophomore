package 接口新增;

public class test implements inter,inter1{
    @Override
    public void method(){
        System.out.println("这里是method");
    }
    @Override
    public void show(){
        System.out.println("show已调用");
    }
    //类与接口的方法重名
    public static void sta(){
        System.out.println("类的静态方法");
    }
}

class interimp{
    public static void main(String[] args) {
        //创建test类对象
        test t= new test();
        //默认方法
        t.show();
        //抽象方法
        t.method();
        //类的静态方法
        test.sta();
        //接口的静态方法
        inter.sta();
        //私有化（只能在接口调用）
    }
}
