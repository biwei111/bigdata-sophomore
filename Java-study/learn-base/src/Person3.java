public class Person3 {
    //练习：人饲养动物.两者分开定义
    private String name;
    private int age;

    public Person3() {

    }

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public void keepPet(Dog2 dog,String something){
//        System.out.println(age+"岁的"+name+"的饲养员在饲养一只"+
//                dog.getColor()+"颜色的"+dog.getAge()
//                +"岁的狗，狗在吃"+something+"。");
//    }
//    public void keepPet(Cat2 cat,String something){
//        System.out.println(age+"岁的"+name+"的饲养员在饲养一只"+
//                cat.getColor()+"颜色的"+cat.getAge()
//                +"岁的猫，猫在吃"+something+"。");
//    }
    public void keepPet(Animal3 a, String something) {
        if (a instanceof Dog2 d) {
            System.out.println(age + "岁的" + name + "的饲养员在饲养一只" +
                    d.getColor() + "颜色的" + d.getAge()
                    + "岁的狗，狗在吃" + something + "。");
        } else if (a instanceof Cat2 c) {
            System.out.println(age + "岁的" + name + "的饲养员在饲养一只" +
                    c.getColor() + "颜色的" + c.getAge()
                    + "岁的猫，猫在吃" + something + "。");
        }else if(a instanceof Duck d1){
            System.out.println(age + "岁的" + name + "的饲养员在饲养一只" +
                    d1.getColor() + "颜色的" + d1.getAge()
                    + "岁的鸭子，狗在吃" + something + "。");
        } else{
            System.out.println("动物类型错误");
        }
    }
}