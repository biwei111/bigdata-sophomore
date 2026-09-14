public class 工具测试类 {
    public static void main(String[] args) {
        //先定义一个数组
        int[] arr={1,2,3,4,5};
        /*由于构造方法被私有化，所以该工具测试类无法创建对象
        只能用与工具类中的静态方法具有相同返回值类型的变量来调用静态方法
        */
        String str1=工具类.printArray(arr);
        System.out.println(str1);
        double avg=工具类.getAvg(arr);
        System.out.println("数组中的数的总和的平均分："+avg);

    }
}
