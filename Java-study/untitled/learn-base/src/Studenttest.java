public class Studenttest {
    public static void main(String[] args){
        //静态方法的类调用（前提不是私有化）
        Student.guild="妖灵会馆";
        //创建一个学生对象（内部参数由构造方法决定）
        Student s1=new Student();
        System.out.println("s1的地址："+s1);
        s1.setname("山新");
        s1.setage(10);
        s1.setgender("女");
        Student s2=new Student("罗小白",10,"女","无限");
        //调用常态方法
        System.out.println("s2的地址："+s2);
        s1.study();
        s1.showInfo();
        s2.study();
        s2.showInfo();
    }
}
