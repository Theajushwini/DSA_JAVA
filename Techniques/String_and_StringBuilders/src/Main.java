public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String a="teju";
        String b="teju";
        System.out.println(a==b);//returns true
        String c=new String("Teju");
        String d=new String("Teju");
        System.out.println(c==d);
        // returns false since new objects are created using new keyword and comparsion is based on objects

        System.out.println(c.equals(d));
        //returns true since this is purely values based comparsion
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }

}