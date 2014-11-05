public class SuperArray{
  protected Object[] data;
  private int size;
  public SuperArray(){
    data = new Object[100];
    size = 200;
  }
  public SuperArray(int i){
    data = new Object[i];
    size = 2*i;
  }
  public void add(Object x){
    
  }
}
