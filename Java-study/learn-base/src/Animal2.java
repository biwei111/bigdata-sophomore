public class Animal2 {
    public static void main(String[] args) {
        //这是继承，也是多态
        Animal h=new 哈士奇();
        Animal t=new 泰迪();
        h.eat();
        h.drink();
        t.eat();
        t.drink();
    }
}
