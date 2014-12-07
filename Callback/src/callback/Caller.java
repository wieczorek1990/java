package callback;

import callback.Callback;

class Caller {
  public Caller(Callback callback) {
    callback.call();
  }
}
