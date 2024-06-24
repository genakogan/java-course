public class Stack1 {
    private int[] data;
    private int top1;

    public Stack1(){
        top1=-1;
        data = new int[10];
    }
    public void push(int value){
        if(top1 == data.length-1){
            int [] temp = new int [data.length + 5];
            System.arraycopy(data,0,temp,0,data.length);
            data =temp;
        }
        data[++top1]=value;
    }
    public boolean isEmpty(){
        return top1==-1;
    }
}
