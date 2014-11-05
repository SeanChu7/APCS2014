public class SuperArray{
  protected Object[] data;
  private int size;
  private int emptyspace;
  public SuperArray(){
    data = new Object[100];
    size = 0;
    emptyspace = 100;
  }
  public SuperArray(int i){
    data = new Object[i];
    size = 0;
    emptyspace = i;
  }
  public String toString(){
    String a = "[";
    for(int i = 0; i < data.length; i++){
      a += data[i] + " ";
    }
    a += "]";
    return a;
  }
  public void resize(){
    data = new Object[size + 10];
    emptyspace += 10;
  }
  public void add(Object o){
    if(emptyspace != 0){
      data[size] = o;
    }
    else{
      resize();
      data[size] = o;
    }
  }
}
