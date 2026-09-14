public class jichengtest {
    public static void main(String[] args) {
        //创建一个哈士奇对象
        哈士奇 h=new 哈士奇();
        //通过对象调用
        h.drink();
        h.eat();
        h.defendHouse();
        h.breakHouse();
        System.out.println("--------------");
        //创建一个布偶猫对象(该类没有编辑方法)
        泰迪 b=new 泰迪();
        b.eat();
        b.drink();
        b.defendHouse();
    }
}
