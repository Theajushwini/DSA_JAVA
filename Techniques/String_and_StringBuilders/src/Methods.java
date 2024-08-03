import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Theajushwini Sasikumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());//name is unchanged since string are immutable
        System.out.println(name);
        //.strip()
        System.out.println("    TEJU   ".strip());//whitespaces are removed

        System.out.println(Arrays.toString(name.split(" ")));

    }
}
