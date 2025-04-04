import org.code.theater.*;
import org.code.media.*;

public class RocketScene extends Scene {

  private rocket[] car;
  private int qty;
  private double value;

  public RocketScene(rocket[] car) {
    this.car = car;
    this.qty = 0;
    this.value = 0.0;
  }


  /* Draws the whole scene with the car and ball animations

    precondition: car.size() > 1
    postcondition: the theater displays all the cars

    @param: none
    @return: none
  */
  private void drawCars() {
    drawBackground();
    
      for (int x = 0; x < 275; x += 20) {
        //the car is rotated 90 degrees to imitate an air dribble
        drawImage(car[0].getImage(), x, car[0].getY(), car[0].getSize(), 90);
        //the ball
        drawImage(car[1].getImage(), x, car[1].getY() - 75, car[1].getSize(), 90);
        //Draws background again so it doesn't show a million cars/balls on the screen at the same time
        drawBackground();
      } 

    //What happens when the car scores
      setTextHeight(48);
    setTextColor("red");
    drawText("Goal!!!!!", 125, 150);
    playSound("goal.wav");

    //draws the goal explosion
    drawImage("maxresdefault.jpg", 125,165, 175);

    //moves the car
    drawImage(car[0].getImage(), 175, car[0].getY()+75, car[0].getSize());

    //does the taunt
    horseDash();
  }

  /* Draws the background

    precondition: images.jpg is a thing
    postcondition: the theater displays the background

    @param: none
    @return: none
  */
  private void drawBackground() {
    pause(0.2);
    clear("black");
    
    drawImage("images.jpg", 0, 125, 400);

  }

  //Draws the scene
  public void createScene() {
    pause(1);
    drawCars();
  }


  /* This is a taunt called a horsedash, it basically moves the car forward and backwards, so we just rotated the image back and forth
  * We had to make sure to still draw the background so there's not a million images of the car at the same time
  */
  private void horseDash(){
     for (int z = 0; z < 24; z += 1) {
       //The if statements are to determine which orientation the car should be in
      if (z%2 == 0){
        drawBackground();
      drawText("Goal!!!!!", 125, 150);
      drawImage("maxresdefault.jpg", 125,165, 175);
      drawImage(car[0].getImage(), 175, car[0].getY()+75, car[0].getSize(), 20);
      }
      if (z%2 == 1){
        drawBackground();
      drawText("Goal!!!!!", 125, 150);
      drawImage("maxresdefault.jpg", 125,165, 175);
      drawImage(car[0].getImage(), 175, car[0].getY()+75, car[0].getSize(), 340);
      }
    }
  }
  
}