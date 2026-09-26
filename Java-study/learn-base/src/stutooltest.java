import java.util.ArrayList;
public class stutooltest {
    //目的：创建一个集合，存储学生的成绩
    //并调用工具类来获取学生成绩中的最高分
    public static void main(String[] args) {
        //先定义一个集合，存储学生的信息
        ArrayList<xuesheng> stuList=new ArrayList<>();
        //创建三个学生类
        xuesheng stu1=new xuesheng("路飞",19,"男");
        xuesheng stu2=new xuesheng("李四",20,"女");
        xuesheng stu3=new xuesheng("王五",18,"男");
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        //调用stutool工具类来获取学生成绩中的最高分
        double maxage=stutool.getmaxage(stuList);
        System.out.println("学生成绩中的最大年龄：" +maxage);
    }
}
