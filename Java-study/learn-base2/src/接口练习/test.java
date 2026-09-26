package 接口练习;

public class test {
    /*练习：乒乓球运动员 打乒乓球 说英语
    * 乒乓球教练员 叫乒乓球 说英语
    * 篮球运动员 打篮球
    * 篮球教练员 教篮球
    * 多种搭配
    * 我选择了这个搭配
    * 运动员一起 教练员一起 说英语的接口*/
    public static void main(String[] args) {
        ttathlete a1= new ttathlete("马龙",21);
        ttcoach b1= new ttcoach("刘国梁",43);
        bathlete a2= new bathlete("林书豪",31);
        bcoach b2= new bcoach("姚明",51);
        System.out.println(a1.getAge()+","+a1.getName()+"。");
        a1.English();
        a1.study();
        System.out.println(a2.getAge()+","+a2.getName()+"。");
        a2.study();
        System.out.println(b1.getAge()+","+b1.getName()+"。");
        b1.English();
        b1.teach();
        System.out.println(b2.getAge()+","+b2.getName()+"。");
        b2.teach();
    }
}
