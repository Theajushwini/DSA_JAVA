import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
     float a=453.1299662f;
       // System.out.printf("Formatted from of the number is %.3f",a);
       // System.out.printf("pie is %.3f",Math.PI);
        //System.out.printf("Hi I am %s and I am %s","Teju","Sad");
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("teju"+new ArrayList<>());//If an object toString method is called<------|
        System.out.println("teju"+new Integer(56));//-----------------------------------------|
        //throws and error since '+' is for primitives and when one among the two or more operations inside sout is string System.out.println(new Integer(56)+new ArrayList<>());
    }
}
