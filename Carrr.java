import org.code.theater.*;
import org.code.media.*;

public class Carrr extends rocket {

  private String car;

  public Carrr(String car, String image) {
    super(image);
    this.car = car;
  }
  
  public String getCar() {
    return car;
  }
  
}