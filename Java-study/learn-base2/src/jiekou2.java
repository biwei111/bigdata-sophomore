import java.util.Scanner;

public class jiekou2 {
    public static void main(String[] args) {
        System.out.println(Inter.a);
        //由于权限修饰符里头有final，所以a不能被修改
        //Inter.a=20;
        Interimp1 i = new Interimp1();
        i.method1();

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
class Interimp1 implements Inter,inter1{
    @Override
    public void method1(){
        System.out.println("method");
    }
    @Override
    public void method2(){
        System.out.println("method2");
    }
    @Override
    public void method3(){
        System.out.println("method3");
    }
    @Override
    public void method4(){
        System.out.println("method4");
    }
    @Override
    public void method5(){
        System.out.println("method5");
    }
    @Override
    public void method6(){
        System.out.println("method6");
    }

}
