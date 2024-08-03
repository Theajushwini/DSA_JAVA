package Fucntions;

import java.util.Arrays;

public class shadowing {

    public static void main(String[] args) {
        fun(74);
        System.out.println( sum(3,4,3));
        demo("Array","Kunal");
        demo(3,4,5,6);
    }
    static void fun(int a){
        System.out.println(a);
        System.out.println("This is first one");
    }

    static void fun(String name){
        System.out.println("HI "+name);
    }
    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
