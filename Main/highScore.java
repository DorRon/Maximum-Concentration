import java.util.ArrayList;

public class highScore{
    
    public void userName(String name){
        System.out.println(name);
    }
    
    ArrayList<String>gamerTags = new ArrayList<String>();    
    public void users(String name){
        gamerTags.add(name);
    }
   
   ArrayList<Integer>userScores = new ArrayList<Integer>();     
   public void scores(int clicks){
        userScores.add(clicks);
        System.out.println(clicks);
   } 
   
}