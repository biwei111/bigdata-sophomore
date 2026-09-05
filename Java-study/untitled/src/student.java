public class student {
    private String id;
    private String name;
    private int age;
    private double [] scores;

    public student(String id,String name,int age,double [] scores){
        this.id=id;
        this.name=name;
        this.age=age;
        this.scores=scores;
    }
    public double getTotal(){
        double sum =0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        return sum;
    }
    public double avgTotal(){
        return getTotal()/scores.length;
    }
    public void showInfo(){
        String level;
        double avg=avgTotal();
        //根据平均分判断
        if(avg>=90){
            level="优秀";
        }else if(avg>=80){
            level="良好";
        }else if(avg>=70){
            level="一般";
        }else if(avg>=60){
            level="合格";
        }else{
            level="不合格";
        }
        System.out.printf("学号:%s 姓名:%s 年龄:%d |" +
                        " 总分:%.2f 平均分:%.2f 等级:%s%n",
                id, name, age, getTotal(), avg, level);
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
}
