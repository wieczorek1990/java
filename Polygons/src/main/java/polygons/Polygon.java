package polygons;

import polygons.SideCountable;

abstract class Polygon implements SideCountable {
  public String toString() {
    return String.format("Type: %s%nSides count: %d%n", getClass().getName(), sidesCount());
  }
}
