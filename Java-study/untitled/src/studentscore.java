//学生成绩统计程序
import java.util.Scanner;

public class studentscore {
    public static void main(String[] args){
        //统计五位学生的成绩，求得最高分，最低分和平均分
        Scanner sc=new Scanner(System.in);
        //用数组存储五位学生的成绩
        double[] scores=new double[5];
        //循环输入并遍历出五位同学的成绩
        for(int i=0;i<5;i++){
            System.out.println("第"+(i+1)+"位同学的成绩为：");
            scores[i]=sc.nextDouble();
        }
        //将最高分，最低分和平均分初始化为第一个元素的成绩
        double max=scores[0];
        double min=scores[0];
        double sum=0;
        //对成绩的高低进行循环判断
        for(int i=0;i<5;i++){
            sum+=scores[i];
            if(scores[i]>max){
                max=scores[i];
            }
            if(scores[i]<min){
                min=scores[i];
            }
        }
        //计算平均分
        double avg=sum/scores.length;
        //输出最高分，最低分和平均分
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
        System.out.println("平均分为："+avg);
        System.out.println("总分为："+sum);
        //计算成绩点数
        double count=0;
        for(int i=0;i<5;i++){
            count=(double)(scores[i]/10);
            System.out.println("第"+(i+1)+"位同学的成绩点数为："+count+"分");
        }
        //关闭扫描器
        sc.close();
    }
}
