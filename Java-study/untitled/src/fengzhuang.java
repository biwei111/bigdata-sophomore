public class fengzhuang {
    //private 私有化修饰符
    private int age=24;
    private String name="里斯";
    //获取方法
    public void setage(int a){
        if(age>=18&&age<=50){
            age=a;
        }else{
            System.out.println("年龄太大或太小");
        }
    }
    //名字（this关键字）
    public void method(){
        String name= "张三";
        System.out.println(name);
        System.out.println(this.name);
    }
    //获取方法
    public int getage(){
        return age;
    }
}
