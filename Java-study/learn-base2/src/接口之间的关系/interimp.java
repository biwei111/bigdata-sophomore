package 接口之间的关系;

public class interimp implements inter3{
    //继承了最下面的接口，所有的抽象方法都要重写
    @Override
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }

}
