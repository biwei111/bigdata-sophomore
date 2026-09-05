import java.util.ArrayList;
import java.util.Scanner;
public class studentscore2 {
    //此时加static是为给所有的静态方法提供输入功能
    static Scanner sc =new Scanner(System.in);
    //此时录入信息
    public static student addstudent(){
        String id;
        while(true){
            System.out.println("请输入学号（9位）");
            id=sc.next();
            if(id.length()==9){
                break;
            }else{
                System.out.println("输入的学号错误，请重新输入！");
            }
        }
        System.out.println("请输入姓名：");
        String name;
        name=sc.next();
        System.out.println("请输入年龄：");
        int age;
        age=sc.nextInt();
        //输入三科成绩，用动态数组存储信息
        double[] arr =new double[3];
        System.out.println("输入语文，数学，英语三科成绩：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextDouble();
        }
        //返回student类
        return new student(id,name,age,arr);
    }
    public static void findstudent(ArrayList<student>list,String tname){
        //创建一个布尔类型，用来判断学生是否被找到,初始值为没有
        boolean findflag=false;
        for (int i = 0; i < list.size(); i++) {
            student s = list.get(i);//i指代下标
            if(s.getName().equals(tname)){
                System.out.println("查询成功，以下是为"+tname+"同学的信息：");
                s.showInfo();
                findflag=true;//查找成功
            }
        }
        if(!findflag){//说明上述第一行代码都没跑通
            System.out.println("没有这个学生的信息。");
        }
    }
    //计算全班平均分
    public static double getavg(ArrayList<student>list){
        double allsum=0;
        for (int i = 0; i < list.size(); i++) {
            student s=list.get(i);
            allsum+=s.getTotal();
        }
        return allsum/((list.size())*3.0);
    }
    //正常主方法
    public static void main(String[] args){
        //创建集合，储存学生的信息，并通过如此调用上述静态方法
        ArrayList<student> stulist=new ArrayList<>();
        //录入学生（限定三位），并使用addstudent()方法
        for (int i = 0; i < 3; i++) {
            System.out.println("录入第"+(i+1)+"位同学");
            student stu = addstudent();
            stulist.add(stu);
        }
        //输出全部学生信息(遍历完后用student类里的sh)
        System.out.println("\n===全部学生信息===");
        for (int i = 0; i < stulist.size(); i++) {
            student stu = stulist.get(i);
            stu.showInfo();
        }
        //平均分
        System.out.printf("\n全班平均分为：%.2f%n",getavg(stulist));
        //查找学生
        System.out.println("\n输入要查找的学生姓名：");
        String sname=sc.next();
        findstudent(stulist,sname);
    }
}
