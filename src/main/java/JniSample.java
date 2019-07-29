package main.java;

public class JniSample {

    public native int sum(int num1,int num2);

    public static void main(String []args){
        System.loadLibrary("main.java.JniSample");
        JniSample sample=new JniSample();
        int result=sample.sum(5,7);
        System.out.println("result: "+result);
    }
}
