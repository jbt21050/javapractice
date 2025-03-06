import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<Integer>();
    
    scores.add(1);
    scores.add(5);
    scores.add(10);
    scores.add(15);
  
    for(int score : scores) {
      System.out.println(score);
    }
  }
}