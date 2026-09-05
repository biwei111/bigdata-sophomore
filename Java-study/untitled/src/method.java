public class method {
    //方法复习
    public static void main(String[] args) {//main为主方法
        method1();//方法的调用
        method2(0.002,0.001);
        //参数调用
        int sum=method3(10,20);
//        System.out.println(sum);//res被sum调用
        double sum2=method3(2.75,3.58,1.48);
//        System.out.println(sum2);
        double sum3=method3(2.85,3.59,1.54);
        if(sum3>sum2){
            System.out.println("第二个面积大");
        }
        else{
            System.out.println("第一个面积大");
        }
    }
    public static void method1(){
        System.out.println("hello world");
    }
    //带参数的方法调用
    //外方法的参数为形参，主方法的调用语句的括号中就是实参
    //返回值类型可以更改，void外的类型要写return
    public static void method2(double num1,double num2){
        double res1=(num1+num2)*2;
        System.out.println(res1);
    }
    public static int method3(int num3,int num4){
        int res2=num3*num4;
        System.out.println(res2);
        return res2;
    }
    /*求面积，在调用处进行判断（重载，方法名相同，形参参数类型不同,形实参数个数不同，
     与返回值无关）*/
    public static double method3(double num5,double num6,double num7){
        double res3=(num5+num6+num7)*3.14;
        System.out.println(res3);
        return res3;
    }
}
