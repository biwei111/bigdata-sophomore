import java.util.Scanner;

public class String1 {
    //字符串对象学习
    public static void main(String[] args) {
        //创建字符串对象
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        //bool比较
        boolean res = s1.equals(s2);
        boolean res2 = s1.equalsIgnoreCase(s3);
        System.out.println(res);
        System.out.println(res2);
        //输入相同的字符串，跟直接复制的字符串比较，也是不一样
        Scanner str1 = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        str1.next();
        String str2 ="abc";
        System.out.println(str1.equals(str2));
    }
}
