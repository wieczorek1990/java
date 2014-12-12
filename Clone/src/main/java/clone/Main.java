package clone;

import clone.Data;

class Main {
  public static void main(String[] args) {
    Data data = new Data("test");
    Data clone = new Data(data);
    if (data == clone) {
      System.out.println("Same object");
    } else {
      System.out.println("Different object");
    }
    if (data.equals(clone)) {
      System.out.println("Same data");
    } else {
      System.out.println("Different data");
    }
  }
}
