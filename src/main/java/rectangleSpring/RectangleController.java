package rectangleSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RectangleController {

  @Autowired
  private RectangleService rectangleService;

  @GetMapping("/rectangle/area")
  public double getArea(@RequestParam double length, @RequestParam double width) {
    return rectangleService.calculateArea(length, width);
  }

  @GetMapping("/rectangle/perimeter")
  public double getPerimeter(@RequestParam double length, @RequestParam double width) {
    return rectangleService.calculatePerimeter(length, width);
  }
}