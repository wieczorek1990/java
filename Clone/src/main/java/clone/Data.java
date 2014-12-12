package clone;

class Data {
  private String data;

  public Data(String data) {
    this.data = data;
  }

  public Data(Data data) {
    this(data.getData());
  }

  public String getData() {
    return this.data;
  }

  /**
   * Bez tego to nie ma sensu, bo obiekty niezmienne (immutable) nie
   * potrzebują konstruktora do kopiowania. (Można użyć tego samego)
   */
  public void setData(String data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object object) {
    return this.data.equals(((Data) object).getData());
  }
}
