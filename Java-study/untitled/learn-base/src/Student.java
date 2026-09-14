public class Student{
    //面向对象进阶
    //static静态方法学习
    private String name;
    private int age;
    private String gender;
    //添加静态属性（所有对象共享）
    private static String teacher;
    static String guild;
    //构造方法
    public Student(){
        //空参构造
    }
    //this指针
    public Student(String name,int age,String gender,String teacher){
        this.name=name;
        this.age=age;
        this.gender=gender;
        Student.teacher =teacher;
        //我让会馆这个成员变量由类来调用(前提不是私有化)
        //Student.guild=guild;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getgender(){
        return gender;
    }
    //行为方法
    public void study(){
        System.out.println(name+"在学习");
    }
    public void showInfo(Student this){//里面有隐藏的this指针(Student this)
        System.out.println("this的地址："+this);//
        System.out.println("姓名："+name+"，"+"年龄："+age+"，"
                +"性别："+gender+"，"+"老师："+teacher+"，"
                +"会馆："+guild+"。");
    }
}