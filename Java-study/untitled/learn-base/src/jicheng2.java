public class jicheng2 {
    public static void main(String[] args) {
        //由于父类中的构造方法无法被子类继承
        //所以子类必须编写构造方法
        //成员变量都可以继承
        zi z=new zi("罗小黑",10,"众生之门");
        System.out.println("姓名："+z.name+"，"+"年龄："+z.age+"，"+
                "游戏："+z.game+"。");
        zi z2=new zi();
        z2.zishow();
        z2.lunch();
        //方法重写（用父类创建子对象时，调用相同方法，会被覆盖）
        fu f1=new fu();
        f1.drink();//喝水，吃肉。
        fu f2=new zi();
        f2.drink();//喝酒，吃菜。
    }
}
class fu{
    String name="上古凶兽";
    int age;
    public fu(){

    }
    public fu(String name,int age){
        this.name =name;
        this.age=age;
    }
    public void drink(){
        System.out.println("喝水，吃肉。");
    }
}
class zi extends fu{
    String game;
    String name="玄离";
    public zi(){
        super();
    }
    public zi(String name,int age,String game){
        this.name=name;
        this.age=age;
        this.game=game;
    }
    public void zishow(){
        String name = "罗根";
        System.out.println(name);//本方
        System.out.println(this.name);//本类
        System.out.println(super.name);//父类
    }
    @Override
    public void drink(){
        System.out.println("喝酒，吃菜。");
    }
    public void lunch(){
        System.out.println("凶兽"+name+"在吃午饭。");
        System.out.println("与清凝聊天。");
        this.drink();
        super.drink();
    }
}