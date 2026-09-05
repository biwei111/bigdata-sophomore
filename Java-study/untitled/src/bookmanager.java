import java.util.Scanner;//导入键盘输入包

public class bookmanager {
    public static void main(String[] args) {//使用main方法
        Scanner sc = new Scanner(System.in);
        //书的数量。用数组来储存
        book [] array=new book[10];
        int count=0;//记录当前实际存了几本，初始为零，记录制为下标

        while(true){//图书管理系统的页面编辑
            System.out.println("=====图书管理系统=====");
            System.out.println("1.添加图书");
            System.out.println("2.查询全部图书(包括价格)");
            System.out.println("3.根据编号查图书(包括价格)");
            System.out.println("4.全部图书价格");
            System.out.println("5.删除图书");
            System.out.println("0.退出系统");
            System.out.println("请输入功能选择：");
            int op=sc.nextInt();

            //选择开始
            switch (op){
                case 1:
                    if(count>=array.length){//超出范围
                        System.out.println("图书储存已满！不可添新书！");
                        break;
                    }
                    System.out.println("输入图书编号");
                    int bid=sc.nextInt();//next为换行
                    System.out.println("输入图书书名：");
                    String bname = sc.next();
                    System.out.println("输入图书作者：");
                    String bauthor = sc.next();
                    System.out.println("输入图书价格：");
                    double bprice= sc.nextDouble();
                    //创建对象,加入数组
                    book b1=new book(bid,bname,bprice,bauthor);
                    array[count]=b1;
                    count++;
                    System.out.println("添加成功");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("无图书数据！");
                        break;
                    }
                    //遍历所有已经存入的图书
                    for(int i=0;i<count;i++){
                        book b2=array[i];//count赋给i,数组的数据赋给对象
                        System.out.println("编号为："+b2.id+"，书名为："+b2.name+"，作者为："+b2.author+"，价格为："+b2.price+"。");
                    }
                    break;
                case 3:
                    System.out.println("请输入要查询的图书编号:");
                    int searchid=sc.nextInt();
                    boolean find = false;//标记是否找到图书，初始为没有找到
                    for(int i=0;i<count;i++){
                        if(array[i].id==searchid){
                            book b3=array[i];
                            System.out.println("找到图书：编号："+b3.id+"，书名为:"+b3.name+"，作者为："+b3.author+"，价格为："+b3.price+"。");
                            find=true;
                            break;
                        }
                    }
                    if(!find){//此语句无法运行
                        System.out.println("没有找到这本书！");
                    }
                    break;//case中断
                case 4:
                    System.out.println("输入要删除的图书编号：");
                    int delid=sc.nextInt();
                    boolean finddel=false;//标记是否有要删除的图书
                    for(int i=0;i<count;i++){
                        if(array[i].id==delid){
                            //删除思路，删除元素后面的所有元素向前覆盖一位
                            for(int j=i;j<count-1;j++){
                                //假设有四本书，有效下标为4-1=3，超出会赋值null给前一个元素
                                array[j]=array[j+1];
                            }
                            array[count-1]=null;//最后一个位置为空
                            count--;//下标减一
                            finddel=true;
                            System.out.println("图书删除成功！");
                            break;
                        }
                    }
                    if(!finddel){//此语句无法运行
                        System.out.println("没有找到这本书，删除失败！");
                    }
                    break;
                case 0:
                    System.out.println("系统退出！");
                    sc.close();
                    return;
                default:
                    System.out.println("选择错误，请重新选择");
                    break;
            }
        }
    }
}