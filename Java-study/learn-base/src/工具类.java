public class 工具类 {
    //私有化构造方法
    private 工具类(){

    }
    //静态方法（拼接数组，返回字符串）
    public static String printArray(int[] arr){
        //StringBuilder
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    //算数组中的数的总和的平均分
    public static double getAvg(int[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
