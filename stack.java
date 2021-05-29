class MyStack{
  private int top;
  private int[] arr;
  private int capacity;

  //Intialize the stack
  MyStack(int size){
    capacity = size;
    arr = new int[capacity];
    top = -1;
  }

  // isEmpty
  boolean isEmpty(){
    return top == -1; 
  }

  // isFull
  boolean isFull(){
    return top == capacity-1;
  }

  // push to enter the element
  void push(int element){
    if(isFull()){
      System.out.println("Overflow can't add more");
      System.exit(1);
    }
    top++; 
    arr[top] = element;   
  }

  // pop to remove the element
  int pop(){
    if(isEmpty()){
      System.out.println("Stack Is Empty");
      System.exit(1);
    }
    return arr[top--];
  }

  // peek
  int peek(int pos){
    return arr[pos];
  }

  // size
  int size(){
    return top+1;
  }

  //print
  void printStack(){
    for(int i=0;i<=top;i++){
      System.out.println(arr[i]);
    }
  }
}


class stack{
  public static void main(String[] args) {
    MyStack myStack = new MyStack(5);
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    myStack.pop();
    myStack.printStack();
  }
}

