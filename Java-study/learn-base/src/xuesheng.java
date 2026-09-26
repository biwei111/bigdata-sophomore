public class xuesheng {
    //Javabean
    private String name;
    private int age;
    private String gender;
    public xuesheng(){

    }
    public xuesheng(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public String getname() {
        return name;
    }
    public int getage() {
        return age;
    }
    public String getgender() {
        return gender;
    }
}
