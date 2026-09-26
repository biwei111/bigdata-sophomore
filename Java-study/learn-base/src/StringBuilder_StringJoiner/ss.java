package StringBuilder_StringJoiner;

import java.util.StringJoiner;

public class ss {
    //补充：StringBuilder类的使用
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //添加append
        sb.append("[hello,");
        sb.append("world!]");
        System.out.println(sb);
        //插入insert
        sb.insert(7,"fuking,");
        sb.insert(14,"the,");
        System.out.println(sb);
        //改字符setCharAt
        sb.setCharAt(1,'H');
        sb.setCharAt(7,'F');
        sb.setCharAt(14,'T');
        sb.setCharAt(18,'W');
        System.out.println(sb);
        //删除一段delete
        sb.delete(7,14);
        System.out.println(sb);
        //反转reverse
//        sb.reverse();
//        System.out.println(sb);
        //替换replace
        sb.replace(1,6,"HELLO");
        System.out.println(sb);
        //转为字符串
        System.out.println(sb.toString());
        //使用StringJoiner
        StringJoiner sj = new StringJoiner(" ");
        sj.add("[").add("苹果").add("香蕉").add("]");
        System.out.println(sj);
    }
}
