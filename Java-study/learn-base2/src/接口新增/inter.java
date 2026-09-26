package 接口新增;

public interface inter {
    //1.default(默认方法)
    //Java8新增的默认方法，接口中可以有默认方法
    //默认方法可以有实现，也可以没有实现
    //默认方法的实现不能被实现类重写
    //默认方法可以被调用，也可以不被调用
    //多个接口默认方法重名时，实现类可以重写默认方法
    default void show(){
        //这里不用写
    }
    //引入抽象方法来对比
    //强制重写
    public abstract void method();
    //2.静态方法
    static void sta(){
        System.out.println("接口的静态方法");
    }
    //3.私有化
    private void pvi(){
        System.out.println("私有化");
        pvi1();
    }
    private void pvi1(){
        System.out.println("私有化1");
    }
}
