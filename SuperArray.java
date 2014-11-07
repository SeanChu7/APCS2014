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
	if(i > size - 1){
		return "null";
	}
	else{
		return data[i];
	}
  }
  public Object remove(int i){
	Object a = get(i);
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
	Object b = remove(i);
	if(b == "null"){
		return "null";
	}
	else{
		data[i] = o;
		return b;
	}
  }
  public void add(Object o, int p){
	if(p > size){
		if(emptyspace != 0){
		  data[size] = o;
		}
		else{
		  resize();
		  data[size] = o;
		}
		size++;
		emptyspace--;
	}
	else if(p< 0){
	}
	else{
		for(int i = size - 1; i > p; i--){
			if(emptyspace != 0){
				data[i + 1] = data[i];
			}
			else{
			  resize();
			  data[i + 1] = data[i];
			}
		}
		data[p] = o;
		size++;
		emptyspace--;
	}
  }
  public static void main(String[] args){
	SuperArray a = new SuperArray(3);
	a.add("Yo",500);
	int i = 0;
	while(i < 10){
		a.add(i,500);
		i++;
	}
	Object p = a.toString();
	System.out.println(p + "\n");
	p = a.get(500);
	System.out.println(p + "\n");
	p = a.get(1);
	System.out.println(p + "\n");
	a.remove(5);
	p = a.toString();
	System.out.println(p + "\n");
  }
}
