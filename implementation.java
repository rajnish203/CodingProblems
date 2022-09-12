import java.util.Scanner;
public class implementation {
    private int data[];
    private int topIndex;
    public implementation(int size){
        data=new int [size];
        topIndex=-1;
    }
    public void push(int element){
        if(topIndex==data.length-1){
            System.out.print("Stack overflow");
        }
        data[++topIndex]=element;
    }
    public int peek(){
        if(topIndex==-1){
            return 0;
        }
        return topIndex+1;
    }
    public int size(){
        return topIndex+1;
    }
    public int pop(){
        if(topIndex==-1){
            return 0;
        }
        int temp=data[topIndex];
        topIndex--;
        return temp;
    }
    public  boolean isEmpty(){
        if(topIndex==-1){
            return true;
        }
        return false;
    }
    public static void display( int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={1,2,3,4,6,7};
        int n=arr.length;
        implementation stack=new implementation(n);
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        System.out.print(stack.pop());
        s.close();
        stack.push(10);
        System.out.print(stack.pop());

    }

}
