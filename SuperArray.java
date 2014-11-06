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
    String a = "[ ";
    for(int i = 0; i < size; i++){
      a += data[i] + " ";
    }
    a += "]";
    return a;
  }
  public void resize(){
    Object[] temp = new Object[size];
    for(int i = 0; i < temp.length; i++){
      temp[i] = data[i];
    }
    data = new Object[size + 10];
    for(int i = 0; i < temp.length; i++){
      data[i] = temp[i];
    }
    emptyspace += 10;
  }
  public int Size(){
    return size;
  }
  public Object get(int i){
    if(get > size - 1){
      return "null";
    }
    else{
      return data[get];
    }
  }
  public Object remove(int i){
    Object a = get(int i);
    if(a == "null"){
      return "null";
    }
    else{
      a = data[i];
      data[i] = "null";
      return a;
    }
  }
  public Object set(Object o, int i){
    Object b = remove(int i);
    if(b == "null"){
      return "null";
    }
    else{
      data[i] = o;
      return b;
    }
  }
  public void add(Object o, int i){
    if(index > size){
      if(emptyspace != 0){
        data[size] = o;
        size++;
        emptyspace --;
      }
      else{
        resize();
        data[size] = o;
        size++;
        emptyspace --;
      }
    }
    else if(index < 0){
      
    }
    else{
      for(int i = index; i < size; i++){
        
      }
    }
  }
}
