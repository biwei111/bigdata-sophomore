public class duotaitwo {
    public static void main(String[] args) {
        AnimalTwo a=new DogTwo();
        //多态调用成员变量，编译看左边，运行也看左边（父类变量）
        System.out.println(a.name);
        //多态调用成员方法，编译看左边，运行看右边（子类方法）
        a.show();
        //弊端：不能调用子类的特有成员方法
        //a.defend();
        //解决方法：使用强制类型转换，调用子类的特有成员方法
        //注意不能瞎转换，否则会报错
        //这行代码会报错，因为a是AnimalTwo类型，不能直接强制类型转换为DogTwo类型
//        DogTwo d=(DogTwo)a;
//        d.defend();
        //解决方法：使用instanceof关键字，判断是否是子类对象
        if(a instanceof DogTwo d){
            d.defend();
       }else{
            System.out.println("a不是DogTwo类型，不能调用defend方法。");
        }
    }
}
class AnimalTwo{
    String name="动物";
    int age=17;
    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"。");
    }
}
class DogTwo extends AnimalTwo{
    String name="旺财";
    int age=9;
    @Override
    public void show(){
        System.out.println("狗的信息为："+this.name+"，年龄："+this.age+"。");
    }
    public void defend(){
        System.out.println("狗在防御。");
    }
}
