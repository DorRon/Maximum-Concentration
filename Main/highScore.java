import java.util.ArrayList;

public class highScore{
    
    public void userName(String name){
        System.out.println(name);
    }
    
    public void users(String name){
        ArrayList<String>gamerTags = new ArrayList<String>();
        gamerTags.add(name);
    }
    
   public void scores(int clicks){
        ArrayList<int>userScores = new ArrayList<int>();
        userScores.add(clicks);
        System.out.println(clicks);
   } 
}