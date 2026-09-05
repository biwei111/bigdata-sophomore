//学生成绩系统
public class methodtest
{
    public static void main(String[] args){
        double [] arr={88.5,76,92,65.5,90};
        double avg1=calcAverage(arr);
        double max=findmax(arr);
        System.out.println("数组平均分"+avg1);
        System.out.println("数组最高分"+max);
        double avg2=calcAverage(90,85,77);
        System.out.println("重载平均分"+avg2);
    }
    //数组
    public static double calcAverage(double [] scores){
        double sum=0;
        for (int i = 0; i < scores.length; i++) {
            double score=scores[i];
            sum+=score;
        }
        return sum/scores.length;
    }
    //重载
    public static double calcAverage(double s1,double s2,double s3){
        return (s1+s2+s3)/3;
    }
    //数组最高分
    public static double findmax(double [] scores) {
        double max=scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>max){
                max=scores[i];
            }
        }
        return max;
    }
}
