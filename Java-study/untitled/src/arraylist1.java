import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        //与数组不同，集合长度可变，基本数据类型则只能变成包装类了才能存进集合里面
        //由于其数据类型不是直接赋予的，就需要泛型<>来锁定期中存储数据的类型
        ArrayList<String> list = new ArrayList<>();
        //这样就只能储存字符串类型的数据了
        //功能：增删改查，获取长度
        //1.增
        boolean res1 = list.add("小黑");
        boolean res2 = list.add("无限");
        list.add("鹿野");
        list.add("若水");
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(list);
        //2.删
        boolean res3 = list.remove("无限");
        //此时结果只剩小黑和鹿野了
        String res4 = list.remove(1);
//        System.out.println(res3);
//        System.out.println(res4);
        System.out.println(list);
        //3.改set
        String res5 =list.set(0,"鸠老");
        System.out.println(list);
        //4.查get
        String res6=list.get(0);
        System.out.println(res6);
        //int size(),获取长度
        System.out.println(list.size());
        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str1=list.get(i);
            System.out.println(str1);
        }
    }
}
