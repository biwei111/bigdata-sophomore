public class book1 {
    private String bookname;
    private String author;
    private double price;
    private String isbn;
    public book1(String bookname,String author,double price,String isbn){
        //构造方法
        //this.属性名=形参名
        this.bookname=bookname;
        this.author=author;
        this.price=price;
        this.isbn=isbn;
    }
    //编写showInfo方法
    public void showInfo(){
        String info="图书名称："+bookname+" "+"图书作者："+author+" "+"图书价格："
                +price+" "+"图书编码：" +isbn+"。";
        System.out.println(info);
    }
    public static boolean isSameBook(book1 b1,book1 b2){
        return b1.isbn.equals(b2.isbn);
    }
//    public boolean isSameBook1(book1 b1,book1 b2){
//        return b1.isbn.equals(b2.isbn);
//    }
    public static void main(String[] args){
        book1 b1 = new book1("我在大明长生久视","青红",1800.0,"1453");
        book1 b2 = new book1("日月同错","第年秒",299.8,"6785");
        book1 b3 = new book1("一人之下","米二",988.9,"8765");
        book1 b4 = new book1("一人之下","米二",988.9,"8765");


        b1.showInfo();
        b2.showInfo();
        b3.showInfo();

        boolean res1= isSameBook(b1,b2);
        boolean res2= isSameBook(b3,b4);
        System.out.println(res1);
        System.out.println(res2);
//        一般不要这么写
//        boolean res3=b4.isSameBook1(b1,b2);
//        boolean res4=b2.isSameBook1(b3,b4);
//        System.out.println(res3);
//        System.out.println(res4);
    }
}
