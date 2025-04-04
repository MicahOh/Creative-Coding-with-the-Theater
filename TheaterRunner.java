import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

     rocket[] league = { new Carrr("Fennec", "THEcar.png"), new Carrr("Ball", "balz.png")};

    RocketScene myScene = new RocketScene(league);

    myScene.createScene();

    Theater.playScenes(myScene);

    
    
    
  }
}