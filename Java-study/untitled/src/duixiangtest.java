public class duixiangtest {
    public static void main(String[] args){
        //创建手机的对象
        //类名 对象名 = new 类名()
        duixiang p = new duixiang();
        //给类的成员变量赋值
        //对象.成员变量=
        p.brand ="红米";
        p.price=7054.15;
        //行为调用
        p.call();
        p.playgame();
    }
}