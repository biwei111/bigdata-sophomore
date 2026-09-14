public class final1 {
    //final修饰符：类不能被继承，方法不能被重写，变量不能多次赋值
    public static void main(String[] args) {
        //基本数据类型经过修饰后其中的值不能改变
        //但是引用数据据类型是地址值不能变，数据可以变
        final int []arr={1,2,3,4,5};
        arr[0]=10;
        arr[1]=9;
    }
}

class fu1 {
    final int a = 10;

    public final void method() {
        System.out.println(a);
    }

    public final void show() {
        System.out.println("final的show方法。");
    }
}

class zi1 extends fu1{
    int a = 8;
    //加上final修饰符后就不能被重写
//    @Override
//    public void method(){
//        System.out.println(a);
//    }

}

