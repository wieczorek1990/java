package polygons;

import polygons.Polygon;
import polygons.Square;
import polygons.Triangle;

class Main {
  public static void main(String[] args) {
    Polygon[] polygons = { new Square(), new Triangle() };
    for (Polygon polygon : polygons) {
      System.out.println(polygon);
    }
  }
}
