package rectangleSpring;
import org.springframework.stereotype.Service;

@Service
public class RectangleService {

  public double calculateArea(double length, double width) {
    Rectangle rectangle = new Rectangle(length, width);
    return rectangle.getArea();
  }

  public double calculatePerimeter(double length, double width) {
    Rectangle rectangle = new Rectangle(length, width);
    return rectangle.getPerimeter();
  }
}