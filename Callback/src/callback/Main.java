package callback;

import callback.Caller;
import callback.Callback;

class Main {
  public static void main(String[] args) {
    new Caller(new Callback() {
      @Override
      public void call() {
        System.out.println("It works!");
      }
    });
  }
}
