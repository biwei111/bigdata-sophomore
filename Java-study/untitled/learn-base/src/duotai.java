public class duotai  {
    //标准的Javabean类
    private String name="张三";
    private int age;
    //无参构造方法
    public duotai(){

    }
    //有参构造方法
    public duotai(String name,int age){
        this.name=name;
        this.age=age;
    }
    //getter方法
    public String getName(){
        return name;
    }
    //setter方法
    public void setName(String name){
        this.name=name;
    }
    //getter方法
    public int getAge(){
        return age;
    }
    //setter方法
    public void setAge(int age){
        this.age=age;
    }
    //show方法
    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"。");
    }
}
class duotai2 extends duotai  {
    @Override
    public void show() {
        System.out.println("学生的信息为："+getName()+"，年龄："+getAge()+"。");
    }
}
class duotai3 extends duotai{
    @Override
    public void show() {
        System.out.println("教师的信息为："+getName()+"，年龄："+getAge()+"。");
    }
}
class duotai4 extends duotai  {
    @Override
    public void show() {
        System.out.println("管理员的信息为："+getName()+"，年龄："+getAge()+"。");
    }
}