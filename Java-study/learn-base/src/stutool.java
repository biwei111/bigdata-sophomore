import java.util.ArrayList;
public class stutool {
    private stutool(){

    }
    public static double getmaxage(ArrayList<xuesheng> list){
        double maxage=list.get(0).getage();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getage()>maxage){
                maxage=list.get(i).getage();
            }
        }
        return maxage;
    }
}

